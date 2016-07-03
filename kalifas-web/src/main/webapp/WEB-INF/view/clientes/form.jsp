<%@taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<customTags:pageTemplate>
	<link rel="stylesheet"
		href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" />
	<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
	<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.js"></script>


	<div id="barra_menu">
		<ul>
			<li><img src="<c:url value='/resources/images/plus_icon.png'/>"
				height="160"></img><a href="#">Add Cliente</a></li>
			<li><img src="<c:url value='/resources/images/lupa.png'/>" /><a
				href="#">Pesq. Cliente</a></li>
			<li><img src="<c:url value='/resources/images/editar.png'/>" /><a
				href="#">Editar</a></li>
			<li><img src="<c:url value='/resources/images/lixeira.png'/>" /><a
				href="#">Excluir</a></li>
		</ul>
	</div>

	<div id="barra_submenu"></div>


	<div id="formulario">

		<form action="/kalifas-web/clientes" method="post">
			<form:errors path="cliente.nome" />
			<form:errors path="cliente.endereco" />
			<form:errors path="cliente.cep" />
			<form:errors path="cliente.cidade" />
			<form:errors path="cliente.telefone" />
			<form:errors path="cliente.celular" />
			<form:errors path="cliente.dataNascimento" />
			
			<input type="hidden" name="codigo" value="${cliente.codigo}" />
			
			<fieldset class="grupo">
				<div class="campo">
					<label for="nome">Nome:</label>
					<input name="nome" required value="${cliente.nome}"/>
				</div>
				<div class="campo">
					<label for="endereco">Endereço</label> 
					<input type="text" value="${cliente.endereco}"
						name="endereco" id="endereco" placeholder="Rua A, 123" required />
				</div>
				<div class="campo">
					<label for="cep">CEP</label> 
					<input type="text" name="cep" id="cep" value="${cliente.cep}"
						OnKeyPress="formatar('#####-###', this)"
						placeholder="99999-999" required />
				</div>
				<div class="campo">
					<label for="cidade">Cidade</label> 
					<select id="cidade"
						name="cidade" required >
						<option selected></option>
						<option value="Barbalha" ${cliente.cidade.equals('Barbalha')? 'selected' : '' }>Barbalha</option>
						<option value="Crato" ${cliente.cidade.equals('Crato')? 'selected' : '' }>Crato</option>
						<option value="Juazeiro do Norte" ${cliente.cidade.equals('Juazeiro do Norte')? 'selected' : '' }>Juazeiro do Norte</option>
					</select>
				</div>
				<div class="campo">
					<label for="estado">Estado</label> 
						<select id="estado"
							name="estado" required >
						<option selected></option>
						<option value="CE"  ${cliente.estado.equals('CE')? 'selected' : '' }>CE</option>
					</select>
				</div>
				<div class="campo">
					<label for="telefone">Telefone</label> <input type="text"
						name="telefone" id="telefone"
						OnKeyPress="formatar('##-####-####', this)"
						placeholder="99-9999-9999" value="${cliente.telefone}"/>
				</div>
				<div class="campo">
					<label for="celular">Celular</label> <input type="text"
						name="celular" id="celular"
						OnKeyPress="formatar('##-# ####-####', this)"
						placeholder="99-9 9999-9999" required value="${cliente.celular}"/>
				</div>
				<div class="campo">
					<label for="dataNascimento">Data de Nascimento</label> <input
						type="text" name="dataNascimento" id="dataNascimento"
						OnKeyPress="formatar('##/##/####', this)"
						placeholder="DD/MM/AAAA" 
						value="<fmt:formatDate 
      						value="${cliente.dataNascimento}" 
      					pattern="dd/MM/yyyy" />"/>
				</div> 
			</fieldset>

			<input type="submit" class="botao submit" value="Salvar"/>

		</form>
	</div>
	</body>

	<script type="text/javascript">
		//FORMATAÇÃO DE MASCARAS
		function formatar(mascara, documento) {
			var i = documento.value.length;
			var saida = mascara.substring(0, 1);
			var texto = mascara.substring(i)

			if (texto.substring(0, 1) != saida) {
				documento.value += texto.substring(0, 1);
			}
		}
		$(function() {
			$("#dataNascimento")
					.datepicker(
							{
								dateFormat : 'dd/mm/yy',
								dayNames : [ 'Domingo', 'Segunda', 'Terça',
										'Quarta', 'Quinta', 'Sexta', 'Sábado' ],
								dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S',
										'S', 'D' ],
								dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua',
										'Qui', 'Sex', 'Sáb', 'Dom' ],
								monthNames : [ 'Janeiro', 'Fevereiro', 'Março',
										'Abril', 'Maio', 'Junho', 'Julho',
										'Agosto', 'Setembro', 'Outubro',
										'Novembro', 'Dezembro' ],
								monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr',
										'Mai', 'Jun', 'Jul', 'Ago', 'Set',
										'Out', 'Nov', 'Dez' ],
								nextText : 'Próximo',
								prevText : 'Anterior'
							});
		});
	</script>
</customTags:pageTemplate>





