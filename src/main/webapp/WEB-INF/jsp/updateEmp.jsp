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
	<!--   			"id": "5",
                    "name": "Pizza HUt",
                    "price": 999,
                    "active": true,
                    "dateOfLaunch": "14/03/2017",
                    "category": "Main Course",
                    "freeDelivery": true  -->
	<center>
	<h2 style="color:blue; font-size:25px">Update Employee</h2>
		<form:form modelAttribute="MenuItem" method="post" action="/update">
			<table>
			<tr>
				<td>MenuItem ID: </td><td><form:input path="id"/> </td>
			</tr>	
			<tr>
				<td>Name:</td><td><form:input path="name"/> </td>
			</tr>
			<tr>
				<td>price:</td><td><form:input path="price"/> </td>
			</tr>
			<tr>
				<td>active:</td><td><form:checkbox path="active"/> </td>
			</tr>
			<tr>
				<td>dateOfLaunch:</td><td><form:input type="text" path="dateOfLaunch" /> </td>
			</tr>
			<tr>
				<td>category:</td><td><form:input path="category" /> </td>
			</tr>
			<tr>
				<td>freeDelivery:</td><td><form:checkbox path="freeDelivery" /> </td>
			</tr>
			<input type="submit" value="update"/>
			</table>
		</form:form>
	</center>
</body>
</html>