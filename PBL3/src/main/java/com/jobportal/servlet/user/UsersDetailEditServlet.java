package com.jobportal.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobportal.DAO.UsersDetailDAO;
import com.jobportal.model.UsersDetail;

@WebServlet(urlPatterns = { "/user-detail-edit" })
public class UsersDetailEditServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsersDetailDAO usersDetailDAO;

	public void init() {
		usersDetailDAO = new UsersDetailDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			UsersDetail existingUser = usersDetailDAO.selectUserDetail(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/user/userDetailForm.jsp");
			request.setAttribute("userDetail", existingUser);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
