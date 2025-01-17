package com.jobportal.servlet.user;

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

import com.jobportal.DAO.UsersDAO;
import com.jobportal.model.Users;

@WebServlet("/user-change-password")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/user/changePassword.jsp");
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
				PreparedStatement pst = con.prepareStatement("update users set upwd = ? where id = ? ");
				pst.setString(1, newPassword);
			
				Users user = (Users) session.getAttribute("user");
				int id = user.getId();
				
				pst.setInt(2, id);

				int rowCount = pst.executeUpdate();
				if (rowCount > 0) {
					request.setAttribute("status", "resetSuccess");
					UsersDAO userDAO = new UsersDAO();
					Users u = userDAO.selectUser(id);
					session.setAttribute("user", u);
					response.sendRedirect("/PBL3/user-home");
				} else {
					request.setAttribute("status", "resetFailed");
//					dispatcher = request.getRequestDispatcher("/views/login/login.jsp");
					response.sendRedirect("/PBL3/user-home");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			request.setAttribute("status", "resetFailed");
			response.sendRedirect("/PBL3/user-home");
		}
	}

}
