package com.jobportal.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobportal.DAO.UsersDetailDAO;
import com.jobportal.model.Users;
import com.jobportal.model.UsersDetail;

@WebServlet(urlPatterns = { "/user-resume" })
public class UsersDetailServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsersDetailDAO uDAO;

	public UsersDetailServlet() {
		this.uDAO = new UsersDetailDAO();
	}

	public void init() {
		uDAO = new UsersDetailDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			HttpSession session = request.getSession();
			Users user = (Users) session.getAttribute("user");
			int id = user.getId();

			UsersDetail u = uDAO.selectUserDetail(id);

			request.setAttribute("userDetail", u);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/user/resume.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
