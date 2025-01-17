package com.jobportal.DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;

import javax.tools.Diagnostic;

import com.jobportal.model.Recruiters;
import com.jobportal.model.Users;

public class RecruitersDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/jobportal?useSSl=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "782004tuanloc";

	private static final String INSERT_USERS_SQL = "INSERT INTO recruiters " + "(uname, upwd, uemail, umobile) VALUES "
			+ "(?,?,?,?);";
	private static final String SELECT_USER_BY_ID = "select id,uname,upwd,uemail,umobile from recruiters where id=?";
	private static final String SELECT_ALL_USERS = "select * from recruiters";
	private static final String DELETE_USERS_SQL = "delete from recruiters where id = ?;";
	private static final String UPDATE_USERS_SQL = "update recruiters set uname = ?, upwd = ?, uemail = ?, umobile = ? where id = ?;";
	private static final String GET_USER_BY_EMAIL = "SELECT id, uname, upwd, umobile FROM recruiters WHERE uemail = ?";
	
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public Recruiters getUserByEmail(String email) throws SQLException {
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_EMAIL);) {
			try (PreparedStatement statement = connection.prepareStatement(GET_USER_BY_EMAIL)) {
				statement.setString(1, email);
				try (ResultSet rs = statement.executeQuery()) {
					if (rs.next()) {
						Recruiters user = new Recruiters();
						user.setId(rs.getInt("id"));
						user.setUname(rs.getString("uname"));
						user.setUemail(email);
						user.setUpwd(rs.getString("upwd"));
						user.setUmobile(rs.getString("umobile"));
						return user;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// create or insert user
	public void insertRecruiter(Recruiters recruiter) throws SQLException {
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);) {
			preparedStatement.setString(1, recruiter.getUname());
			preparedStatement.setString(2, recruiter.getUpwd());
			preparedStatement.setString(3, recruiter.getUemail());
			preparedStatement.setString(4, recruiter.getUmobile());

			System.out.println(preparedStatement);

			preparedStatement.executeUpdate(); // Execute the SQL statement
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// update user
	public boolean updateRecruiter(Recruiters recruiter) throws SQLException {
		boolean rowUpdate;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
			statement.setString(1, recruiter.getUname());
			statement.setString(2, recruiter.getUpwd());
			statement.setString(3, recruiter.getUemail());
			statement.setString(4, recruiter.getUmobile());
			statement.setInt(5, recruiter.getId());

			rowUpdate = statement.executeUpdate() > 0;
		}
		return rowUpdate;
	}

	// select user by id
	public Recruiters selectRecruiter(int id) {
		Recruiters recruiter = null;

		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				String uname = rs.getString("uname");
				String upwd = rs.getString("upwd");
				String uemail = rs.getString("uemail");
				String umobile = rs.getString("umobile");
				recruiter = new Recruiters(id, uname, upwd, uemail, umobile);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return recruiter;
	}

	// select users
	public List<Recruiters> selectAllRecruiters() {
		List<Recruiters> users = new ArrayList<>();

		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {

			System.out.println(preparedStatement);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String uname = rs.getString("uname");
				String upwd = rs.getString("upwd");
				String uemail = rs.getString("uemail");
				String umobile = rs.getString("umobile");
				users.add(new Recruiters(id, uname, upwd, uemail, umobile));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// delete users
	public boolean deleteRecruiter(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}
}
