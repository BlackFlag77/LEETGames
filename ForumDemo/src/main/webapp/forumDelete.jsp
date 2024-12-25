<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./style/forum.css">
</head>
<body>
	<% 
		String fid = request.getParameter("fid");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
	%>
	
	<fieldset>
	<form action="forumdelete" method="post">
		<table>
			<tr>
				<td>Forum ID</td>
				<td><input type="text" name="fid" value="<%= fid %>" readonly></td>
			</tr>
			<tr>
				<td>Title</td>
				<td><input type="text" name="title" value="<%= title %>" readonly></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><input type="text" name="desc" value="<%= description %>" readonly></td>
			</tr>
		</table>
		
		<input type="submit" name="submit" value="Delete">
	</form>
	</fieldset>
</body>
</html>