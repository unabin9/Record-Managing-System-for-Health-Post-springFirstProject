<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	
    <link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap.css">
    
    <script  type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"></script>

<title>Nurse Data</title>
</head>
<body>

	<table id="myTable" class="table table-stripted">

		<thead>
			<tr class="success">
				<td>SN</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Mobile No</td>
				<td>Email</td>
				<td>Blood Group</td>
				<td>Gender</td>
				<td>Joining Date</td>
				<td>Address</td>
				<td>Action</td>
				
			</tr>
		</thead>

		<tbody>
			<c:forEach var="nur" items="${nlist}">

				<tr class="danger">
					<td>${nur.id}</td>
					<td>${nur.fname}</td>
					<td>${nur.lname}</td>
					<td>${nur.mobileno}</td>
					<td>${nur.emailid}</td>
					<td>${nur.bgroup}</td>
					<td>${nur.gender}</td>
					<td>${nur.joiningdate}</td>
					<td>${nur.address}</td>
					<td>
					    <input type="submit" class="btn btn-success" onclick="editNur(${nur.id})" value="Edit">
					    <input type="submit" class="btn btn-danger" onclick="deleteNur(${nur.id})" value="Delete">
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	
	<script type="text/javascript">
	
	  function editNur(id){
		  window.location = "${pageContext.request.contextPath}/"+id+"/editNurse";
	  }
	
	
	  function deleteNur(id){
		  
		  var msg = confirm("do you want to delete?");
		  if(msg == true){
		       window.location = "${pageContext.request.contextPath}/"+id+"/deleteNurse";
		  }
	  }
	  
	  $(document).ready(function() {
		    $('#myTable').DataTable();
		} );
	
	</script>
	
</html>
