<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	
	<form action="register" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uid"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="psw"></td>
			</tr>
		</table>
		
		<input type="submit" name="submit" value="Register">
	</form>
	
	<a href="home.jsp">
		<input type="button" name="home" value="Back">
	</a>
</body>
</html>