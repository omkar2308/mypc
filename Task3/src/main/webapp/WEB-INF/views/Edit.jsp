<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration from</title>
</head>
<body>
	<h2>Edit Data</h2>
	<form:form method="POST" action="actionEdit">
		<table>
			<tr>
				<td><form:label path="idStudent">Student ID:</form:label></td>
				<td><form:input path="idStudent" value="${Student.idStudent}"
						readonly="true"  /></td>
			</tr>
			<tr>
				<td><form:label path="Name">Student Name:</form:label></td>
				<td><form:input path="Name" value="${Student.Name}" /></td>
			</tr>
			<tr>
				<td><form:label path="Age">Student Age:</form:label></td>
				<td><form:input path="Age" value="${Student.Age}" /></td>
			</tr>
			<tr>
				<td><form:label path="Email">Student Email:</form:label></td>
				<td><form:input path="Email" value="${Student.Email}" /></td>
			</tr>
			
			
			<tr>
				<td>Student Gender:<input type="radio" name="Gender" value="male"> Male
								   <input type="radio" name="Gender" value="female"> Female
								   <input type="radio" name="Gender" value="other"> Other
				</td>
			</tr>

			<tr>

				<td>Country:<select name="Country">
						<option value="India" name="Country">India</option>
						<option value="Nepal" name="Country">Nepal</option>
						<option value="Bhutan" name="Country">Bhutan</option>
						<option value="Bangladesh" name="Country">Bangladesh</option>
						<option value="Pakistan" name="Country">Pakistan</option>
						<option value="Afghanistan" name="Country">Afghanistan</option>
				</select></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</form:form>

	
</body>
</html>