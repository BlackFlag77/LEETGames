package com.forum;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForumDeleteServlet")
public class ForumDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("fid");
		boolean isTrue;

		isTrue = ForumDBUtil.deleteForum(id);
		
		if (isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("forumInsert.jsp");
			dis.forward(request, response);
		} else {
			
			List<Forum> forumDetails = ForumDBUtil.getMyForumDetails(id);
			request.setAttribute("forumDetails", forumDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("myForum.jsp");
			dis.forward(request, response);
		}
	}

}
