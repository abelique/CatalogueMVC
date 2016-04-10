<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html >
<html>
<head>

<spring:url value="/resources/css/style.css" var="styleInit" />
<link href="${styleInit}" rel="stylesheet" />

<title>Catalogue</title>

</head>
<body>

<h4>List des produits</h4>

<div class="container">
<table class="table_1">
	<tr>
	<th>REF</th><th>DESIGNATION</th><th>PRIX</th><th>QUANTITE</th>
	</tr>
	<c:forEach items="${produits}" var="pro">
	<tr>
	<td>${pro.reference}</td>
	<td>${pro.designation}</td>
	<td>${pro.prix}</td>
	<td>${pro.quantite}</td>
	</tr>
	</c:forEach>
</table>
</div>

</body>
</html>
