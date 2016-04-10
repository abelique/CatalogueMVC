<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>

<spring:url value="/resources/css/style.css" var="styleInit" />
<link href="${styleInit}" rel="stylesheet" />

<title>Catalogue</title>

</head>
<body>

<h4>List des produits</h4>
<div id="formProduit">
	<f:form modelAttribute="produit" method="post" action="saveProduit">
			<table>
			<tr>
				<td>Reference</td>
				<td><f:input path="reference" /></td>
				<td><f:errors path="reference" cssClass="errors"/></td>
			</tr>
			<tr>
				<td>designation</td>
				<td><f:input path="designation" /></td>
				<td><f:errors path="designation" cssClass="errors"/></td>
			</tr>
			<tr>
				<td>Prix</td>
				<td><f:input path="prix" /></td>
				<td><f:errors path="prix" cssClass="errors"/></td>
			</tr>
			<tr>
				<td>Quantite</td>
				<td><f:input path="quantite" /></td>
				<td><f:errors path="quantite" cssClass="errors"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"/></td>
			</tr>
		</table>
	</f:form>
</div>


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
