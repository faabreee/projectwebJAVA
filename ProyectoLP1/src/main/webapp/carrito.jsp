<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.HashSet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="entidades.ArrayProducto"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="icon" href="./images/icono_quickshop.png">
	<title>Carrito de Compras</title>
	<link rel="stylesheet" href="./cssssss/carritossssss.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"	rel="stylesheet">
</head>
<body>


	<!-- HEADER -->
	<header class="header">
		<div class="logo">
			<img src="./images/definitivo black.png">
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

	<!-- MAIN -->
	<main>

		<div class="lista">
			<h1>Carrito de Compras</h1>

			<%
			ArrayProducto ac = (ArrayProducto) request.getSession().getAttribute("listaProducto");

			if (ac != null && ac.tamaño() > 0) {
				Set<Integer> idsProductos = new HashSet<>();
				double totalPrecio = 0;

				for (int i = 0; i < ac.tamaño(); i++) {
					entidades.Producto producto = ac.obtener(i);
					int idProducto = producto.getIdproducto();

					// Verificar si el producto ya se ha mostrado anteriormente
					if (idsProductos.contains(idProducto)) {
				continue; // Saltar al siguiente producto sin mostrarlo nuevamente
					}

					// Agregar el ID del producto al conjunto
					idsProductos.add(idProducto);

					// Calcular la suma de los precios
					totalPrecio += producto.getcantidad() * producto.getPrecioPro();
			%>

			<div class="productos">

				<div class="card">
					<div class="imagen">
						<div class="card-img">
							<img src="<%=producto.getImagenPro()%>">
						</div>
					</div>
					<div class="descripcion">
						<div class="card-info">
							<p class="text-title">
								<b>ID Producto: <%=producto.getIdproducto()%></b>
							</p>
							<p class="text-body"><%=producto.getDescripcionPro()%></p>
						</div>
						<div class="cantidad">
							<span class="text-title">Cantidad: <br> 
							<b><%=producto.getcantidad()%></b>
							</span>
							<span class="text-title">Precio Unitario: <br>
								<b>S/ <%=producto.getPrecioPro()%></b>
							</span>
						</div>

						<form action="ServletCarrito" method="post">
							<!-- Otros campos del formulario -->

							<input type="hidden" name="tipo" value="eliminar"> 
							<input type="hidden" name="eliminarIdProducto"value="<%=producto.getIdproducto()%>"> 
							<input type="hidden" name="tipo" value="pagar">
							<button type="submit">Eliminar</button>
						</form>
					</div>

					<div class="precio">
						<h1><%=producto.getNombrePro()%></h1>
						<h2>S/ <%=Math.round(producto.getPrecioPro() * producto.getcantidad() * 100.0) / 100.0%></h2>
					</div>
				</div>
			</div>

			<%
			}
			} else {
			%>
			<div class="null">
				<div class="svg-container">
					<a href="carrito.jsp" class="carrito">
						<svg width="100" height="100" fill="rgb(255, 69, 69)" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
							<path d="M21.08 7a2 2 0 0 0-1.7-1H6.58L6 3.74A1 1 0 0 0 5 3H3a1 1 0 1 0 0 2h1.24L7 15.26A1 1 0 0 0 8 16h9a1.001 1.001 0 0 0 .89-.55l3.28-6.56A2 2 0 0 0 21.08 7Z"></path>
							<path d="M7.5 21a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path>
							<path d="M17.5 21a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path>
						</svg>
					</a>
				</div>
				<p class="mensaje">
					Oh vaya! <br> No hay productos en el carrito.
				</p>
			</div>

			<%
			}
			%>
		</div>
		<%
		double totalPrecio = 0.0;

		if (ac != null && ac.tamaño() > 0) {
			Set<Integer> idsProductos = new HashSet<>();

			for (int i = 0; i < ac.tamaño(); i++) {
				entidades.Producto producto = ac.obtener(i);
				int idProducto = producto.getIdproducto();

				// Verificar si el producto ya se ha mostrado anteriormente
				if (idsProductos.contains(idProducto)) {
			continue; // Saltar al siguiente producto sin mostrarlo nuevamente
				}

				// Agregar el ID del producto al conjunto
				idsProductos.add(idProducto);

				totalPrecio += producto.getPrecioPro() * producto.getcantidad();
			}
		}
		%>

		<div class="pagar">
			<h1>Pago</h1>
			<div class="contenido">
				<div class="titulo">
					<h2>Producto</h2>
					<h2>Precio</h2>
				</div>
					<%
					if (ac != null && ac.tamaño() > 0) {
						Set<Integer> idsProductos = new HashSet<>();
	
						for (int i = 0; i < ac.tamaño(); i++) {
							entidades.Producto producto = ac.obtener(i);
							int idProducto = producto.getIdproducto();
	
							// Verificar si el producto ya se ha mostrado anteriormente
							if (idsProductos.contains(idProducto)) {
						continue; // Saltar al siguiente producto sin mostrarlo nuevamente
							}
	
							// Agregar el ID del producto al conjunto
							idsProductos.add(idProducto);
					%>

				<div class="registro">
					<div><%=producto.getNombrePro()%> x<%=producto.getcantidad()%></div>
					<div class="precioPro"><%=Math.round(producto.getPrecioPro() * producto.getcantidad() * 100.0) / 100.0%></div>
				</div>

				<%
				} // Fin del bucle for
				%>

				<div class="total">
					<div>Total a Pagar</div>
					<div style="display: flex">
						<div>S/</div>
						<div name="total"><%=Math.round(totalPrecio * 100.00) / 100.00%></div>
					</div>
				</div>
			</div>

			<%
			} else {
			%>

		</div>
		<%
		} // Fin de la condición if-else
		%>
		<div class="comprar">
			<form action="ServletCarrito" method="post">
				<input type="hidden" name="nombre1" value="${nombre1}">
				<input type="hidden" name="total" value="<%=Math.round(totalPrecio * 100.00) / 100.00%>">
				<input type="submit" value="Ir a Pagar" name="tipo">
			</form>
		</div>
		<div class="svg-back">
			<a href="listadoProductos.jsp" class="volver">
				<svg width="81"	height="81" fill="#2acf86" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
					<path d="M22 12a10 10 0 1 0-20 0 10 10 0 0 0 20 0Zm-11.86 3.69-2.86-3a.49.49 0 0 1-.1-.15.54.54 0 0 1-.1-.16.94.94 0 0 1 0-.76 1 1 0 0 1 .21-.33l3-3a1.004 1.004 0 0 1 1.42 1.42L10.41 11H16a1 1 0 0 1 0 2h-5.66l1.25 1.31a1.001 1.001 0 0 1-1.45 1.38Z"></path>
				</svg>
			</a>
		</div>

	</main>

	<div class="background"></div>

	<script src="./javascript/carritos.js"></script>
</body>
</html>
