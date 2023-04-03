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


public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("id");
        int ID = Integer.parseInt(n);	
        out.println(ID);
        
        try {
			 UserDetail userDetail = UserDao.edit(ID);
			
			
			out.println("<!doctype html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "  <head>\r\n"
					+ "    <!-- Required meta tags -->\r\n"
					+ "    <meta charset=\"utf-8\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
					+ "\r\n"
					+ "    <!-- Bootstrap CSS -->\r\n"
					+ "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n"
					+ "\r\n"
					+ "    <title>Hello, world!</title>\r\n"
					+ "  </head>\r\n"
					+ "  <body>\r\n"
					+ "  \r\n"
					+ "\r\n"
					+ "\r\n"
					+ "<div class=\"container\" > \r\n"
					+ "\r\n"
					+ "<div class=\"row border\">\r\n"
					+ "<div class=\"col-3\"></div>\r\n"
					+ "<div class=\"col-6\">\r\n"
					+ "<h1 class=\"text-center\"  > Register Here</h1>\r\n"
					+ " \r\n"
					+ "<form action=\"UpdateDetail?id="+userDetail.getId() +"\" method=\"post\">\r\n"
					+ "\r\n"
					+ "  <div class=\"form-group\">\r\n"
					+ "    <label for=\"exampleInputPassword1\">Name</label>\r\n"
					+ "    <input type=\"text\" value="+userDetail.getName() +"   name=\"name\" value=\"hanuman\" class=\"form-control\" required=\"required\" id=\"exampleInputPassword1\" placeholder=\"Name\">\r\n"
					+ "  </div>\r\n"
					+ "    <div class=\"form-group\">\r\n"
					+ "    <label for=\"exampleInputPassword1\">Password</label>\r\n"
					+ "    <input type=\"password\" value="+userDetail.getPassword()+" name=\"password\" class=\"form-control\" required=\"required\" id=\"exampleInputPassword1\" placeholder=\"Password\">\r\n"
					+ "  </div>\r\n"
					+ "  \r\n"
					+ "  \r\n"
					+ "    <div class=\"form-group\">\r\n"
					+ "    <label for=\"exampleInputPassword1\">DOB</label>\r\n"
					+ "    <input type=\"text\" name=\"dob\" value="+userDetail.getDob()+" class=\"form-control\" required=\"required\" id=\"exampleInputPassword1\" placeholder=\"dd/mm/yyyy\">\r\n"
					+ "  </div>\r\n"
					+ "  \r\n"
					+ "    <div class=\"form-group\">\r\n"
					+ "    <label for=\"Address\">Address</label>\r\n"
					+ "    <textarea type=\"text\" name=\"address\"  class=\"form-control\" required=\"required\" id=\"Address\" placeholder=\"Address\" >"+userDetail.getAddress()+"</textarea>\r\n"
					+ "  </div>\r\n"
					+ "  \r\n"
					+ "\r\n"
					+ "     <div class=\"container \">\r\n"
					+ "     <div clas=\"row\">\r\n"
					+ "     \r\n"
					+ "     <div class=\"col-2\" >\r\n"
					+ "     <label>Gender</label>\r\n"
					+ "     </div>\r\n"
					+ "     <div class=\"col-5\">\r\n");
					if(userDetail.getGender().equals("male") ) {
					out.println( "     male: <input type=\"radio\" name=\"gender\" checked value="+userDetail.getGender() +">\r\n"
					+ "     </div>\r\n"
					+ "     <div class=\"col-5\">\r\n"
					+ "     Female:<input type=\"radio\" name=\"gender\" value=\"female\">\r\n"
					+ "     </div>\r\n"
					+ "     </div>\r\n"
					+ "     \r\n");}
					 else {
							out.println( "     male: <input type=\"radio\" name=\"gender\" value=\"male\">\r\n"
									+ "     </div>\r\n"
									+ "     <div class=\"col-5\">\r\n"
									+ "     Female:<input type=\"radio\" name=\"gender\" checked value="+userDetail.getGender() +">\r\n"
									+ "     </div>\r\n"
									+ "     </div>\r\n"    //value="+userDetail.getCountry()+"
									+ "     \r\n");}
					
					out.println( "     <div class=\"form-group\">\r\n"
					+ "     <label>Country:</label>\r\n"
					+ "     <select name=\"country\"  value="+userDetail.getCountry()+" class=\"form-control\" id=\"country\">\r\n"
					+ "        <option  selected=\"selected\">" +userDetail.getCountry()+"</option>\r\n"
					
		 			+ "    </select>\r\n"
					+ "     </div>\r\n"
					+ "     \r\n"
					+ "\r\n"
					+ "     \r\n"
					+ "     </div>\r\n"
					+ "\r\n"
					+ " <div class=\"text-center\">\r\n"
					+ "  <button type=\"submit\" class=\"btn btn-primary \">Update</button>\r\n"
					+ "  </div>\r\n"
					+ "</form>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "</div>\r\n"
					+ "</div>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "</div>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "    <!-- Optional JavaScript -->\r\n"
					+ "    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n"
					+ "    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n"
					+ "    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n"
					+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n"
					+ "  </body>\r\n"
					+ "</html>");
			
			
			
			
			
			out.println("<h1>hello</h1>");
		} catch (SQLException e1) {
			
			
			out.println("our");
			e1.printStackTrace();
		}

		
	}

}
