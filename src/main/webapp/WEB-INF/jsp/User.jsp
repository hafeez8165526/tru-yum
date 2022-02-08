<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--   			private String uId;
					private String name;
					private Cart cart;  -->
    <button style="position:absolute; right:0px; top:0px;" type="button" ><a href="http://localhost:8080">Home</a></button>       
	<center>
	<h2 style="color:blue; font-size:25px">User Details</h2>
	<button type="button" style="width:100px; background-color:lightBlue">
	<a href="addnewMenuItem">Add User</a></button>
		<table>
			<tr style="background-color:Blue; color:white; font-size:20px">
				<th>User ID</th>
				<th>Name</th>
				<th>Cart Id</th>
				<th>Cart</th>
				<th>Action</th>
			</tr>
			<c:forEach var="u" items="${user}">
				<tr style="background-color:#eee; text-align:center ">
					<td >${u.uId}</td>
					<td>${u.name}</td>
					<td><${u.getCart().getcId()} </td>
					<td><a href="${u.uId}/cart/${u.getCart().cId}" >cart link</a></td>
					
					<td><a href="/delete/${u.uId}">Delete</a>&nbsp;</td>
				</tr>
			</c:forEach>
			
		</table>
	</center>
</body>
</html>