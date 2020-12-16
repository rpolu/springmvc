<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Student Registration APP
</h1>
<form:form action="saveStudent" commandName="stuComand" method="post">
   Roll Num:<form:input path="rollNum"/><br>
   Name    :<form:input path="name"/><br>
   Marks   :<form:input path="marks"/><br>
   <input type="submit" value="Save">
</form:form>
</body>
</html>
