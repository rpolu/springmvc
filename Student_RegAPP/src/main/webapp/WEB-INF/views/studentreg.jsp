<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
<form action="./saveStudent" method="post">
	<h1>Student Registration Application</h1>

	<P>Roll Num:<input type="text" name="rollNum"></P>
	<P>First Name:<input type="text" name="firstName"></P>
	<P>Last Name:<input type="text" name="lastName"></P>
	<P>Address:<input type="text" name="address"></P>
	
	<input type="submit" value="Save">
	</form>
</body>
</html>
