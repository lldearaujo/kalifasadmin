<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../../../../../../Documents/Site sem nome 2/pagestyle.css"


</head>
<body>

	<form method="post" action="/kalifasadmin/produtos">
		<div>
			<label for="title">Titulo</label> <input type="text" name="title"
				id="title" />
		</div>
		<div>
			<label for="description">Descri��o</label>
			<textarea rows="10" cols="20" name="description" id="description">
</textarea>
		</div>
		<div>
			<label for="pages">N�mero de paginas</label> <input type="text"
				name="pages" id="pages" />
		</div>
		<div>
			<input type="submit" value="Enviar">
		</div>
	</form>

</body>
</html>