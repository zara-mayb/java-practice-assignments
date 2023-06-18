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
	<h1>EDIT</h1>
	<form:form action="/edit/${burger.id}" mode="put" modelAttribute="burger">
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