<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table id="table-2 ">
	<tr>
		<th>Acc Num</th>
		<th>Name</th>
		<th>Balance</th>
		<th>Action</th>
	</tr>
	<c:forEach items="${accList}" var="acc">
		<tr>
			<td>${acc.accountNumber}</td>
			<td>${acc.accountHolderName}</td>
			<td>${acc.balance}</td>
			<td><a
				href="${pageContext.request.contextPath}/account/update/${acc.accountNumber}">Update</a>
				<a
				href="${pageContext.request.contextPath}/account/delete/${acc.accountNumber}">Delete</a>

			</td>
		</tr>
	</c:forEach>


</table>