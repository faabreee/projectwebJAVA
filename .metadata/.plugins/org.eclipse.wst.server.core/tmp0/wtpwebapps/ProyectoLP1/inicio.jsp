<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
	<link rel="icon" href="./images/icono_quickshop.png">
	<title>Inicio de Sesion</title>
	<link rel="stylesheet" href="./cssssss/stylesssss.css">
	<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
	<link href='https://fonts.googleapis.com/css?family=Nunito' rel='stylesheet'>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"	rel="stylesheet">
</head>
<body>
	<video src="./images/vecteezy_black-friday-delivery-man-on-scooter_4575774.mp4"	autoplay="true" muted="true" loop="true"></video>

	<div id="loadingOverlay">
		<div class="loader">
			<div class="loader-section">
				<div class="loader__circle"></div>
				<div class="loader__circle"></div>
				<div class="loader__circle"></div>
				<div class="loader__circle"></div>
			</div>
		</div>
	</div>
	<!-- HEADER -->
	<header class="header">
		<div class="logo">
			<img src="./images/definitivo black.png">
		</div>
	</header>
	<!-- LOGIN -->
	<div class="container">
		<div class="presentacion">
			<div class="contenido-pres">
				<h2>¡Bienvenido a QuickShop!</h2>
				<p>Gracias a ti, estamos creciendo más allá de nuestras
					expectativas. Compartamos el éxito cada día.</p>
				<div class="redes">
					<a href="#"><i class='bx bxl-facebook'></i></a>
					<a href="#"><i class='bx bxl-twitter'></i></a>
					<a href="#"><i class='bx bxl-instagram'></i></a>
					<a href="#"><i class='bx bxl-tiktok'></i></a>
				</div>
			</div>
		</div>
		<div class="entrar">
			<div class="form-box login">
				<form action="ServletUsuario" method="post">
					<h2>Iniciar Sesión</h2>
					<div class="input-box">
						<span class="icono"><i class='bx bxs-user-account'></i></span>
						<!---------------------- CORREO ------------------->
						<input id="miInput" type="text" name="txtCorreo" required>
						<label>Correo</label>
					</div>
					<div class="input-box">
						<span class="icono"><i class='bx bxs-lock-alt'></i></span>
						<!---------------------- CLAVE ------------------->
						<input id="miInput" type="password" name="txtClave" required>
						<label>Clave</label>
					</div>
					<!---------------------- INGRESAR ------------------->
					<input class="btn" type="submit" value="Ingresar" name="tipo"></input>
					<div class="crear-cuenta">
						<p>
							¿Aún no tienes cuenta?<a href="#" class="register-link"> Registrarse</a>
						</p>
					</div>
					<div id="mensaje" class="fade-in">${mensaje}</div>
				</form>
			</div>
			<div class="form-box register">
				<form action="ServletUsuario" method="post">
					<h2>Registrate</h2>
					<div class="nombres">
						<div class="input-box">
							<span class="icono"><i class='bx bxs-user'></i></span>
							<!----------------------NOMBRES2 ------------------->
							<input id="miInput" type="text" name="txtNombre1" required>
							<label>Primer Nombre</label>
						</div>
						<div class="input-box">
							<span class="icono"><i class='bx bxs-user'></i></span>
							<!----------------------NOMBRES1 ------------------->
							<input id="miInput" type="text" name="txtNombre2" required>
							<label>Segundo Nombre</label>
						</div>
					</div>
					<div class="apellidos">
						<div class="input-box">
							<span class="icono"><i class='bx bxs-user'></i></span>
							<!---------------------- APELLIDOS ------------------->
							<input id="miInput" type="text" name="txtApellido1" required>
							<label>Primer Apellido</label>
						</div>
						<div class="input-box">
							<span class="icono"><i class='bx bxs-user'></i></span>
							<!---------------------- APELLIDOS ------------------->
							<input id="miInput" type="text" name="txtApellido2" required>
							<label>Segundo Apellido</label>
						</div>
					</div>
					<div class="input-box">
						<span class="icono"><i class='bx bxs-user-account'></i></span>
						<!---------------------- USUARIO ------------------->
						<input id="miInput" type="text" name="txtCorreoR" required>
						<label>Correo</label>
					</div>
					<div class="input-box">
						<span class="icono"><i class='bx bxs-lock-alt'></i></span>
						<!---------------------- CLAVE ------------------->
						<input id="miInput" type="password" name="txtClaveR" required>
						<label>Clave</label>
					</div>
					<!---------------------- REGISTRARSE ------------------->
					<input class="btn" type="submit" value="Registrarse" name="tipo"></input>
					<div class="crear-cuenta">
						<p>	Tienes una cuenta? <a href="#" class="login-link"> Iniciar Sesión</a> </p>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="./javascript/inicio.js"></script>
</body>
</html>