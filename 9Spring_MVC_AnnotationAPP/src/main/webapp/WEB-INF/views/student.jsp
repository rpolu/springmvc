<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<form:form action="save" commandName="studentForm">
		<p>

			First Name :
			<form:input path="firstName" />
			<form:errors path="firstName"></form:errors>
		<p>

			Email:
			<form:input path="email" />
			<form:errors path="email"></form:errors>
		<p>
			<input type="submit" value="Save">
	</form:form>

</body>
</html>
