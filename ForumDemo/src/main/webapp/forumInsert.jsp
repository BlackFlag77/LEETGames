<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forum Form</title>
<link rel="stylesheet" href="./style/forum.css">
</head>
<body>

	<fieldset>
    <legend><h1>Add a Post</h1></legend>
	<form action="fInsert" method="post">
		<table>
			<tr>
				<td>Title</td>
				<td><input type="text" name="tid" required></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><input type="text" name="des" required></td>
		 </table>

		<input type="submit" name="submit" value="Post"> <br>
	</form>
	
	<form action="forumMenu.jsp" method="post">
		<input type="submit" name="submit" value="Back"> <br>
	</form>
	</fieldset>
	
</body>
</html>