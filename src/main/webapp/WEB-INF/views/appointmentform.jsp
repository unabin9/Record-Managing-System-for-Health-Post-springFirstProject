<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@taglib  uri="http://www.springframework.org/tags/form"  prefix="spring" %>

<html>

<head>
	<meta charset="UTF-8">
	<title>Appointment Form</title>
	<link rel="stylesheet" href="resources/cssmenu/formStyle.css">
</head>


<body style="background-image:url(resources/cssmenu/bg.jpg); background-position:center;
  background-repeat: no-repeat;
  background-size: cover; width:100%;">

 <link href='resources/cssmenu/styles.css' rel='stylesheet'>
  <div class="navbar">
  <a href="${pageContext.request.contextPath}/mainpage">Home</a>
</div> 

<spring:form action="appointmentForm" method="post" modelAttribute="amodel">
<table>	
<div class="container">
  <div class="title">Add Appointment</div>
  <p> ${message}</p>
  <div class="sub-container">
    <div class="form">
      <label class="label">First Name :</label>
      <input type="text" class="input" name="pfname" required> 
   </div>
   
   <div class="form">
      <label class="label">Last Name :</label>
      <input type="text" class="input" name="plname" required> 
   </div>
   
   <div class="form">
      <label class="label">Doctor Name :</label>
      <input type="text" class="input" name="doctorname" required> 
   </div>
	 
	 <div class="form">
      <label class="label">Mobile No :</label><br>
      <input type="tel" class="input" name="mobileno" pattern="[9]{1}[7-8]{1}[0-9]{8}" required>
    </div>
    
    
    <div class="form">
      <label class="label">Blood Group :</label><br>
      <input type="text" class="input" name="pbgroup" required>
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
      <label class="label">Appointment Date:</label>
      <input type="date" class="input" name="appointmentdate" id="datepicker" required>
      
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript">

$(function() {
    var date = new Date();
    var currentMonth = date.getMonth();
    var currentDate = date.getDate();
    var currentYear = date.getFullYear();
    $('#datepicker').datepicker({
    minDate: new Date(currentYear, currentMonth, currentDate)
    });
})

</script>
       
   </div>
   
   <div class="form">
      <label class="label">Time:</label>
      <input type="datetime" class="input" name="time" required> 
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
    <div> <button class="btn" type="submit">Save</button></div>
  </div>
</div>
</table>
</spring:form>
</body>
</html>