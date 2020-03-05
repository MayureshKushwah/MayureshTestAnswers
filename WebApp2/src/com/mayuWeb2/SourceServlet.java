package com.mayuWeb2;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

public class SourceServlet extends HttpServlet {
	
//	@Override
//	public void init() throws ServletException {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			String url="jdbc:mysql://localhost:3306/ctspune";
//			Connection conn =(Connection) DriverManager.getConnection(url, "root", "root");
//			System.out.println("connection established");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}}
	
	//upper method is specific for mysql so for generalize we use this method 2
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			
		}
	
	
	

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Hello form SourceServlet");
	
}





}
