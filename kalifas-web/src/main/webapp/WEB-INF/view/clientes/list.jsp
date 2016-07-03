<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="customTags"%>

<customTags:pageTemplate>

	<div id="formulario">
		<div id="main" class="container-fluid">
			<div id="top" class="row">

				<div class="col-md-3">
					<h3>Lista de Clientes</h3>
				</div>

<!-- 				<div class="col-md-6">
					<div class="input-group h2">
						<input name="data[search]" class="form-control" id="search"
							type="text" placeholder="Pesquisar Cliente"> <span
							class="input-group-btn">
							<button class="btn btn-primary" type="submit">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</span>
					</div>
				</div>
 -->
				<div class="col-md-3">
					<a href="clientes/form" class="btn btn-primary pull-right h2">Novo
						Item</a>
				</div>


			</div>
			<!-- /#top -->

			<hr />
			<div id="list" class="row">


				<table id="clientes" class="table table-striped" cellspacing="0"
					cellpadding="0">
					<thead>
						<tr>
							<th>Código</th>
							<th>Nome</th>
							<th>Endereco</th>
							<th>Cidade</th>

						</tr>
					</thead>
					<tbody>

						<c:forEach items="${clientes}" var="clientes">
							<tr>
								<td>${clientes.codigo}</td>
								<td>${clientes.nome}</td>
								<td>${clientes.endereco}</td>
								<td>${clientes.cidade} - ${clientes.estado}</td>
								<td class="actions"><a
									href="<c:url value='clientes/edit/${clientes.codigo}' />">Editar</a>
									<a href="<c:url value='clientes/remove/${clientes.codigo}' />">Excluir</a>
								</td>

							</tr>
						</c:forEach>
					</tbody>

				</table>

			</div>
			<!-- /#list -->

			<!-- <div id="bottom" class="row">
			<div class="col-md-12">

				<ul class="pagination">
					<li class="disabled"><a>&lt; Anterior</a></li>
					<li class="disabled"><a>1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li class="next"><a href="#" rel="next">Próximo &gt;</a></li>
				</ul>
				<!-- /.pagination -->
			<!--</div>  -->



		</div>
		<!-- /#bottom -->
	</div>
	<!-- /#main -->
	
</customTags:pageTemplate>
