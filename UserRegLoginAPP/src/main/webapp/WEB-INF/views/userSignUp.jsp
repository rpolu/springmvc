<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>User Login Application</h1>
	<form:form commandName="userCommand" action="saveUser" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName"></form:input></td>
				<td><form:errors path="firstName" cssClass="error"></form:errors></td>

			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName"></form:input></td>
				<td><form:errors path="lastName" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Adress</td>
				<td><form:input path="address"></form:input></td>
				<td><form:errors path="address" cssClass="error"></form:errors></td>

			</tr>
			<tr>
				<td>Phone Number</td>
				<td><form:input path="phoneNumber"></form:input></td>
				<td><form:errors path="phoneNumber" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><form:input path="userName"></form:input></td>
				<td><form:errors path="userName" cssClass="error"></form:errors></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password"></form:password></td>
				<td><form:errors path="password" cssClass="error"></form:errors></td>
			</tr>
			<tr>

				<td colspan="3" align="center"><input type="submit"
					value="Save"></td>
			</tr>
		</table>
	</form:form>

	<P>
</body>
</html>
