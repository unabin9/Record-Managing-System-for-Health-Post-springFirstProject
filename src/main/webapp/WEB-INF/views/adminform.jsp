<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@taglib  uri="http://www.springframework.org/tags/form"  prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

 <link href='resources/cssmenu/styles.css' rel='stylesheet'>
  <div class="navbar">
  <a href="${pageContext.request.contextPath}/mainpage">Home</a>
</div> 

<head>
	<meta charset="UTF-8">
	<title>AdminForm</title>
	<link rel="stylesheet" href="resources/cssmenu/formStyle.css">
</head>


<body style="background-image:url(resources/cssmenu/bg.jpg); background-position:center;
  background-repeat: no-repeat;
  background-size: cover; width:100%;">

<spring:form action="adminSignup" method="post" modelAttribute="amodel">
<table>		
<div class="container">
  <div class="title">Add Admin</div>
  <p> ${message} </p>
  <div class="sub-container">
    <div class="form">
      <label class="label">First Name :</label>
      <input type="text" class="input" name="fname" required> 
   </div>
   <div class="form">
      <label class="label">Last Name :</label>
      <input type="text" class="input" name="lname" required> 
   </div>
   <div class="form">
      <label class="label">Address:</label>
      <input type="text" class="input" name="address" required> 
   </div>
    <div class="form">
      <label class="label">Email :</label><br>
      <input type="email" class="input" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" name="email" required>
    </div>
	<div class="form">
      <label class="label">Login Id :</label>
      <input type="text" class="input" name="loginid" required> 
   </div>
   <div class="form">
      <label class="label">Password:</label>
      <input type="password" class="input" name="password" required> 
   </div>
    <div class="form">
      <label class="label">Mobile No :</label><br>
      <input type="tel" class="input" name="mobileno" 
      pattern="[9]{1}[7-8]{1}[0-9]{8}"
       required >
    </div>
    <div> <button class="btn" type="submit">Save</button></div>
  </div>
</div>
</table>
</spring:form>
</body>
</html>