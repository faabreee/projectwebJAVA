/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-10-11 21:42:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("	<link rel=\"icon\" href=\"./images/icono_quickshop.png\">\r\n");
      out.write("	<title>Inicio de Sesion</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"./cssssss/stylesssss.css\">\r\n");
      out.write("	<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("	<link href='https://fonts.googleapis.com/css?family=Nunito' rel='stylesheet'>\r\n");
      out.write("	<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("	<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap\"	rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #121212;\">\r\n");
      out.write("	<!-- <video src=\"./images/vecteezy_black-friday-delivery-man-on-scooter_4575774.mp4\"	autoplay=\"true\" muted=\"true\" loop=\"true\"></video> -->\r\n");
      out.write("\r\n");
      out.write("	<div id=\"loadingOverlay\">\r\n");
      out.write("		<div class=\"loader\">\r\n");
      out.write("			<div class=\"loader-section\">\r\n");
      out.write("				<div class=\"loader__circle\"></div>\r\n");
      out.write("				<div class=\"loader__circle\"></div>\r\n");
      out.write("				<div class=\"loader__circle\"></div>\r\n");
      out.write("				<div class=\"loader__circle\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- HEADER -->\r\n");
      out.write("	<header class=\"header\">\r\n");
      out.write("		<div class=\"logo\">\r\n");
      out.write("			<img src=\"./images/definitivo black.png\">\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- LOGIN -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"presentacion\">\r\n");
      out.write("			<div class=\"contenido-pres\">\r\n");
      out.write("				<h2>¡Bienvenido a QuickShop!</h2>\r\n");
      out.write("				<p>Gracias a ti, estamos creciendo más allá de nuestras\r\n");
      out.write("					expectativas. Compartamos el éxito cada día.</p>\r\n");
      out.write("				<div class=\"redes\">\r\n");
      out.write("					<a href=\"#\"><i class='bx bxl-facebook'></i></a>\r\n");
      out.write("					<a href=\"#\"><i class='bx bxl-twitter'></i></a>\r\n");
      out.write("					<a href=\"#\"><i class='bx bxl-instagram'></i></a>\r\n");
      out.write("					<a href=\"#\"><i class='bx bxl-tiktok'></i></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"entrar\">\r\n");
      out.write("			<div class=\"form-box login\">\r\n");
      out.write("				<form action=\"ServletUsuario\" method=\"post\">\r\n");
      out.write("					<h2>Iniciar Sesión</h2>\r\n");
      out.write("					<div class=\"input-box\">\r\n");
      out.write("						<span class=\"icono\"><i class='bx bxs-user-account'></i></span>\r\n");
      out.write("						<!---------------------- CORREO ------------------->\r\n");
      out.write("						<input id=\"miInput\" type=\"text\" name=\"txtCorreo\" required>\r\n");
      out.write("						<label>Correo</label>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-box\">\r\n");
      out.write("						<span class=\"icono\"><i class='bx bxs-lock-alt'></i></span>\r\n");
      out.write("						<!---------------------- CLAVE ------------------->\r\n");
      out.write("						<input id=\"miInput\" type=\"password\" name=\"txtClave\" required>\r\n");
      out.write("						<label>Clave</label>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!---------------------- INGRESAR ------------------->\r\n");
      out.write("					<input class=\"btn\" type=\"submit\" value=\"Ingresar\" name=\"tipo\"></input>\r\n");
      out.write("					<div class=\"crear-cuenta\">\r\n");
      out.write("						<p>\r\n");
      out.write("							¿Aún no tienes cuenta?<a href=\"#\" class=\"register-link\"> Registrarse</a>\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div id=\"mensaje\" class=\"fade-in\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mensaje}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-box register\">\r\n");
      out.write("				<form action=\"ServletUsuario\" method=\"post\">\r\n");
      out.write("					<h2>Registrate</h2>\r\n");
      out.write("					<div class=\"nombres\">\r\n");
      out.write("						<div class=\"input-box\">\r\n");
      out.write("							<span class=\"icono\"><i class='bx bxs-user'></i></span>\r\n");
      out.write("							<!----------------------NOMBRES2 ------------------->\r\n");
      out.write("							<input id=\"miInput\" type=\"text\" name=\"txtNombre1\" required>\r\n");
      out.write("							<label>Primer Nombre</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"input-box\">\r\n");
      out.write("							<span class=\"icono\"><i class='bx bxs-user'></i></span>\r\n");
      out.write("							<!----------------------NOMBRES1 ------------------->\r\n");
      out.write("							<input id=\"miInput\" type=\"text\" name=\"txtNombre2\" required>\r\n");
      out.write("							<label>Segundo Nombre</label>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"apellidos\">\r\n");
      out.write("						<div class=\"input-box\">\r\n");
      out.write("							<span class=\"icono\"><i class='bx bxs-user'></i></span>\r\n");
      out.write("							<!---------------------- APELLIDOS ------------------->\r\n");
      out.write("							<input id=\"miInput\" type=\"text\" name=\"txtApellido1\" required>\r\n");
      out.write("							<label>Primer Apellido</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"input-box\">\r\n");
      out.write("							<span class=\"icono\"><i class='bx bxs-user'></i></span>\r\n");
      out.write("							<!---------------------- APELLIDOS ------------------->\r\n");
      out.write("							<input id=\"miInput\" type=\"text\" name=\"txtApellido2\" required>\r\n");
      out.write("							<label>Segundo Apellido</label>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-box\">\r\n");
      out.write("						<span class=\"icono\"><i class='bx bxs-user-account'></i></span>\r\n");
      out.write("						<!---------------------- USUARIO ------------------->\r\n");
      out.write("						<input id=\"miInput\" type=\"text\" name=\"txtCorreoR\" required>\r\n");
      out.write("						<label>Correo</label>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-box\">\r\n");
      out.write("						<span class=\"icono\"><i class='bx bxs-lock-alt'></i></span>\r\n");
      out.write("						<!---------------------- CLAVE ------------------->\r\n");
      out.write("						<input id=\"miInput\" type=\"password\" name=\"txtClaveR\" required>\r\n");
      out.write("						<label>Clave</label>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!---------------------- REGISTRARSE ------------------->\r\n");
      out.write("					<input class=\"btn\" type=\"submit\" value=\"Registrarse\" name=\"tipo\"></input>\r\n");
      out.write("					<div class=\"crear-cuenta\">\r\n");
      out.write("						<p>	Tienes una cuenta? <a href=\"#\" class=\"login-link\"> Iniciar Sesión</a> </p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"./javascript/inicio.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
