<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StudentReg</title>
</head>

<body>
	<h2>Add Student Information...</h2>

	<a href="students.html">List of Student</a>

	<form:form method="POST" action="save.html">

		<table>

			<tr>
				<td><form:label path="id">Student ID:</form:label></td>
				<td><form:input path="id" value="${student.id}" readonly="true" /></td>
			</tr>

			<tr>
				<td><form:label path="fname">Student FName:</form:label></td>
				<td><form:input path="fname" value="${student.fname}" /></td>
			</tr>

			<tr>
				<td><form:label path="lname">Student LName:</form:label></td>
				<td><form:input path="lname" value="${student.lname}" /></td>
			</tr>

			<tr>
				<td><form:label path="email">Student Email:</form:label></td>
				<td><form:input path="email" value="${student.email}" /></td>
			</tr>

			<tr>
				<td><form:label path="address">Student Address:</form:label></td>
				<td><form:input path="address" value="${student.address}" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>


		</table>
	</form:form>

	<c:if test="${!empty students}">
		<h2>List Student</h2>
		<table align="left" border="1">
			<tr>
				<th>Student ID</th>
				<th>Student FName</th>
				<th>Student LName</th>
				<th>Student Email</th>
				<th>Student Address</th>
				<th>Actions </th>
			</tr>

			<c:forEach items="${students}" var="student">
				<tr>

					<td><c:out value="${student.id}"></c:out></td>
					<td><c:out value="${student.fname}"></c:out></td>
					<td><c:out value="${student.lname}"></c:out></td>
					<td><c:out value="${student.email}"></c:out></td>
					<td><c:out value="${student.address}"></c:out></td>

					<td align="center"><a href="edit.html?id=${student.id}">Edit</a>
						| <a href="delete.html?id=${student.id}">Delete</a> <a
						href="email.html?id=${student.id}">Send email</a></td>

				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>