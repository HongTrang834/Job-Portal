package com.jobportal.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobportal.DAO.UsersDetailDAO;
import com.jobportal.model.Users;
import com.jobportal.model.UsersDetail;

@WebServlet(urlPatterns = { "/user-detail-insert" })
public class UsersDetailInsertServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UsersDetailDAO userDetailDAO;
	
	public UsersDetailInsertServlet() {
		this.userDetailDAO = new UsersDetailDAO();
	}

	public void init() {
		userDetailDAO = new UsersDetailDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String category = request.getParameter("category");
			String country = request.getParameter("country");
			String workExperience = request.getParameter("workExperience");
			String education = request.getParameter("education");
			String professionalSkills = request.getParameter("professionalSkills");
			String img = request.getParameter("img");
			
			HttpSession session = request.getSession();
			Users user = (Users) session.getAttribute("user");
			int id = user.getId();
			
			UsersDetail newU = new UsersDetail(id, category, country, workExperience, education, professionalSkills, img);
			userDetailDAO.insertUser(newU);

			response.sendRedirect(request.getContextPath() + "/user-resume");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
