<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@taglib  uri="http://www.springframework.org/tags/form"  prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

 <link href='${pageContext.request.contextPath}/resources/cssmenu/styles.css' rel='stylesheet'>

<head>
	<meta charset="UTF-8">
	<title>Patient EditForm</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/cssmenu/formStyle.css">
</head>


<body style="background-image:url(${pageContext.request.contextPath}/resources/cssmenu/bg.jpg); background-position:center;
  background-repeat: no-repeat;
  background-size: cover; width:100%;">

<spring:form action="${pageContext.request.contextPath}/updatePatient" method="post" modelAttribute="pmodel">
<table>		
<div class="container">
  <div class="title">Edit Patient</div>
  <div class="sub-container">
    <div class="form">
      <label class="label">First Name :</label>
      <spring:input class="input" path="fname"/>
   </div>
   <div class="form">
      <label class="label">Last Name :</label>
      <spring:input class="input" path="lname"/> 
   </div>
   <div class="form">
      <label class="label">Email Id:</label>
      <spring:input class="input" path="emailid"/> 
   </div>
    <div class="form">
      <label class="label">Blood Group :</label><br>
      <spring:input class="input" path="bgroup"/>
    </div>
	<div class="form">
      <label class="label">Mobile No :</label>
      <spring:input class="input" path="mobileno"/>
   </div>
     <div class="form">
      <label class="label">Gender:</label>
      <spring:input class="input" path="gender"/> 
   </div>
   <div class="form">
      <label class="label">Date of Birth:</label>
      <spring:input class="input" path="dob"/> 
   </div>
   <div class="form">
      <label class="label">Age:</label>
      <spring:input class="input" path="age"/> 
   </div>
   <div class="form">
      <label class="label">Joining Date:</label>
      <spring:input class="input" path="joiningdate"/> 
   </div>
    <div class="form">
      <label class="label">Disease:</label>
      <spring:input class="input" path="disease"/> 
   </div>
    <div class="form">
      <label class="label">City:</label>
      <spring:input class="input" path="city"/> 
   </div>
    <div class="form">
      <label class="label">Address:</label>
      <spring:input class="input" path="address"/> 
   </div>
    
    
    <div> <button class="btn" type="submit">Update</button></div>
  </div>
</div>
</table>

<spring:hidden path="id"/>

</spring:form>
</body>
</html>