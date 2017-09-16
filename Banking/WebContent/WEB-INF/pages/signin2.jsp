

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information Details</title>
</head>
<body>
<%@include file="includes/header.html"%>
	<div class="bodyContent">
	<h1>Personal Details</h1>
		<div class="row">
			<div class="col-sm-3">image</div>
			<div class="col-sm-5">
				<form action="${pageContext.request.contextPath}/home" method="post" commandName="user">
					<label>Enter Adhaar Card No:</label>
					<input type="number" class="form-control" path="Adhaar Card No" placeholder="Adhaar Card No" size="10" requried/><br>
					<label>Enter Pan Card No:</label>
					<input type="number" class="form-control" path="Pan Card No" placeholder="Pan Card No" size="10" requried/><br>
					<label>Type Of Work:</label>
					 <input list="Works" name="Works">
  						<datalist id="Works">
  							<option value="Private Sector">
  							<option value="Public Sector">
  							<option value="Government Sector">
    						<option value="Business">
    						<option value="Self-Employed">
   						 	<option value="Professional">
   						 	<option value="Retired">
   						 	<option value="Others">
  						</datalist>
					
					
				<label>Source Of Income:</label>
					 <input list="Income" name="Income">
  						<datalist id="Income">
    						<option value="Business">
    						<option value="Labour">
   						 	<option value="Service">
   						 	<option value="Salary">
   						 	<option value="Others">
  						</datalist>
					
							
					<label>Annual Salary:</label>
					 <input list="Salary" name="Salary">
  						<datalist id="Salary">
    						<option value="Below 1 lakh">
    						<option value="1 lakh to 5 lakh">
   						 	<option value="5 lakh to 15 lakh">
   						 	<option value="Above 15 lakh">
  						</datalist>
					
					<label>Financial Assets:</label>
						<input list="FAssets" name="FAssets">
  						<datalist id="FAssets">
    						<option value="correct values dalna h">
    						<option value="1 lakh to 5 lakh">
   						 	<option value="5 lakh to 15 lakh">
   						 	<option value="Above 15 lakh">
  						</datalist>
					

					<label>Nominee:</label>
						<input list="Nominee" name="Nominee">
  						<datalist id="Nominee">
    						<option value="Father">
    						<option value="Mother">
   						 	<option value="Brother">
   						 	<option value="Sister">
   						 	<option value="Husband">
  						</datalist>
										
					
					
				<input type="Submit" class="btn btn-default" style="float: right;" name="Submit"/>
				</form>
			</div>
			<div class="col-sm-3">image</div>
		</div>
  </div>

<%@include file="includes/footer.html"%>

</body>
</html>