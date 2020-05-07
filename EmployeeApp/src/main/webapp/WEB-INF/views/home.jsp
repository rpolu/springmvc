<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Employee Application
</h1>
<form action="./saveEmp" method="post">
<P> Emp Num :<input type="text" name="eid"></P>
<P> Emp Name :<input type="text" name="name"></P>
<P> Emp Salary :<input type="text" name="sal"></P>
<input type="submit" value="Save">
</form>
</body>
</html>
