<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Student</title>
</head>
<body>
	<h1>List of Student</h1>
	<h3>
		<a href="add.html">Add More Student</a>
	</h3>

	<c:if test="${!empty students}">
		<table align="left" border="1">

			<tr>
				<th>Student ID</th>
				<th>Student FName</th>
				<th>Student LName</th>
				<th>Student Email</th>
				<th>Student Address</th>
			</tr>

			<c:forEach items="${students}" var="student">
				<tr>
					<td><c:out value="${student.id}"></c:out></td>
					<td><c:out value="${student.fname}"></c:out></td>
					<td><c:out value="${student.lname}"></c:out></td>
					<td><c:out value="${student.email}"></c:out></td>
					<td><c:out value="${student.address}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>