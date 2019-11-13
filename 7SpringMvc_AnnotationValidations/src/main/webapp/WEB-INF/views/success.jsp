<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elegant Spring MVC</title>
</head>
<body bgcolor="wheat">
  <h2>User Success From</h2>
  <hr />

  <table>
    <tr>
      <th>Name</th>
      <td>${userForm.name}</td>
    </tr>
    <tr>
      <th>Email</th>
      <td>${userForm.email}</td>
    </tr>
    <tr>
      <th>Gender</th>
      <td>${userForm.gender}</td>
    </tr>
    <tr>
      <th valign="top">Languages</th>
      <td>${userForm.languages}</td>
    </tr>
  </table>
</body>
</html>