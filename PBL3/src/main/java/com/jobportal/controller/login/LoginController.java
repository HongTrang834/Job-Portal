package com.jobportal.controller.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobportal.DAO.RecruitersDAO;
import com.jobportal.DAO.UsersDAO;
import com.jobportal.model.Recruiters;
import com.jobportal.model.Users;
import com.mysql.cj.xdevapi.Result;

@WebServlet(urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/login/login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uemail = request.getParameter("username");
		String upwd = request.getParameter("password");
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;

		if (uemail == null || uemail.equals("")) {
			request.setAttribute("status", "invalidEmail");
			dispatcher = request.getRequestDispatcher("/views/login/login.jsp");
			dispatcher.forward(request, response);
		}
		if (upwd == null || upwd.equals("")) {
			request.setAttribute("status", "invalidUpwd");
			dispatcher = request.getRequestDispatcher("/views/login/login.jsp");
			dispatcher.forward(request, response);
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal?useSSl=false", "root",
					"782004tuanloc");
			PreparedStatement pst1 = con.prepareStatement("select * from users where uemail = ? and upwd = ?");
			pst1.setString(1, uemail);
			pst1.setString(2, upwd);

			ResultSet rs1 = pst1.executeQuery();
			
			PreparedStatement pst2 = con.prepareStatement("select * from recruiters where uemail = ? and upwd = ?");
			pst2.setString(1, uemail);
			pst2.setString(2, upwd);

			ResultSet rs2 = pst2.executeQuery();

			if (rs1.next()) {
				if ("admin@gmail.com".equals(uemail)) {
	                response.sendRedirect("/PBL3/admin-home");
				} else {
				UsersDAO userDAO = new UsersDAO();
				Users user = userDAO.getUserByEmail(uemail);
				session.setAttribute("user", user);
				response.sendRedirect("/PBL3/user-home");
				}
			} else if (rs2.next()) {
				RecruitersDAO userDAO = new RecruitersDAO();
				Recruiters user = userDAO.getUserByEmail(uemail);
				session.setAttribute("recruiter", user);
				response.sendRedirect("/PBL3/recruiter-home");
			}
			else {
				request.setAttribute("status", "failed");
				dispatcher = request.getRequestDispatcher("/views/login/login.jsp");
			}

			dispatcher.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
