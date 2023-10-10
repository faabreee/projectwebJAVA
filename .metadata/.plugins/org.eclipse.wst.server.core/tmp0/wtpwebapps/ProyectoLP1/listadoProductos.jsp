<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html lang="en">
<head>
	<link rel="icon" href="./images/icono_quickshop.png">
	<title>Listado de Productos</title>
	<link rel="stylesheet" href="./cssssss/listadoProductosss.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"	rel="stylesheet">
	</head>
<body>
	<sql:setDataSource var="con" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/minimarket" user="root"
		password="1970" />

	<sql:query dataSource="${con}" var="listaCursos">
		SELECT * FROM productos
	</sql:query>

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
		<div class="productos-encabezado">
			<h1>ESTOS SON TODOS NUESTROS PRODUCTOS</h1>
			<h3>Te ayudamos a buscar algo que te guste</h3>
			<div class="subtitulo-encabezado">
				<div class="search">
					<svg class="icon" aria-hidden="true" viewBox="0 0 24 24">
						<g>
							<path
								d="M21.53 20.47l-3.66-3.66C19.195 15.24 20 13.214 20 11c0-4.97-4.03-9-9-9s-9 4.03-9 9 4.03 9 9 9c2.215 0 4.24-.804 5.808-2.13l3.66 3.66c.147.146.34.22.53.22s.385-.073.53-.22c.295-.293.295-.767.002-1.06zM3.5 11c0-4.135 3.365-7.5 7.5-7.5s7.5 3.365 7.5 7.5-3.365 7.5-7.5 7.5-7.5-3.365-7.5-7.5z">
							</path>
						</g>
					</svg>
					<input id="buscar-producto" type="text" name="" class="search__input" placeholder="Escribe tu texto" onkeyup="search()">
				</div>
			</div>
		</div>

		<div class="productos" id="productos">
			<c:forEach items="${listaCursos.rows}" var="fila" varStatus="status">
				<div class="card" id="card">

					<div class="card-img">
						<img src="${fila.imagenPro}">
					</div>

					<div class="card-info">
						<p class="text-title" id="text-title">
							<c:out value="${fila.nombrePro}"></c:out>
						</p>
						<p class="text-body">
							<c:out value="${fila.descripcionPro}"></c:out>
						</p>
					</div>

					<div class="card-footer">

						<span class="text-title"><c:out
								value="S/ ${fila.precioPro}"></c:out></span>

						<div class="card-button">
							<form action="ServletCarrito" method="post" id="my-form-${status.index}">
								<input type="hidden" name="idProducto" value="${fila.idproducto}">
								<input type="hidden" name="nombrePro" value="<c:out value="${fila.nombrePro}"></c:out>">
								<input type="hidden" name="descripcionPro" value="<c:out value="${fila.descripcionPro}"></c:out>">
								<input type="hidden" name="precioPro" value="<c:out value="${fila.precioPro}"></c:out>">
								<input type="hidden" name="imagenPro" value="<c:out value="${fila.imagenPro}"></c:out>">
								<input type="hidden" name="cantidadHidden" value="1" id="my-input-hidden${fila.idproducto}">
								<input class="agregar" type="submit" value="AgregarCarrito"	name="tipo">
							</form>
							<script>
								// Oculta temporalmente el contenido de la página
								document.documentElement.style.visibility = 'hidden';

								// Almacena la posición de desplazamiento actual antes de enviar el formulario
								document
										.getElementById(
												'my-form-${status.index}')
										.addEventListener(
												'submit',
												function(event) {
													sessionStorage
															.setItem(
																	'scrollPosition',
																	window.pageYOffset
																			|| document.documentElement.scrollTop);
												});

								// Restaura la posición de desplazamiento después de que la página se haya cargado nuevamente
								window
										.addEventListener(
												'load',
												function() {
													var scrollPosition = sessionStorage
															.getItem('scrollPosition');
													if (scrollPosition !== null) {
														setTimeout(
																function() {
																	// Muestra el contenido de la página nuevamente
																	document.documentElement.style.visibility = 'visible';
																	window
																			.scrollTo(
																					0,
																					scrollPosition);
																	sessionStorage
																			.removeItem('scrollPosition');
																}, 0);
													} else {
														// Muestra el contenido de la página si no hay posición de desplazamiento almacenada
														document.documentElement.style.visibility = 'visible';
													}
												});
							</script>

						</div>

					</div>

				</div>
			</c:forEach>
		</div>
	</main>

	<div class="svg-container">
		<a href="carrito.jsp" class="carrito">
			<svg width="100" height="100" fill="#2acf86" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
		          <path	d="M21.08 7a2 2 0 0 0-1.7-1H6.58L6 3.74A1 1 0 0 0 5 3H3a1 1 0 1 0 0 2h1.24L7 15.26A1 1 0 0 0 8 16h9a1.001 1.001 0 0 0 .89-.55l3.28-6.56A2 2 0 0 0 21.08 7Z"></path>
		          <path d="M7.5 21a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path>
		          <path d="M17.5 21a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path>
			</svg>
		</a>
	</div>


	<div class="background"></div>
	<script src="./javascript/listadoProductosssss.js"></script>
</body>
</html>