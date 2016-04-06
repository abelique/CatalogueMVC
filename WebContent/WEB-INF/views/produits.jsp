<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<title>Catalogue</title>
</head>
<body>

<h4>List des produits</h4>

<table>
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


</body>
</html>