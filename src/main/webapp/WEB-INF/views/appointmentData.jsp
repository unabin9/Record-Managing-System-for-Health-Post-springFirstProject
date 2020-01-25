<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	
    <link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap.css">
    
    <script  type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"></script>

<title>AppointmentData</title>
</head>
<body>

	<table id="myTable" class="table table-stripted">

		<thead>
			<tr class="success">
				<td>SN</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Disease</td>
				<td>Gender</td>
				<td>Blood Group</td>
				<td>Doctor Name</td>
				<td>Appointment Date</td>
				<td>Time</td>
				<td>Address</td>
				<td>Action</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="app" items="${alist}">

				<tr class="danger">
					<td>${app.id}</td>
					<td>${app.pfname}</td>
					<td>${app.plname}</td>
					<td>${app.disease}</td>
					<td>${app.gender}</td>
					<td>${app.pbgroup}</td>
					<td>${app.doctorname}</td>
					<td>${app.appointmentdate}</td>
					<td>${app.time}</td>
					<td>${app.address}</td>
					<td>
					    <input type="submit" class="btn btn-success" onclick="editApp(${app.id})" value="Edit">
					    <input type="submit" class="btn btn-danger" onclick="deleteApp(${app.id})" value="Delete">
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	
	<script type="text/javascript">
	
	  function editApp(id){
		  window.location = "${pageContext.request.contextPath}/"+id+"/editAppointment";
	  }
	
	
	  function deleteApp(id){
		  
		  var msg = confirm("do you want to delete?");
		  if(msg == true){
		       window.location = "${pageContext.request.contextPath}/"+id+"/deleteAppointment";
		  }
	  }
	  
	  $(document).ready(function() {
		    $('#myTable').DataTable();
		} );
	
	</script>
	
</html>
