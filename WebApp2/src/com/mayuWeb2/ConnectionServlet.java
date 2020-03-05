package com.mayuWeb2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;


/**
 * Servlet implementation class ConnectionServlet
 */

public class ConnectionServlet extends HttpServlet {
	String user, password, url, driver;
	Connection con;

	@Override
	public void init(ServletConfig config) throws ServletException {
		user = config.getInitParameter("userName");
		password = config.getInitParameter("password");
		url = config.getInitParameter("url");
		driver = config.getInitParameter("driver");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getMethod().equals("GET")) {
			doGet(req, resp);
		} else {
			doPost(req, resp);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("name");
		String p = request.getParameter("password");
		String e = request.getParameter("email");
		String c = request.getParameter("salary");
		String query="insert into details values(?,?,?,?)";
		

		try {

			PreparedStatement ps;
			
			ps=con.prepareStatement(query);

			ps.setString(1, n);
			ps.setString(2, p);
			ps.setString(3, e);
			ps.setString(4, c);

			int i = ps.executeUpdate();
			if (i > 0)
				out.print("You are successfully registered...");

		} catch (Exception e2) {
			System.out.println(e2);
		}

		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From doPost method");
	}
}