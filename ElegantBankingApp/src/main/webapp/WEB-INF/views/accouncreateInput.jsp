<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="accoungform" action="${pageContext.request.contextPath}/account/saveAccount">
		<p>
			Account HolderName :
			<form:input path="accountHolderName" />
		<p>
			Balance :
			<form:input path="balance" />
		<p>

			Email :
			<form:input path="email" />
		<p>

			Phone :
			<form:input path="phone" />
		<p>
			<input type="submit" value="Create Account">
	</form:form>

</body>
</html>