<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co" %>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<title>[DAW] Desarrollo de Aplicaciones Web</title>
</head>

<body>
	<h6>Lista de Productos</h6>
	<hr>
	<form method="POST">
		<table>
			<thead>
				<tr>
					<td>No</td>
					<td>Categoría</td>
					<td>Clase</td>
					<td>Tipo Producto</td>
					<td>Marca</td>
					<td>Modelo o Presentación</td>
					<td>Precio Venta</td>

				</tr>
			</thead>
			<tbody>
				<co:forEach items="${model.listaProducto}" var="itemprodcuto">
					<tr>
						<td><co:out value="${itemprodcuto.id} "></co:out></td>
						<td><co:out value="${itemprodcuto.categoria}"></co:out></td>
						<td><co:out value="${itemprodcuto.clase} "></co:out></td>
						<td><co:out value="${itemprodcuto.tipoProducto} "></co:out></td>
						<td><co:out value="${itemprodcuto.marca} "></co:out></td>
						<td><co:out value="${itemprodcuto.modelo} "></co:out></td>
						<td><co:out value="${itemprodcuto.precioVenta} "></co:out></td>
					</tr>
				</co:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>