<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LEET Games</title>
<link rel="stylesheet" href="./style/forum.css">
</head>
<body>
	<header>
        <div>
           	<h1 class="header-title">LEET Games</h1>
	        <br>
	        <div class="header-buttons">
	        <form action="userRegistration.jsp" method="post">
	        	<input type="submit" value="Sign Up">
	    	</form>
	    	
	        <form action="login.jsp" method="post">
	        	<input type="submit" value="Login">
	    	</form>
	        </div>
        </div>
        <div class="main">
           <div class="nav">
           <nav class="topnav">
              <ul>
                 <li><a href="#">Home</a></li>
                 <li><a href="#">Game Store</a></li>
                 <li><a href="#">Game Menu</a></li>
                 <li><a href="#">News & Updates</a></li>
                 <li><a href="forumMenu.jsp">Forum</a></li>
                 <li><a href="#">Contact US</a></li>
                 <li><a href="#">About Us</a></li>
              </ul>
           </nav>
           </div>
        </div>
    </header>
</body>
</html>