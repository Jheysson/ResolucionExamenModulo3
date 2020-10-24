<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co" %>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<title>[DAW] Desarrollo de Aplicaciones Web</title>
</head>

<body>
	<h6>Lista de Compras Efectuadas</h6>
	<hr>
	<form method="POST">
		<table>
			<thead>
				<tr>
					<td>No</td>
					<td>codigoCliente</td>
					<td>cliente</td>
					<td>fechaCompra</td>
					<td>codigoProducto</td>
					<td>Producto</td>
					<td>cantidad</td>
					<td>precioVenta</td>
					<td>total</td>
				</tr>
			</thead>
			<tbody>
				<co:forEach items="${model.listaCompraEfectuadas}" var="itemcompraEfectuadas">
					<tr>
						<td><co:out value="${itemcompraEfectuadas.no} "></co:out></td>
						<td><co:out value="${itemcompraEfectuadas.codigoCliente} "></co:out></td>
						<td><co:out value="${itemcompraEfectuadas.cliente} "></co:out></td>
						<td><co:out value="${itemcompraEfectuadas.fechaCompra} "></co:out></td>
						<td><co:out value="${itemcompraEfectuadas.codigoProducto} "></co:out></td>
						<td><co:out value="${itemcompraEfectuadas.producto} "></co:out></td>
						<td><co:out value="${itemcompraEfectuadas.cantidad} "></co:out></td>
						<td><co:out value="${itemcompraEfectuadas.precioVenta} "></co:out></td>
						<td><co:out value="${itemcompraEfectuadas.total} "></co:out></td>
					</tr>
				</co:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>