<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Update Page</title>
<link rel="stylesheet" href="./style/forum.css">
</head>
<body>
	<% 
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
	%>

	<form action="update" method="post">
	<table>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" name="uid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%= email %>"></td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td><input type="text" name="phone" value="<%= phone %>"></td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><input type="text" name="uname" value="<%= userName %>"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="pass" value="<%= password %>"></td>
		</tr>
	</table>
		
		<input type="submit" name="submit" value="Update">
	</form>
</body>
</html>