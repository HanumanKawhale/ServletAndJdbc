package com.codingclass.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingclass.connection.JdbcConnector;


public class UpdateDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("id");
		out.println(n);
		//int id= Integer.parseInt(n);
		
		
		String name = request.getParameter("name");
		out.println(name);
		String password = request.getParameter("password");
		out.println(password);
		String dob= request.getParameter("dob");
		out.println(dob);
		String address = request.getParameter("address");
		out.println(address);
		String gender = request.getParameter("gender");
		out.println(gender);
		String country = request.getParameter("country");
        out.println(country);
		
		try {
			Connection con = JdbcConnector.getConnection();
			
			String query = "update user_detail set name=?,password=?,dob=?, address=?,gender=?,country=? where id="+n+";";
            
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1,name );
			psmt.setString(2, password);
			psmt.setString(3, dob);
			psmt.setString(4, address);
			psmt.setString(5, gender);
			psmt.setString(6, country);
			
		    int i= psmt.executeUpdate();
		    out.println(i);
			
			 
			
			
			response.sendRedirect("AllDetails");
			
		} catch (SQLException e) {
			out.print("error");
			e.printStackTrace();
		}
		
		
		
	}

}
