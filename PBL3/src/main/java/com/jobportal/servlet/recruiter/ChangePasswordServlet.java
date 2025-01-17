package com.jobportal.servlet.recruiter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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

@WebServlet("/recruiter-change-password")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/recruiter/changePassword.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String newPassword = request.getParameter("password");
		String confPassword = request.getParameter("confPassword");
		if (newPassword != null && confPassword != null && newPassword.equals(confPassword)) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal?useSSL=false", "root",
						"782004tuanloc");
				PreparedStatement pst = con.prepareStatement("update recruiters set upwd = ? where id = ? ");
				pst.setString(1, newPassword);
			
				Recruiters user = (Recruiters) session.getAttribute("recruiter");
				int id = user.getId();
				
				pst.setInt(2, id);

				int rowCount = pst.executeUpdate();
				if (rowCount > 0) {
					request.setAttribute("status", "resetSuccess");
					RecruitersDAO userDAO = new RecruitersDAO();
					Recruiters u = userDAO.selectRecruiter(id);
					session.setAttribute("recruiter", u);
					response.sendRedirect("/PBL3/recruiter-home");
				} else {
					request.setAttribute("status", "resetFailed");
//					dispatcher = request.getRequestDispatcher("/views/login/login.jsp");
					response.sendRedirect("/PBL3/recruiter-home");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			request.setAttribute("status", "resetFailed");
			response.sendRedirect("/PBL3/recruiter-home");
		}
	}

}
