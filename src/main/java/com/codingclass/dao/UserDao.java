package com.codingclass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codingclass.connection.JdbcConnector;
import com.codingclass.enti.UserDetail;

public class UserDao {

	public int insert(UserDetail userDetail ) throws SQLException {
		
		Connection con = JdbcConnector.getConnection();
		
		
		    String query = "INSERT into USER_DETAIL (Name ,password, dob ,address ,gender, country) values(?,?,?,?,?,?)";
		    
		    PreparedStatement psmt = con.prepareStatement(query);
		   
		  
		   psmt.setString(1,userDetail.getName());
		   psmt.setString(2,userDetail.getPassword());
		   psmt.setString(3, userDetail.getDob());
		   psmt.setString(4, userDetail.getAddress());
		   psmt.setString(5,userDetail.getGender());
		   psmt.setString(6,userDetail.getCountry());		
		   psmt.execute();
		return 1;
	}
	
	public static  UserDetail edit(int id) throws SQLException {
		
		
		
		Connection con = JdbcConnector.getConnection();
	    			
		String query = "select * from user_detail where id=?";
		
		PreparedStatement preparedStatement=con.prepareStatement(query);
		
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		
		UserDetail userDetail= new UserDetail();
		
		if(resultSet.next()) {
			
			userDetail.setId(resultSet.getInt(1));
			userDetail.setName(resultSet.getString(2));
			userDetail.setPassword(resultSet.getString(3));
			userDetail.setDob(resultSet.getString(4));
			userDetail.setAddress(resultSet.getString(5));
			userDetail.setGender(resultSet.getString(6));
			userDetail.setCountry(resultSet.getString(7));
		}
		
	    
		return userDetail ;
		
		
	}
	
}
