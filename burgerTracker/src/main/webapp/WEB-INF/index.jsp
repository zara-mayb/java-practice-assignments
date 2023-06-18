<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<h1>HELLO</h1>
	<table>
	<thead>
		<tr>
			<th>Burger Name</th>
			<th>Restaurant Name</th>
			<th>Rating (out of 5)</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="burger" items="${burgers}">
			<tr>
				<td><c:out value="${burger.burgerName}"/></td>
				<td><c:out value="${burger.restaurantName}"/></td>
				<td><c:out value="${burger.rating}"/></td>
				<td><a href="/edit/<c:out value="${burger.id}"/>">Edit </a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<h1>ENTER BURGER INFO</h1>
<form:form action="/add" mode="post" modelAttribute="burger">
	<div>
		<form:label path="burgerName">Burger Name:</form:label><br>
		<form:errors path="burgerName" class="text-danger"/>
		<form:input path="burgerName" style="width:250px;"/>
	</div>
	<div>
		<form:label path="restaurantName">Restaurant Name:</form:label><br>
		<form:errors path="restaurantName" class="text-danger"/>
		<form:input path="restaurantName" style="width:250px;"/>
	</div>
	<div>
		<form:label path="rating">Rating:</form:label><br>
		<form:errors path="rating" class="text-danger"/>
		<form:input path="rating" style="width:250px;"/>
	</div>
	<div>
		<form:label path="notes">Notes:</form:label><br>
		<form:errors path="notes" class="text-danger"/>
		<form:textarea path="notes" rows="3" style="width:250px;"/>
	</div>
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form:form>
</body>
</html>