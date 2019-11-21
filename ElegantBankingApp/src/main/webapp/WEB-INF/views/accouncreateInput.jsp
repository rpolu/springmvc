<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<form:form commandName="accoungform"
	action="${pageContext.request.contextPath}/account/saveAccount">
	<table>
		<tr>
			<th>Name :</th>
			<td><form:input path="accountHolderName" /></td>
		</tr>
		<tr>
			<th>Balance :</th>
			<td><form:input path="balance" /></td>
		</tr>
		<tr>

			<th>Email :</th>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<th>Phone :</th>
			<td><form:input path="phone" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Create Account"></td>
		</tr>
	</table>
</form:form>
