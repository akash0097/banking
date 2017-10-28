<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
	<div class="bodyContent">
		<h1>Welcome ${username}</h1>
		<div class="row">
			<div class="col-sm-3">
			
				<div class="list-group">
				<div class="panel panel-primary" >
				<div class="panel-heading" align="center">Menu</div>
					<a href="#" class="list-group-item">My Profile</a> 
					<a href="#"class="list-group-item">Transaction</a>
					<a href="#"class="list-group-item">Recharge</a>
					<a href="#" class="list-group-item">Transfer</a> 
					<a href="#"class="list-group-item">Edit Account</a>
					<a href="#"class="list-group-item">Create Loan</a>
					<a href="#" class="list-group-item">Debit Card Details</a> 
					<a href="#"class="list-group-item">Credit Card Details</a>
					<a href="#"class="list-group-item">What's New</a>
					<a href="#" class="list-group-item">Help</a> 
					<a href="#"class="list-group-item">FAQ'S</a>
					<a href="#"class="list-group-item">About Us</a>
				</div>
			</div>
		</div>	
			 
		 <div class="col-sm-5">
		 	<div class="panel panel-primary">
   				<div class="panel-heading">Account Summary</div>
			<table>
			<tr>
			<td><label>User Name:</label></td>
			</tr>
			<tr>
			<td><label>Account Number:</label></td>
			</tr>
			<tr>	
			<td><label>Account Type:</label></td>	
			</tr>
			<tr>
			<td><label>Current Balance:</label></td>	
			</tr>
			</table>	
			</div>
		</div>
		
		 <div class="col-sm-5">
		 	<div class="panel panel-primary">
   				<div class="panel-heading">Quick Access</div>
			<table> 
			<tr>
			<td>My Profile</td>
			<td>Transaction</td>
			<td>Recharge</td>
			</tr>
			<tr>
			<td>Edit Account</td>
			<td>Create Loan</td>
			<td>Card Details</td>
			</tr>
			</table>	
			</div>
		</div>	
		
			<div class="col-sm-3">
			<div>Advertise</div>
			</div>
		</div>
	</div>

	</body>
	<%@include file="includes/footer.html"%>
	
</html>