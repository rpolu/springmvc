<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveStudent" commandName="studentForm">
	First Name:<form:input path="firstName" />
		<p>
			LastN Name:
			<form:input path="lastName" />
		<p>
			Address:
			<form:input path="address" />
		<p>
			<input type="submit" value="Save">
		<p>
	</form:form>
</body>
</html>