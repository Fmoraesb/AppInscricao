
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dados Pessoais</title>
</head>
<body>
	<form>
		<%
			List<String> listaUF = (List<String>) request.getAttribute("listaUF");
		%>
		<h3>Nome</h3>
		<input type="text" name="nome">

		<h3>E-mail</h3>
		<input type="text" name="email">

		<h3>Redigite o E-mail</h3>
		<input type="text" name="emailRed">

		<h3>RG</h3>
		<input type="text" name="rg">

		<h3>Data de Expedição</h3>
		<input type="text" name="expedicao">

		<h3>Orgão</h3>
		<input type="text" name="orgao">

		<h3>UF</h3>
		<select name="uf">
		<%for (String uf: listaUF){ %>
			<option><%=uf%></option>
			<%}%>
		</select>

		<hr>
		<input type="submit" value="Cadastrar">

	</form>
</body>
</html>