<%@page import="entidades.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="icon" href="./images/icono_quickshop.png">
	<meta charset="ISO-8859-1">
	<title>Pago</title>
	<link rel="stylesheet" href="./cssssss/pagoss.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
</head>
<body>
	<%	Producto p = new Producto();	%>
	<header class="header">
		<div class="logo">
			<img src="./images/definitivo black.png">
		</div>
		<div class="saludo">
			<h3>Bienvenido, <%=session.getAttribute("nombre1")%>!</h3>
		</div>
		<div class="user">
			<button class="dropbtn">
				<img src="./images/user.png"> 
				<i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="actualizar.jsp">Actualizar Datos</a>
				<a href="listadoPedidos.jsp">Mis Pedidos</a> 
				<a href="ServletUsuario?tipo=Salir">Cerrar Sesión</a>
			</div>
		</div>
	</header>

	<form action="ServletPago" method="post">
		<main>
			<div class="datos">
				<div class="direccion">
					<h2>Direccion</h2>
					<div class="detalle">
						<div class="seleccionProvincia">
							<div style="font-weight: 300;">Provincia</div>

							<select id="provincia" onchange="cambiarOpciones()"	name="txtProvincia">
								<option value="Lima">Lima</option>
								<option value="Callao">Callao</option>
							</select>
						</div>

						<div class="seleccionDistrito" style="margin-top: 13px;">
							<div style="font-weight: 300;">Distrito</div>
							<select id="distrito" name="txtDistrito"></select>
						</div>
					</div>

					<div class="referencia">
						<div>Añade una Referencia</div>
						<input type="text" placeholder="Ingresa el nombre de la Calle o Av." name="txtReferencia" id="txtReferencia">
					</div>

				</div>
				<div class="tiempo">
					<h2>Tiempo estimado</h2>
					<div class="entrega">
						<div style="font-weight: 400;">Entrega estimada:</div>
						<div>45 - 60 min</div>
					</div>
				</div>
				<div class="metodo-pago">
					<h2>Metodo de Pago</h2>
					<div class="detalle">
						<div class="tarjeta">
							<h4 style="font-weight: 400;">Tarjeta de crédito o débito</h4>
							<div class="card-tarjeta">
								<div class="titulo">
									<img src="https://images.rappi.pe/payment_methods/cc_round.png">
									<div style="font-weight: 400;">Tarjeta</div>
								</div>

								<input type="radio" id="opcion1" name="txtMetodo" value="tarjeta">
							</div>

						</div>

						<div class="efectivo">
							<h4 style="font-weight: 400;">Efectivo</h4>
							<div class="card-efectivo">
								<div class="titulo">
									<img src="https://images.rappi.pe/payment_methods/circle-cash.png?e=webp&q=40&d=10x10">
									<div style="font-weight: 400;">Efectivo</div>
								</div>
								<input type="radio" id="opcion2" name="txtMetodo" value="efectivo">
							</div>

						</div>
					</div>
				</div>
			</div>

			<div class="resumen">

				<h2>Resumen</h2>

				<div class="contenido">
					<div class="detalle">
						<div class="costo">
							<div>Costo de productos</div>
							<div id="divImporteSub">${sessionScope.total}</div>
						</div>
						<div class="tarifa">
							<div>Tarifa de Servicio</div>
							<div id="tarifaValue" value="4.00">4.00</div>
						</div>
						<div class="envio">
							<div>Costo de envío</div>
							<div id="envioValue" value="10.00">10.00</div>
						</div>
					</div>
					<div class="total">
						<div>Total</div>
						<div class="precio" style="display: flex;">
							<div>S/</div>
							<div id="divImportetotal" name="divImportetotal" value="" style="margin-left: 5px"></div>
						</div>

					</div>
				</div>


				<input type="hidden" name="txtidCliente" value="<%=session.getAttribute("codigo")%>">
				<input type="hidden" name="txtNombre1Cliente" value="<%=session.getAttribute("nombre1")%>">
				<input type="hidden" name="txtNombre2Cliente" value="<%=session.getAttribute("nombre2")%>">
				<input type="hidden" name="txtApellido1Cliente" value="<%=session.getAttribute("apellido1")%>">
				<input type="hidden" name="txtApellido2Cliente"	value="<%=session.getAttribute("apellido2")%>">
				<input type="hidden" name="txtImporteSub" value="${sessionScope.total}">
				<input type="hidden" name="txtImportetotal" id="importeTotal">
				<input id="fechaActual" type="hidden" name="txtFecha" value="">

				<div class="comprar">
					<input type="submit" value="Hacer Pedido" name="tipo" id="btnHacerPedido">
				</div>
			</div>
		</main>
	</form>


	<div class="svg-back">
		<a href="carrito.jsp" class="volver">
			<svg width="81" height="81"	fill="#2acf86" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
				<path d="M22 12a10 10 0 1 0-20 0 10 10 0 0 0 20 0Zm-11.86 3.69-2.86-3a.49.49 0 0 1-.1-.15.54.54 0 0 1-.1-.16.94.94 0 0 1 0-.76 1 1 0 0 1 .21-.33l3-3a1.004 1.004 0 0 1 1.42 1.42L10.41 11H16a1 1 0 0 1 0 2h-5.66l1.25 1.31a1.001 1.001 0 0 1-1.45 1.38Z"></path>
			</svg>
		</a>
	</div>


</body>
<script src="./javascript/pagossss.js"></script>
</html>