package com.forum;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.user.DBConnect;

public class ForumDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stat = null;
	private static ResultSet rs = null;	
	
	//Insert forum details
	public static boolean insertForum(String title, String description) {
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "insert into forum values (0, '"+title+"', '"+description+"')";
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
	
	//Update forum details
	public static boolean updateForum(String fid, String title, String description) {
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "update forum set title='"+title+"', description='"+description+"' where fid='"+fid+"'";
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
	
	//deleting forums
	public static boolean deleteForum(String fid) {

		int convId = Integer.parseInt(fid);
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "delete from forum where fid='" + convId + "'";
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
	
	//Retrieving forum details
	public static List<Forum> getPostDetails(String tid) {
		
		ArrayList<Forum> forum = new ArrayList<>();
		
		try {
	
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from forum where title='"+tid+"'";
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				int fid = rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				
				Forum f = new Forum(fid, title, description);
				
				forum.add(f);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return forum;
	}
	
	//Retrieving forum details for a id
	public static List<Forum> getMyForumDetails(String Id) {
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Forum> forum = new ArrayList<>();
		
		try {

			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from forum where fid='"+convertedID+"'";
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				int fid = rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				
				Forum f = new Forum(fid, title, description);
				
				forum.add(f);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return forum;
	}
	
	//Display all forums
	public static List<Forum> getAllForums(){
		ArrayList<Forum> forumList = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from forum";
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				int fid = rs.getInt(1);					//rs.getInt("fid");
				String title = rs.getString(2);			//rs.getString("title");
				String description = rs.getString(3);	//rs.getString("description");
				
				Forum f = new Forum(fid, title, description);
				forumList.add(f);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return forumList;
	}
}