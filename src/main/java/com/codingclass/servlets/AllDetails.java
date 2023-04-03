package com.codingclass.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingclass.connection.JdbcConnector;

/**
 * Servlet implementation class List
 */

public class AllDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			Connection connection = JdbcConnector.getConnection();

			String query = "select * from user_detail";

			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(query);

			out.println("<!doctype html>\r\n" + "<html lang=\"en\">\r\n" + "  <head>\r\n"
					+ "    <!-- Required meta tags -->\r\n" + "    <meta charset=\"utf-8\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
					+ "\r\n" + "    <!-- Bootstrap CSS -->\r\n"
					+ "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n"
					+ "\r\n" + "    <title>Hello, world!</title>\r\n" + "  </head>\r\n" + "  <body>\r\n");
					
					
					
					out.println("<!-- navbar -->\r\n"
							+ "\r\n"
							+ "<div class=\"container\">\r\n"
							+ "		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n"
							+ "			<a class=\"navbar-brand\" href=\"index.html\">coder class</a>\r\n"
							+ "			<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n"
							+ "				data-target=\"#navbarSupportedContent\"\r\n"
							+ "				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n"
							+ "				aria-label=\"Toggle navigation\">\r\n"
							+ "				<span class=\"navbar-toggler-icon\"></span>\r\n"
							+ "			</button>\r\n"
							+ "\r\n"
							+ "			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
							+ "				<ul class=\"navbar-nav mr-auto\">\r\n"
							+ "					<li class=\"nav-item active\"><a class=\"nav-link\" href=\"AllDetails\">ListAll\r\n"
							+ "							\r\n"
							+ "					</a></li>\r\n"
							+ "					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Li</a></li>\r\n"
							+ "					<li class=\"nav-item dropdown\"><a\r\n"
							+ "						class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n"
							+ "						role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n"
							+ "						aria-expanded=\"false\"> courses </a>\r\n"
							+ "						<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n"
							+ "							<a class=\"dropdown-item\" href=\"#\">Core Java</a> <a\r\n"
							+ "								class=\"dropdown-item\" href=\"#\">Servlet Jsp</a>\r\n"
							+ "							<div class=\"dropdown-divider\"></div>\r\n"
							+ "							<a class=\"dropdown-item\" href=\"#\">Hibernate</a>\r\n"
							+ "							<a class=\"dropdown-item\" href=\"#\">Spring Core</a>\r\n"
							+ "							<a class=\"dropdown-item\" href=\"#\">Spring mvc</a>\r\n"
							+ "						</div></li>\r\n"
							+ "					<li class=\"nav-item\"><a class=\"nav-link \" href=\"registrationpage.html\"\r\n"
							+ "						tabindex=\"-1\" aria-disabled=\"true\">Registration</a></li>\r\n"
							+ "				</ul>\r\n"
							+ "				<form class=\"form-inline my-2 my-lg-0\">\r\n"
							+ "					<input class=\"form-control mr-sm-2\" type=\"search\"\r\n"
							+ "						placeholder=\"Search\" aria-label=\"Search\">\r\n"
							+ "					<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n"
							+ "				</form>\r\n"
							+ "			</div>\r\n"
							+ "		</nav>\r\n"
							+ "\r\n"
							+ "");
					
					out.println( "    <h1 class='text-center'>All Student Details</h1>\r\n" + "\r\n");

			// fetch data
			out.println("<div class='container'> <table class=\"table\">\r\n" + "  <thead>\r\n" + "    <tr>\r\n" +" <th scope=\"col\">Sr NO</th>"
					+ "      <th scope=\"col\">id</th>\r\n" + "      <th scope=\"col\">Name</th>\r\n"
					+ "      <th scope=\"col\">address</th>\r\n" + "      <th scope=\"col\">DOB</th>\r\n"
					+ "      <th scope=\"col\">Gender</th>\r\n" + "      <th scope=\"col\">Country</th>\r\n"
					+ "      <th scope=\"col\">Action</th>\r\n" + "      <th scope=\"col\">Action</th>\r\n"
					+ "    </tr>\r\n" + "  </thead>\r\n");
            
			int i=1;
			while (set.next()) {
				out.println(

						"  <tbody>\r\n" + "    <tr>\r\n" + "    <th scope=\"row\">"+i+"</th>    <th scope=\"row\">" + set.getInt(1) + "</th>\r\n"
								+ "      <td>" + set.getString(2) + "</td>\r\n" + "      <td>" + set.getString(5)
								+ "</td>\r\n" + "      <td>" + set.getString(4) + "</td>\r\n" + "      <td>"
								+ set.getString(6) + "</td>\r\n" + "      <td>" + set.getString(7) + "</td>\r\n"

								+ "      <td><a href='Edit?id="+set.getInt(1)+" '<button  type=\"button\" class=\"btn btn-outline-success\">Edit</button> \r\n"
								+ "</td>\r\n"

								+ "      <td><a href='DeleteStudent?id=" +set.getInt(1)+ " '<button type=\"button\" class=\"btn btn-outline-danger\">Delete</button></td>\r\n"
								+ "    </tr>\r\n"

								+ "  </tbody>\r\n");
				  i++;

			}

			out.println(" \"</table></div>");

			out.println("    <!-- Optional JavaScript -->\r\n"
					+ "    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n"
					+ "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n"
					+ "    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n"
					+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n"
					+ "  </body>\r\n" + "</html>");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
