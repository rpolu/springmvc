<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Account Application!</h1>

	<form:form action="./accsave" commandName="accountCommand" method="post">

   <P>  Name:   <form:input path="name"/></P>
   <P>  Balance <form:input path="balance"/></P>
   <P>  Branch: <form:input path="branch"/></P>
   <P>  Address:<form:input path="address"/></P>
   
   <input type="submit" value="Save">

	</form:form>

	
</body>
</html>
