<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>User Login Application</h1>
	<form:form commandName="userCommand" action="loginUser" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><form:input path="userName"></form:input></td>
				<td><form:errors path="userName"></form:errors></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password"></form:password></td>
				<td><form:errors path="password"></form:errors></td>
			</tr>
			<tr>
				<td colspan="1"><a href="./userReg">Sing UP</a></td>
				<td colspan="1"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form:form>

	<P>
</body>
</html>
