package com.jobportal.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobportal.DAO.UsersDAO;
import com.jobportal.DAO.UsersDetailDAO;
import com.jobportal.model.UsersDetail;

@WebServlet(urlPatterns = { "/user-detail-update" })
public class UsersDetailUpdateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UsersDetailDAO userDetailDAO;
	
	public UsersDetailUpdateServlet() {
		this.userDetailDAO = new UsersDetailDAO();
	}

	public void init() {
		userDetailDAO = new UsersDetailDAO();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int idUser = Integer.parseInt(request.getParameter("id"));
			String category = request.getParameter("category");
			String country = request.getParameter("country");
			String workExperience = request.getParameter("workExperience");
			String education = request.getParameter("education");
			String professionalSkills = request.getParameter("professionalSkills");
			String img = request.getParameter("img");
			UsersDetail newU = new UsersDetail(idUser, category, country, workExperience, education, professionalSkills, img);
			userDetailDAO.updateUser(newU);

			response.sendRedirect("/PBL3/user-resume");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
