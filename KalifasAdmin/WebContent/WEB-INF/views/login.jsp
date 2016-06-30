<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">

<!-- <h:head>
	<meta charset="UTF-8" />
	<title>Login</title>
	<h:outputStylesheet library="css" name="stylelogin.css" />
</h:head> -->

<head>
<title>KalifasAdmin</title>
<link rel="stylesheet" type="text/css"
	href="resources/css/pageStyle.css" />

</head>

<h:body>

	<div id="login-box">
		<div id="login-box-interno">
			<div id="login-box-label">Kalifa's Admin</div>

			<div id="logo">
				<img src="/resources/images/kalifaslogo.png" />
					height="160" />
			</div>



			<div class="input-div" id="input-usuario">
				<input type="text" onfocus="this.value='';" value="Usuário ou Email" />
			</div>

			<div class="input-div" id="input-senha">
				<input type="password" onfocus="this.value='';" value="Senha" />
			</div>

			<div id="botoes">
				<div id="botao">
					<a href="welcome.jsp">Login</a>
				</div>
				<div id="lembrar-senha">
					<input type="checkbox" /> Lembrar minha senha
				</div>
			</div>

		</div>
	</div>


</h:body>
</html>