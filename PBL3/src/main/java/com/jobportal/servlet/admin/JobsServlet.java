package com.jobportal.servlet.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/admin-job" })
public class JobsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private JobsDAO jobsDAO;
//
//	public JobsServlet() {
//		this.jobsDAO = new JobsDAO();
//	}
//
//	public void init() {
//		jobsDAO = new JobsDAO();
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
//			List<Jobs> listJob = jobsDAO.selectAllJobs();
//			request.setAttribute("listJob", listJob);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/admin/job.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
//			List<Jobs> listJob = jobsDAO.selectAllJobs();
//			request.setAttribute("listJob", listJob);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/admin/job.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
