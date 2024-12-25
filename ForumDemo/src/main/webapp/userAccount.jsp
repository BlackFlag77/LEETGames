<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	<!-- calling the java class from the jsp file -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Account</title>
<link rel="stylesheet" href="./style/forum.css">
</head>
<body>
	<fieldset>
	<table>
		
		<c:forEach var="use" items="${userDetails}">
		
		<c:set var="id" value="${use.id}"/>
		<c:set var="name" value="${use.name}"/>
		<c:set var="email" value="${use.email}"/>
		<c:set var="phone" value="${use.phone}"/>
		<c:set var="userName" value="${use.userName}"/>
		<c:set var="password" value="${use.password}"/>
		
		<tr>
			<td>User ID</td>
			<td>${use.id}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${use.name}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${use.email}</td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td>${use.phone}</td>
		</tr>
		<tr>
			<td>Username</td>
			<td>${use.userName}</td>
		</tr>
		<tr>
			<td>Password</td>
			<td>${use.password}</td>
		</tr>
		</c:forEach>
	</table>
	
	<c:url value="updateUser.jsp" var="userupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${userName}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<a href="${userupdate}">
		<input type="button" name="update" value="Edit Account">
	</a>
	
	<c:url value="deleteUser.jsp" var="userdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${userName}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<br>
	<a href="${userdelete}">
		<input type="button" name="delete" value="Delete Account">
	</a>
	</fieldset>
</body>
</html>