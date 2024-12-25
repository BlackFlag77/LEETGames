package com.forum;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForumUpdateServlet")
public class ForumUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fid = request.getParameter("fid");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		
		boolean isTrue = ForumDBUtil.updateForum(fid, title, description);
		
		if (isTrue == true) {
			
			List<Forum> forumDetails = ForumDBUtil.getPostDetails(title);
			request.setAttribute("forumDetails", forumDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("myForum.jsp");
			dis.forward(request, response);
		} else {
			
			List<Forum> forumDetails = ForumDBUtil.getPostDetails(title);
			request.setAttribute("forumDetails", forumDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("myForum.jsp");
			dis.forward(request, response);
		}
	}
}