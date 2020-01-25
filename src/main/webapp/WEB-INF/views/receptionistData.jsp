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
				<td>Address</td>
				<td>Email</td>
				<td>Login Id</td>
				<td>Mobile No</td>
				<td>Action</td>
				
			</tr>
		</thead>

		<tbody>
			<c:forEach var="re" items="${rlist}">

				<tr class="danger">
					<td>${re.id}</td>
					<td>${re.fname}</td>
					<td>${re.lname}</td>
					<td>${re.address}</td>
					<td>${re.emailid}</td>
					<td>${re.loginid}</td>
					<td>${re.mobileno}</td>
					<td>
					    <input type="submit" class="btn btn-success" onclick="editRe(${re.id})" value="Edit">
					    <input type="submit" class="btn btn-danger" onclick="deleteRe(${re.id})" value="Delete">
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	
	<script type="text/javascript">
	
	  function editRe(id){
		  window.location = "${pageContext.request.contextPath}/"+id+"/editReceptionist";
	  }
	
	
	  function deleteRe(id){
		  
		  var msg = confirm("do you want to delete?");
		  if(msg == true){
		       window.location = "${pageContext.request.contextPath}/"+id+"/deleteReceptionist";
		  }
	  }
	  
	  $(document).ready(function() {
		    $('#myTable').DataTable();
		} );
	
	</script>
	
</html>
