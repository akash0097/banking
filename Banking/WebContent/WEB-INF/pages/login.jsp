<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank: Home</title>
</head>

<body>

	<%@include file="includes/header.html"%>
	<%@include file="includes/body.html"%>
	<div class="bodyContent">
		<h1>Welcome ${username}</h1>
		<div class="row">
			<div class="col-sm-3">image</div>
			<div class="col-sm-5">
					<legend>User Login</legend>
				 	<form action="${pageContext.request.contextPath}/home" method="post" <%-- commandName="user" --%>>
					
					<label>User name:</label>
					<input type="text" class="form-control" name="username" placeholder="User Name" requried="true"/><br>
					
					<label>Password:</label>
					<input type="password" class="form-control" name="password" placeholder="Password" requried="true"/><br>
				
					<button type="button" class="btn btn-default" style="float: left;" onclick="getSignUpPage()">Sign Up</button> 
			    
			    	<button type="submit" class="btn btn-default" style="float: right;">Login</button>
				</form>
			</div>
			<div class="col-sm-3">image</div>
		</div>
  </div>
  
	<%@include file="includes/footer.html"%>
</body>
</html>