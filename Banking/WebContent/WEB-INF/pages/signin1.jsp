
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN IN</title>
</head>
<body>
<%@include file="includes/header.html"%>
	<div class="bodyContent">
	<h1>Personal Details</h1>
		<div class="row">
			<div class="col-sm-3">image</div>
			<div class="col-sm-5">
				<form action="${pageContext.request.contextPath}/home" method="post" commandName="user">
					<label>First name:</label>         			
					<input type="text" class="form-control" path="firstName" placeholder="First Name" requried style="width: 153px; "/><br>
					<label>Last name:</label>
					<input type="text" class="form-control" path="lastName" placeholder="Last Name" requried/><br>
					<label>Date Of Birth(DOB):</label>
					<input type="date" class="form-control" path="Date Of Birth" placeholder="Date Of Birth" requried/><br>
					<label>Mobile No:</label>
					<input type="number" class="form-control" path="Mobile No" placeholder="Mobile No" size="10" requried/><br>
					<label>Promotional Code</label>
					<input type="text" class="form-control" path="Promotional Code" placeholder="Promotional Code" size="5" requried/><br>
					<label>Email Address:</label>
					<input type="email" class="form-control" path="Email Address" placeholder="Email Address" requried/><br>
					<label> Re-Enter Email Address:</label>
					<input type="email" class="form-control" path="Re-Enter Email Address" placeholder="Re-Enter Email Address" requried/><br>
					
					<!-- Give the OTP nd one time password to user and then following steps  -->
					<label>Set UserName:</label>
					<input type="text" class="form-control" path="UserName" placeholder="UserName" requried/><br>
					<label>Set Password:</label>
					<input type="password" class="form-control" path="Password" placeholder="Password" requried/><br>
					<label>Re-Enter Password:</label>
					<input type="password" class="form-control" path="Password" placeholder="Password" requried/><br>
					
					
					
					
				<button type="button" class="btn btn-default" style="float: right;">Next</button>
				</form>
			</div>
			<div class="col-sm-3">image</div>
		</div>
  </div>

<%@include file="includes/footer.html"%>

</body>
</html>