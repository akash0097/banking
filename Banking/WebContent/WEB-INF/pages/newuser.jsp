<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="includes/header.html"%>
	<div class="bodyContent">
	<h1>Personal Details</h1>
		<div class="row">
			<div class="col-sm-3">image</div>
			<div class="col-sm-5">
				<form:form action="${pageContext.request.contextPath}" method="post">
					<label>First name:</label>         			
					<form:input type="text" class="form-control" path="firstName" placeholder="First Name" requried="true" style="width: 153px; "/><br>
					<label>Last name:</label>
					<form:input type="text" class="form-control" path="lastName"  requried="true"/><br>
					<label>Date Of Birth(DOB):</label>
					<form:input type="text" class="form-control" path="Date Of Birth" placeholder="Date Of Birth" requried="ture"/><br>
					<label>Mobile No:</label>
					<form:input type="text" class="form-control" path="Mobile No" placeholder="Mobile No" size="10" requried="true"/><br>
					<label>Promotional Code</label>
					<form:input type="text" class="form-control" path="Promotional Code" placeholder="Promotional Code" size="5" requried="true"/><br>
					<label>Email Address:</label>
					<form:input type="email" class="form-control" path="Email Address" placeholder="Email Address" requried="true"/><br>
					<label> Re-Enter Email Address:</label>
					<form:input type="email" class="form-control" path="Re-Enter Email Address" placeholder="Re-Enter Email Address" requried="ture"/><br>
					
					<!-- Give the OTP nd one time password to user and then following steps  -->
					<label>Set UserName:</label>
					<form:input type="text" class="form-control" path="UserName" placeholder="UserName" requried="true"/><br>
					<label>Set Password:</label>
					<form:input type="password" class="form-control" path="Password" placeholder="Password" requried="true"/><br>
					<label>Re-Enter Password:</label>
					<form:input type="password" class="form-control" path="Password" placeholder="Password" requried="true"/><br>
					
					
					
					
				<button type="button" class="btn btn-default" style="float: right;">Next</button>
				</form:form>
			</div>
			<div class="col-sm-3">image</div>
		</div>
  </div>

<%@include file="includes/footer.html"%>

</body>

</html>