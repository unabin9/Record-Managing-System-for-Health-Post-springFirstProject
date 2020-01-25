<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	
    <link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap.css">
    
    <script  type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"></script>

<title>Doctor Data</title>
</head>
<body>

	<table id="myTable" class="table table-stripted">

		<thead>
			<tr class="success">
				<td>SN</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Address</td>
				<td>Email</td>
				<td>Specialist</td>
				<td>Mobile No</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="doc" items="${d1list}">

				<tr class="danger">
					<td>${doc.id}</td>
					<td>${doc.fname}</td>
					<td>${doc.lname}</td>
					<td>${doc.address}</td>
					<td>${doc.emailid}</td>
					<td>${doc.specialist}</td>
					<td>${doc.mobileno}</td>
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
