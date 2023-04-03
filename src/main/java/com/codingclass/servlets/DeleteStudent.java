package com.codingclass.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingclass.connection.JdbcConnector;


public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String string = request.getParameter("id");
		
		
		int id = Integer.parseInt(string);
		
		
		try {
			   Connection con = JdbcConnector.getConnection();
			
			String query = "DELETE FROM user_detail WHERE id= "+ id + ";";
			
			Statement statement = con.createStatement();
			statement.execute(query);
			
			response.sendRedirect("http://localhost:8082/codingclass/AllDetails");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
