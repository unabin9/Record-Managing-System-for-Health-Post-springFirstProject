<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	
    <link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap.css">
    
    <script  type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"></script>

<title>ReceptionistData</title>
</head>
<body>

	<table id="myTable" class="table table-stripted">

		<thead>
			<tr class="success">
				<td>SN</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Disease</td>
				<td>Doctor Name</td>
				<td>Appointment Date</td>
				<td>Appointment Time</td>
				<td>Mobile No</td>
				<td>Blood Group</td>
				
			</tr>
		</thead>

		<tbody>
			<c:forEach var="app" items="${a1list}">

				<tr class="danger">
					<td>${app.id}</td>
					<td>${app.pfname}</td>
					<td>${app.plname}</td>
					<td>${app.disease}</td>
					<td>${app.doctorname}</td>
					<td>${app.appointmentdate}</td>
					<td>${app.time}</td>
					<td>${app.mobileno}</td>
					<td>${app.pbgroup}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	
	<script type="text/javascript">
	  
	  $(document).ready(function() {
		    $('#myTable').DataTable();
		} );
	
	</script>
	
</html>
