<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="icon" href="./images/icono_quickshop.png">
	<title>Listado de Pedidos</title>
	<link rel="stylesheet" href="./cssssss/listadoPedidos.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"	rel="stylesheet">
</head>
<body>
	<sql:setDataSource var="con" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/minimarket" 
		user="root"
		password="1970" />

	<sql:query dataSource="${con}" var="listaPedidos">
		SELECT detallepago.*FROM detallepago JOIN usuarios ON detallepago.idCliente = usuarios.codigo WHERE usuarios.codigo = '<%=session.getAttribute("codigo")%>';
	</sql:query>

	<!-- HEADER -->
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

		<div class="titulo">
			<h1>Listado de mis Pedidos</h1>
		</div>
		<div class="listado">

			<div class="encabezado">
				<div style="width: 8%;">Codigo</div>
				<div style="width: 14%;">Nombres</div>
				<div style="width: 14%;">Apellidos</div>
				<div style="width: 10%;">Provincia</div>
				<div style="width: 10%;">Distrito</div>
				<div style="width: 10%;">Referencia</div>
				<div style="width: 8%;">Metodo</div>
				<div style="width: 8%;">Fecha</div>
				<div style="width: 8%;">Importe Total</div>
				<div style="width: 5%;"></div>
			</div>

			<div class="contenido">
				<c:forEach items="${listaPedidos.rows}" var="fila"
					varStatus="status">
					<form id="formulario" action="ServletPago" method="post">

						<div class="detalle">
							<div style="width: 8%; font-weight: bold">${fila.idPago}</div>
							<div style="width: 14%;">${fila.nombre1Cliente}	${fila.nombre2Cliente}</div>
							<div style="width: 14%;">${fila.apellido1Cliente} ${fila.apellido2Cliente}</div>
							<div style="width: 10%;">${fila.provincia}</div>
							<div style="width: 10%;">${fila.distrito}</div>
							<div style="width: 10%;">${fila.referencia}</div>
							<div style="width: 8%;">${fila.metodoPago}</div>
							<div style="width: 8%;">${fila.fecha}</div>
							<div style="width: 8%;">S/. ${fila.importeTotal}</div>
							<div style="width: 5%;">
								<input type="hidden" value="${fila.idPago}" name="txtidPago" />
								<input type="hidden" name="tipo" value="Eliminar">
								<button>
									<svg width="23" height="23" fill="#000000" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
						          		<path d="M15.36 4.2v1.2h4.2a.6.6 0 0 1 0 1.2h-.645L17.89 19.392a2.4 2.4 0 0 1-2.393 2.208H8.022a2.4 2.4 0 0 1-2.392-2.208L4.606 6.6H3.96a.6.6 0 0 1 0-1.2h4.2V4.2a1.8 1.8 0 0 1 1.8-1.8h3.6a1.8 1.8 0 0 1 1.8 1.8Zm-6 0v1.2h4.8V4.2a.6.6 0 0 0-.6-.6h-3.6a.6.6 0 0 0-.6.6Zm-1.8 4.235.6 10.2a.6.6 0 1 0 1.198-.072l-.6-10.2a.6.6 0 1 0-1.198.072Zm7.836-.633a.6.6 0 0 0-.633.564l-.6 10.2a.6.6 0 0 0 1.197.07l.6-10.2a.6.6 0 0 0-.564-.634ZM11.76 7.8a.6.6 0 0 0-.6.6v10.2a.6.6 0 1 0 1.2 0V8.4a.6.6 0 0 0-.6-.6Z"></path>
									</svg>
								</button>
							</div>
						</div>
					</form>
				</c:forEach>
			</div>
		</div>

		<div class="svg-back">
			<a href="listadoProductos.jsp" class="volver">
				<svg width="81"	height="81" fill="#2acf86" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
			          <path	d="M22 12a10 10 0 1 0-20 0 10 10 0 0 0 20 0Zm-11.86 3.69-2.86-3a.49.49 0 0 1-.1-.15.54.54 0 0 1-.1-.16.94.94 0 0 1 0-.76 1 1 0 0 1 .21-.33l3-3a1.004 1.004 0 0 1 1.42 1.42L10.41 11H16a1 1 0 0 1 0 2h-5.66l1.25 1.31a1.001 1.001 0 0 1-1.45 1.38Z"></path>
				</svg>
			</a>
		</div>

	</main>


</body>
<script src="./javascript/listadoPedidos.js"></script>
</html>