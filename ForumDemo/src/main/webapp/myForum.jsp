<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Posts</title>
</head>
<body>
	<table>
		<tr>
			<th>Forum ID</th>
	        <th>Title</th>
	        <th>Description</th>
		</tr>
	
		<c:forEach var="forum" items="${forumDetails}">
		
		<c:set var="fid" value="${forum.fid}"/>
		<c:set var="title" value="${forum.title}"/>
		<c:set var="description" value="${forum.description}"/>
		
		<tr>
			<td>${fid}</td>
			<td>${title}</td>
			<td>${description}</td>
		</tr>
					
		</c:forEach>
	</table>
	
	<c:url value="forumUpdate.jsp" var="forumupdate">
		<c:param name="fid" value="${fid}"/>
		<c:param name="title" value="${title}"/>
		<c:param name="description" value="${description}"/>
	</c:url>
	
	<a href="${forumupdate}">
		<input type="button" name="update" value="Edit Post">
	</a>
	
	<c:url value="forumDelete.jsp" var="forumdelete">
		<c:param name="fid" value="${fid}"/>
		<c:param name="title" value="${title}"/>
		<c:param name="description" value="${description}"/>
	</c:url>
	
	<br>
	<a href="${forumdelete}">
		<input type="button" name="delete" value="Delete Post">
	</a>
	
</body>
</html>