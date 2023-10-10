<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="icon" href="./images/icono_quickshop.png">
	<meta charset="ISO-8859-1">
	<title>Mensaje de Pedido</title>
	<link rel="stylesheet" href="./cssssss/mensajePedidos.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"	rel="stylesheet">
</head>
<header class="header">
	<div class="logo">
		<img src="./images/definitivo black.png"">
	</div>
	<div class="saludo">
			<h3>Bienvenido, <%=session.getAttribute("nombre1")%>!</h3>
	</div>
	<div class="user">
		<button class="dropbtn">
			<img src="./images/user.png"> <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-content">
			<a href="actualizar.jsp">Actualizar Datos</a>
			<a href="listadoPedidos.jsp">Mis Pedidos</a>
			<a href="ServletUsuario?tipo=Salir">Cerrar Sesión</a>
		</div>
	</div>
</header>

<main>

	<div class="mensaje">
		<h1>Muchas gracias por tu compra !</h1>
		<h2><%= session.getAttribute("nombre1") %> <%= session.getAttribute("apellido1") %></h2>
		<p>Tu pedido fue recibido correctamente</p>
		<p>Puedes ver todos tus pedidos realizados aquí</p>


		<div class="boton">
			<a href="listadoPedidos.jsp"> <input type="button"
				value="Ver Pedidos" name="tipo">
			</a>
		</div>
	</div>
</main>



<div class="svg-back">
	<a href="listadoProductos.jsp" class="volver">
		<svg width="81"	height="81" fill="#2acf86" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
			<path d="M22 12a10 10 0 1 0-20 0 10 10 0 0 0 20 0Zm-11.86 3.69-2.86-3a.49.49 0 0 1-.1-.15.54.54 0 0 1-.1-.16.94.94 0 0 1 0-.76 1 1 0 0 1 .21-.33l3-3a1.004 1.004 0 0 1 1.42 1.42L10.41 11H16a1 1 0 0 1 0 2h-5.66l1.25 1.31a1.001 1.001 0 0 1-1.45 1.38Z"></path>
		</svg>
	</a>
</div>


<script src="./javascript/mensajePedido.js"></script>
</html>