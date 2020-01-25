 <html>
 <link href='resources/cssmenu/styles.css' rel='stylesheet'>
  <div class="navbar">
  <a href="${pageContext.request.contextPath}/mainpage">Home</a>
  <div class="dropdown"> 
   
   <div class="dropdown1">
    <button class="dropbtn1">Receptionist</button>
    <div class="dropdown-content1">
      <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </div>	
  </div>
   
	<div class="dropdown1">
    <button class="dropbtn1">Appointment</button>
    <div class="dropdown-content1">
      <a href="${pageContext.request.contextPath}/appointmentForm">Add Appointment</a>
      <a href="${pageContext.request.contextPath}/appointmentData">Appointment List</a>
    </div>	
  </div> 

<div class="dropdown1">
    <button class="dropbtn1">Doctor</button>
    <div class="dropdown-content1">
      <a href="${pageContext.request.contextPath}/readOnlyDoctorData">Doctor List</a>
    </div>	
  </div>
  
  <div class="dropdown1">
    <button class="dropbtn1">Patient</button>
    <div class="dropdown-content1">
      <a href="${pageContext.request.contextPath}/patientForm">Add Patient</a>
      <a href="${pageContext.request.contextPath}/patientData">Patient List</a>
    </div>	
  </div>
</div> 
</div> 
<h1 style="color: gold; text-align: center; text-decoration: underline;">RECORD KEEPING SYSTEM</h1>
<body style="background-image:url(resources/cssmenu/bg.jpg); background-position: center;
  background-repeat: no-repeat;
  background-size: cover; height:95%;">
  
 <img src="resources/cssmenu/pic.png" style=" display: block;
  margin-left: auto;
  margin-right: auto;
  margin-top: 5%;
  width: 50%;">
  
  </body>
  </html>