<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>Account Application!</h1>


	<form:form action="./accsave" commandName="accountCommand"
		method="post">
		<P>
			Name:
			<form:input path="name" />
			<form:errors path="name" cssClass="error" />
		</P>
		<P>
			Balance
			<form:input path="balance" />
			<form:errors path="balance" cssClass="error" />
		</P>
		<P>
			Branch:
			<form:input path="branch" />
			<form:errors path="branch" cssClass="error" />
		</P>
		<P>
			Address:
			<form:input path="address" />
			<form:errors path="address" cssClass="error" />
		</P>

		<input type="submit" value="Save">

	</form:form>


</body>
</html>
