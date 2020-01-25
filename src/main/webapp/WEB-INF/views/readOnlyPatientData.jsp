<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	
    <link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap.css">
    
    <script  type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"></script>

<title>PatientData</title>
</head>
<body>

	<table id="myTable" class="table table-stripted">

		<thead>
			<tr class="success">
				<td>SN</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Disease</td>
				<td>Blood Group</td>
				<td>Gender</td>
				<td>Age</td>
				<td>Joining Date</td>
				<td>Address</td>				
			</tr>
		</thead>

		<tbody>
			<c:forEach var="pat" items="${p1list}">

				<tr class="danger">
					<td>${pat.id}</td>
					<td>${pat.fname}</td>
					<td>${pat.lname}</td>
					<td>${pat.disease}</td>
					<td>${pat.bgroup}</td>
					<td>${pat.gender}</td>
					<td>${pat.age}</td>
					<td>${pat.joiningdate}</td>
					<td>${pat.address}</td>
					
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
