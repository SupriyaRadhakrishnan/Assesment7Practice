<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/homepage">Return to list</a>
<h1>Donut</h1>
<div>
<b>Name :</b> ${result.name}<br /><br />
<b>Calories :</b> ${result.calories}<br /><br />
<b>Extras</b>
<ul>
<c:forEach var="extra" items="${result.extras}">
<li>${extra}</li>
</c:forEach>
</ul>
</div>
</body>
</html>