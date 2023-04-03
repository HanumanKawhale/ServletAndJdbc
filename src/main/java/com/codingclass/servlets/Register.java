package com.codingclass.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingclass.dao.UserDao;
import com.codingclass.enti.UserDetail;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String dob= request.getParameter("dob");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		
		UserDetail userDetail = new UserDetail();
		userDetail.setName(name);
		userDetail.setPassword(password);
		userDetail.setDob(dob);
		userDetail.setAddress(address);
		userDetail.setGender(gender);
		userDetail.setCountry(country);
		
		UserDao userDao = new UserDao();
		try {
			userDao.insert(userDetail);
			//
			//RequestDispatcher dispatcher = request.getRequestDispatcher("http://localhost:8082/codingclass/List");
		    //dispatcher.forward(request, response);
		    
		    System.out.println("hello");
			response.sendRedirect("http://localhost:8082/codingclass/AllDetails");
			System.out.println("thank");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	
	}
}
