<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>KalifasAdmin</title>
<style type="text/css">
<%@include file="/resources/css/styleLogin.css" %>
</style>
</head>

<body>

	<div id="login-box">
		<div id="login-box-interno">
			<div id="login-box-label">Kalifa's Admin</div>

			<div id="logo">		
				<img src="<c:url value='/resources/images/kalifaslogo.png'/>" height="160" ></img>
				
			</div>



			<div class="input-div" id="input-usuario">
				<input type="text" onfocus="this.value='';" value="Usuário" ></input>
			</div>

			<div class="input-div" id="input-senha">
				<input type="password" onfocus="this.value='';" value="Senha" ></input>
			</div>

			<div id="botoes">
				<div id="botao">
					<a href="welcome.jsp">Login</a>
				</div>
				<div id="lembrar-senha">
					<input type="checkbox" ></input> Lembrar minha senha
				</div>
			</div>

		</div>
	</div>


</body>
</html>