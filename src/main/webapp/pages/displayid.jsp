<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	div{
	border: 1px solid black;
  background-color: lightblue;
  padding-top: 50px;
  padding-right: 50px;
  padding-bottom: 50px;
  padding-left: 50px;
  margin-left: 90px;
  margin-right: 90px;
}

</style>
<title>Insert title here</title>
</head>
<body>

<div>
<h3>Alien List by ID</h3>
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Tech</th>
		</tr>
		<c:forEach var="alien" items="${alien}">
			<tr>
				<td>${alien.aid }</td>
				<td>${alien.aname }</td>
				<td>${alien.tech }</td>
			</tr>
		</c:forEach>
	</table>
</div>

</body>
</html>