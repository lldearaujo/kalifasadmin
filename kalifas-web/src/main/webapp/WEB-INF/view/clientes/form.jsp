<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Clientes</title>

<style type="text/css">
<%@include file="/resources/css/indexStyle.css" %>
</style>
</head>
<body>

	<form:form method="post" action="/kalifas-web/clientes"
		commandName="cliente">

		<div>
			<label for="nome">Nome</label> <input cols="50"
				name="nome" id="nome" type="text" />
			<form:errors path="nome" />
		</div>
		
		<div>
			<input type="submit" value="Enviar">
		</div>

		
	</form:form>
</body>
</html>