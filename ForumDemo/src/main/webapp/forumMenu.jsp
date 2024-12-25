<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forum</title>
<link rel="stylesheet" href="./style/forum.css">
</head>
<body>
	
	<fieldset>
	<table>
		<tr>
			<th>Forum ID</th>
	        <th>Title</th>
	        <th>Description</th>
		</tr>
	
		<c:forEach var="forum" items="${forumDetails}">
		
		<tr>
			<td>${forum.fid}</td>
			<td>${forum.title}</td>
			<td>${forum.description}</td>
		</tr>
					
		</c:forEach>
	</table>
	
	<br><br>
	<a href="myPosts.jsp">
		<input type="button" name="myPosts" value="My Posts">
	</a>
	
	<a href="forumInsert.jsp">
		<input type="button" name="newPosts" value="Add New Posts">
	</a>
	
	<a href="home.jsp">
		<input type="button" name="home" value="Back">
	</a>
	</fieldset>
		
</body>
</html>