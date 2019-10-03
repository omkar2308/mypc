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

<%
String msg=request.getParameter("msg");

if(msg!=null)
{
%>
<script type="text/javascript">
alert("Duplicate Entry");
</script>
<%} %>

	
	<%-- <form:errors path="Student.*"></form:errors> --%>
	
	<form:form method="POST" action="register">
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
				<td><form:input type="number" path="Age" value="${Student.Age}" /></td>
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
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

	<%-- <c:if test="${!empty employees}">
		<h2>List Employees</h2>
		<table align="left" border="1">
			<tr>
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Employee Age</th>
				<th>Employee Salary</th>
				<th>Employee Total Fees</th>
				<th>Employee Paid Fees</th>
				<th>Employee Remain Fees</th>
				<th>Employee Address</th>
				<th>Employee Phoneno</th>
				<th>Employee Gender</th>
				<th>Employee Status</th>
				<th>Actions on Row</th>
			</tr>

			<c:forEach items="${employees}" var="employee">
			
				<tr>
					<td><c:out value="${employee.id}" /></td>
					<td><c:out value="${employee.name}" /></td>
					<td><c:out value="${employee.age}" /></td>
					<td><c:out value="${employee.salary}" /></td>
					<td><c:out value="${employee.totalfees}" /></td>
					<td><c:out value="${employee.paidfees}" /></td>
					<td><c:out value="${employee.remainfees}"/></td>
					<td><c:out value="${employee.address}" /></td>
					<td><c:out value="${employee.phoneno} " /></td>
					<td><c:out value="${employee.gender} " /></td>
					<td><c:out value="${employee.status} " /></td>
					
					<td align="center"><a href="edit.html?id=${employee.id}">Edit</a>
						| <a href="delete.html?id=${employee.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if> --%>
</body>
</html>