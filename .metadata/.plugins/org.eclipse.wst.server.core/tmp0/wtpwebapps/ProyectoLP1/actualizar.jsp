<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="icon" href="./images/icono_quickshop.png">
	<meta charset="ISO-8859-1">
	<title>Actualizar Usuario</title>
	<link rel="stylesheet" href="./cssssss/actualizarrr.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"	rel="stylesheet">
</head>
<body>
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
		<form action="ServletUsuario" method="post">
			<div class="contenido">
				<h1>Actualizar mis Datos</h1>
				<div class="formulario">
					<input type="hidden" value="<%=session.getAttribute("codigo")%>" name="txtCodigoA" readonly="readonly" />
					<div class="nombres">
						<div>
							<p style="text-align: center;">Primer Nombre</p>
							<input type="text" value="<%=session.getAttribute("nombre1")%>"	name="txtNombre1A" />
						</div>
						<div>
							<p style="text-align: center;">Segundo Nombre</p>
							<input type="text" value="<%=session.getAttribute("nombre2")%>"	name="txtNombre2A" />
						</div>

					</div>
					<div class="apellidos">
						<div>
							<p style="text-align: center;">Primer Apellido</p>
							<input type="text" value="<%=session.getAttribute("apellido1")%>" name="txtApellido1A" />
						</div>
						<div>
							<p style="text-align: center;">Segundo Apellido</p>
							<input type="text" value="<%=session.getAttribute("apellido2")%>" name="txtApellido2A" />
						</div>

					</div>
					<div class="correo">
						<p>Correo</p>
						<input type="text" value="<%=session.getAttribute("correo")%>" name="txtCorreoA" />
					</div>
					<div class="clave">
						<p>Clave</p>
						<input type="password" value="<%=session.getAttribute("clave")%>" name="txtClaveA" />
					</div>
				</div>
				<div class="actualizar">
					<input type="submit" value="Actualizar" name="tipo" />
				</div>
				<p style="text-align: center; font-size: 13px">
					Por seguridad de
					la cuenta se redireccionará a la pagina inicio para volver a
					ingresar sus credenciales
				</p>

			</div>
		</form>

	</main>

	<div class="svg-back">
		<a href="listadoProductos.jsp" class="volver">
			<svg width="81" height="81" fill="#2acf86" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
			          <path d="M22 12a10 10 0 1 0-20 0 10 10 0 0 0 20 0Zm-11.86 3.69-2.86-3a.49.49 0 0 1-.1-.15.54.54 0 0 1-.1-.16.94.94 0 0 1 0-.76 1 1 0 0 1 .21-.33l3-3a1.004 1.004 0 0 1 1.42 1.42L10.41 11H16a1 1 0 0 1 0 2h-5.66l1.25 1.31a1.001 1.001 0 0 1-1.45 1.38Z"></path>
			</svg>
		</a>
	</div>


</body>
<script src="./javascript/actualizar.js"></script>
</html>