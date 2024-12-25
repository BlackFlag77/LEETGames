package com.forum;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForumInsert")
public class ForumInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("tid");
		String description = request.getParameter("des");
		
		boolean isTrue;
		
		isTrue = ForumDBUtil.insertForum(title, description);
		
		if (isTrue == true) {
			
			List<Forum> forumDetails = ForumDBUtil.getPostDetails(title);
			request.setAttribute("forumDetails", forumDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("myForum.jsp");
			dis.forward(request, response);
		} else {
			
			RequestDispatcher dis = request.getRequestDispatcher("forumInsert.jsp");
			dis.forward(request, response);
		}
	}
}