<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Students</title>
</head>
<link rel="stylesheet" type="text/css" href="/resources/css/mystyle.css">
<body>
<form action="logout" method="post">
<input type="submit" value="Logout"/>
</form>
<br>
<br>
<form action="addStudent" method="post">
		<input type="submit" value="Add Student">	
</form>

	<h1>List of Students</h1>
	<!-- <h3>
		<a href="add.html">Add More Employee</a>
	</h3> -->

	<c:if test="${!empty studentlist}">
		<table align="left" border="1">
			<tr>
				<th>Student ID</th>
				<th>Student Name</th>
				<th>Student Age</th>
				<th>Student Email</th>
				<th>Student Gender</th>
				<th>Student Country</th>
				<th>Actions</th>

			</tr>

			<c:forEach items="${studentlist}" var="student">
				<tr>
					<td><c:out value="${student.getIdStudent()}" /></td>
					<td><c:out value="${student.getName()}" /></td>
					<td><c:out value="${student.getAge()}" /></td>
					<td><c:out value="${student.getEmail()}" /></td>
					<td><c:out value="${student.getGender()}" /></td>
					<td><c:out value="${student.getCountry()}" /></td>
					
										
					<td align="center"><form action="edit" model method="post"><input type="hidden" name="id" value="${student.getIdStudent()}" />
					<input type="submit" value="EDIT" />
					</form></td>
					<td>
					<form action="delete" method="post"><input type="hidden" name="id" value="${student.getIdStudent()}"/>
					<input type="submit" value="DELETE" />
					</form>
					</td>

				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	
</body>

</html>