<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	color:red;
}
</style>
</head>
<body>
	<form:form action="saveStudent" commandName="studentForm">
		<p>
			First Name<span>*</span>:
			<form:input path="firstName" />
			<form:errors path="firstName" cssClass="error" />
		<p>
			LastN Name<span>*</span>:
			<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		<p>
			Address<span>*</span>:
			<form:input path="address" />
			<form:errors path="address" cssClass="error" />
		<p>
			<input type="submit" value="Save">
		<p>
	</form:form>
</body>
</html>