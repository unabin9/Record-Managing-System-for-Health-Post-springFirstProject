<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib  uri="http://www.springframework.org/tags/form"  prefix="spring" %>

<html>

<head>
	<meta charset="UTF-8">
	<title>patient form</title>
	<link rel="stylesheet" href="resources/cssmenu/formStyle.css">
</head>


<body style="background-image:url(resources/cssmenu/bg.jpg); background-position:center;
  background-repeat: no-repeat;
  background-size: cover; width:100%;">

 <link href='resources/cssmenu/styles.css' rel='stylesheet'>
  <div class="navbar">
  <a href="${pageContext.request.contextPath}/mainpage">Home</a>
</div> 

<spring:form action="patientForm" method="post" modelAttribute="pmodel">
<table>	
<div class="container">
  <div class="title">Add Patient Data</div>
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
      <label class="label">Email Id:</label><br>
      <input type="text" class="input" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" name="emailid" placeholder="example@email.com" required>
    </div>
	 
    <div class="form">
      <label class="label">Blood Group:</label><br>
      <input type="text" class="input" name="bgroup" required>
    </div> 
  
    <div class="form">
      <label class="label">Mobile No :</label><br>
      <input type="tel" class="input" pattern="[9]{1}[7-8]{1}[0-9]{8}" name="mobileno" required>
    </div>
    
    
     <div class="form">
      <label class="label">Gender:</label>
      <select class="input" name="gender" placeholder="--select--" required>
      <option>---Select---</option>
      <option>Male</option>
      <option>Female</option>
      <option>Other</option>     
      </select>
   </div>
   
   <div class="form">
      <label class="label">Date of Birth:</label>
      <input type="date" class="input" name="dob" required> 
   </div>
   
   <div class="form">
      <label class="label">Age:</label>
      <input type="number" class="input" name="age" required> 
   </div>
    
     <div class="form">
      <label class="label">Joining Date:</label>
      <input type="date" class="input" name="joiningdate" required> 
   </div>
   
   <div class="form">
      <label class="label">Disease:</label>
      <textarea class="input" name="disease" rows="4" cols="8" required></textarea>
   </div>
   
     <div class="form">
      <label class="label">City:</label>
      <input type="text" class="input" name="city" placeholder="Kathmandu" required> 
   </div>
    
     <div class="form">
      <label class="label">Address:</label>
      <input type="text" class="input" name="address" placeholder="Baneshwor" required> 
   </div>
    
    <div> <button class="btn" type="submit">Save</div>
  </div>
</div>
</table>
</spring:form>
</body>
</html>