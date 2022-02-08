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
	<!--   			"id": "5",
                    "name": "Pizza HUt",
                    "price": 999,
                    "active": true,
                    "dateOfLaunch": "14/03/2017",
                    "category": "Main Course",
                    "freeDelivery": true  -->
    <button style="position:absolute; right:20px; top:30px;" type="button" ><a href="user">Cart</a></button>       
	<center>
	<h2 style="color:blue; font-size:25px">MenuItem Details</h2>
	<button type="button" style="width:100px; background-color:lightBlue">
	<a href="addnewMenuItem">Add MenuItem</a></button>
		<table>
			<tr style="background-color:Blue; color:white; font-size:20px">
				<th>ID</th>
				<th>Name</th>
				<th>Price</th>
				<th>active</th>
				<th>category</th>
				<th>freeDelivery</th>
				<th>Action</th>
			</tr>
			<c:forEach var="e" items="${MenuItemList}">
				<tr style="background-color:#eee; text-align:center ">
					<td >${e.id}</td>
					<td>${e.name}</td>
					<td>${e.price}</td>
					<td>${e.active}</td>
					<td>${e.category}</td>
					<td>${e.freeDelivery}</td>
					<td><a href="http://localhost:8080/addCartItem/${uid}/cart/${cid}/${e.id}">Add to Cart</a>&nbsp;</td>
				</tr>
			</c:forEach>
			
		</table>
	</center>
</body>
</html>