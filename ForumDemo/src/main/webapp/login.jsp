<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="./style/forum.css">
</head>
<body>
	<br>
	<fieldset>
    <legend><h1></h1></legend>
	<form action="log" method = "post">
		<table>
			<tr>
			<td>User Name</td>
			<td><input type = "text" name = "uId" placeholder="Enter username"></td>
			</tr>
			<tr>
			<td>Password</td>
			<td><input type = "password" name = "pwd" placeholder="Enter password"></td>
			</tr>
			
		</table> <br>
		
		<div class="button">
		<input type = "submit" name = "submit" value = "Log In">
		</div>
	</form>
	
	<div class="button">
	<a href="userRegistration.jsp">
		<input type="button" name="register" value="Sign Up">
	</a>
	</div>
	
	<div class="button">
	<a href="home.jsp">
		<input type="button" name="home" value="Back">
	</a>
	</div>
	</fieldset>
</body>
</html>