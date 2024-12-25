package com.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stat = null;
	private static ResultSet rs = null;	
	
	//Login validation
	public static boolean validate(String userName, String password){
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from user where username='"+userName+"' and password='"+password+"'";
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Get user details
	public static List<User> getUser(String userName){
		ArrayList<User> userList = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from user where username='"+userName+"'";
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				User u1 = new User(id, name, email, phone, userU, passU);
				userList.add(u1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	
	//Insert user registration details
	public static boolean insertUser(String name, String email, String phone, String username, String password) {
		isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "insert into user values (0, '"+name+"', '"+email+"', '"+phone+"', '"+username+"', '"+password+"')";
			int rs = stat.executeUpdate(sql);
			
			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Update user details
	public static boolean updateUser(String id, String name, String email, String phone, String username, String password) {
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "update user set name='"+name+"', email='"+email+"', phone='"+phone+"', username='"+username+"', password='"+password+"' where uId='"+id+"'";
			int rs = stat.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Retrieving user details
	public static List<User> getUserDetails(String Id) {
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<User> use = new ArrayList<>();
		
		try {

			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from user where uId='"+convertedID+"'";
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				User u = new User(id, name, email, phone, username, password);
				
				use.add(u);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return use;
	}
	
	//Deleting user account
	public static boolean deleteUser(String id) {

		int convId = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "delete from user where uId='" + convId + "'";
			int rs = stat.executeUpdate(sql);
			
			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}
