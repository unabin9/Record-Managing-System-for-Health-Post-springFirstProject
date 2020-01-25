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
				<td>Action</td>
				
			</tr>
		</thead>

		<tbody>
			<c:forEach var="doc" items="${dlist}">

				<tr class="danger">
					<td>${doc.id}</td>
					<td>${doc.fname}</td>
					<td>${doc.lname}</td>
					<td>${doc.address}</td>
					<td>${doc.emailid}</td>
					<td>${doc.specialist}</td>
					<td>${doc.mobileno}</td>
					<td>
					    <input type="submit" class="btn btn-success" onclick="editDoc(${doc.id})" value="Edit">
					    <input type="submit" class="btn btn-danger" onclick="deleteDoc(${doc.id})" value="Delete">
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	
	<script type="text/javascript">
	
	  function editDoc(id){
		  window.location = "${pageContext.request.contextPath}/"+id+"/editDoctor";
	  }
	
	
	  function deleteDoc(id){
		  
		  var msg = confirm("do you want to delete?");
		  if(msg == true){
		       window.location = "${pageContext.request.contextPath}/"+id+"/deleteDoctor";
		  }
	  }
	  
	  $(document).ready(function() {
		    $('#myTable').DataTable();
		} );
	
	</script>
	
</html>
