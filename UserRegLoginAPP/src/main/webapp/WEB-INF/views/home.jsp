<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>
		<spring:message code="loginpage.heading"></spring:message>
	</h1>
	<form:form commandName="userCommand" action="loginUser" method="post">
		<table>
			<tr>
				<td><spring:message code="loginpage.username"></spring:message></td>
				<td><form:input path="userName"></form:input></td>
				<td><form:errors path="userName" cssClass="error"></form:errors></td>

			</tr>
			<tr>
				<td><spring:message code="loginpage.password"></spring:message></td>
				<td><form:password path="password"></form:password></td>
				<td><form:errors path="password" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td colspan="1"><a href="./userReg"><spring:message code="loginpage.signup"/></a></td>
				<td colspan="1"><input type="submit" value="<spring:message code="loginpage.login"/>"></td>
			</tr>
		</table>
	</form:form>

	<P>
</body>
</html>
