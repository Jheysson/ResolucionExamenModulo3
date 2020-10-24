<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co" %>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<title>[DAW] Desarrollo de Aplicaciones Web</title>
</head>

<body>
	<h6>Lista de Clientes</h6>
	<hr>
	<form method="POST">
		<table>
			<thead>
				<tr>
					<td>Codigo de Cliente</td>
					<td>Nombres y apellidos</td>
					<td>Correo</td>
				</tr>
			</thead>
			<tbody>
				<co:forEach items="${model.listaCliente}" var="itemcliente">
					<tr>
						<td><co:out value="${itemcliente.codigoCliente} "></co:out></td>
						<td><co:out value="${itemcliente.apellidosNombres} "></co:out></td>
						<td><co:out value="${itemcliente.correo} "></co:out></td>
					</tr>
				</co:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>