<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>[DAW] Desarrollo de Aplicaciones Web</title>
	</head>
	<body>
		<h2>Examen Módulo III</h2>
		<hr>
		<br>
		<co:url value="/listadoProducto.eur" var="mensajeUrl"></co:url>
		<a href="${mensajeUrl}">Listado de los Productos</a>
		<br>
		<br>
		<co:url value="/listadoCliente.eur" var="mensaje"></co:url>
		<a href="${mensaje}">Listado de los clientes</a>
		<br>
		<br>
		<co:url value="/listadoCompraEfectuada.eur" var="mensaje"></co:url>
		<a href="${mensaje}">Listado de Compras Efectuadas</a>
		<br>
		<br>
		<co:url value="/listadoUltimaCompra.eur" var="mensaje"></co:url>
		<a href="${mensaje}">Listado Ultima Compra</a>
		<br>
		<br>
		<co:url value="/listadoNoCompra.eur" var="mensaje"></co:url>
		<a href="${mensaje}">Listado no compra</a>
	</body>
</html>
