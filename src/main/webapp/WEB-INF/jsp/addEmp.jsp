<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- private String id;
	private String name;
	private float price;
	private boolean active;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dateOfLaunch;
	private String category;
	private boolean freeDelivery; -->
	<center>
	<h2 style="color:blue; font-size:25px">Add Employee</h2>
		<form modelAttribute="menuItem" method="post" action="/addMenuItem">
			<table>
			<tr>
				<td>MenuItem ID: </td><td><input type="number" name="id" id="id"/> </td>
			</tr>	
			<tr>
				<td>Name</td><td><input type="text" name="name" id="name"/> </td>
			</tr>
			<tr>
				<td>price</td><td><input type="number" name="price" id="price"/> </td>
			</tr>
			<tr>
				<td>active</td><td><input type="checkbox" name="active" id="active"/> </td>
			</tr>
			<tr>
				<td>dateOfLaunch</td><td><input type="text" name="dateOfLaunch" id="dateOfLaunch" /> </td>
			</tr>
			<tr>
				<td>category</td><td><input type="text" name="category" id="category"/> </td>
			</tr>
			<tr>
				<td>freeDelivery</td><td><input type="checkbox" name="freeDelivery" id="freeDelivery"/> </td>
			</tr>
			<input type="submit" value="Add"/>
			</table>
		</form>
	</center>
</body>
</html>