/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-06-28 15:28:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidades.Producto;

public final class pago_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/CIBERTEC/Tercer%20Ciclo%202022-01/LENGUAJE%20DE%20PROGRAMACIÓN%20I/PROYECTO/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProyectoLP1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1686191688000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("entidades.Producto");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<link rel=\"icon\" href=\"./images/icono_quickshop.png\">\r\n");
      out.write("	<meta charset=\"ISO-8859-1\">\r\n");
      out.write("	<title>Pago</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"./cssssss/pagoss.css\">\r\n");
      out.write("	<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("	<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
	Producto p = new Producto();	
      out.write("\r\n");
      out.write("	<header class=\"header\">\r\n");
      out.write("		<div class=\"logo\">\r\n");
      out.write("			<img src=\"./images/definitivo black.png\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"saludo\">\r\n");
      out.write("			<h3>Bienvenido, ");
      out.print(session.getAttribute("nombre1"));
      out.write("!</h3>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"user\">\r\n");
      out.write("			<button class=\"dropbtn\">\r\n");
      out.write("				<img src=\"./images/user.png\"> \r\n");
      out.write("				<i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"dropdown-content\">\r\n");
      out.write("				<a href=\"actualizar.jsp\">Actualizar Datos</a>\r\n");
      out.write("				<a href=\"listadoPedidos.jsp\">Mis Pedidos</a> \r\n");
      out.write("				<a href=\"ServletUsuario?tipo=Salir\">Cerrar Sesión</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("	<form action=\"ServletPago\" method=\"post\">\r\n");
      out.write("		<main>\r\n");
      out.write("			<div class=\"datos\">\r\n");
      out.write("				<div class=\"direccion\">\r\n");
      out.write("					<h2>Direccion</h2>\r\n");
      out.write("					<div class=\"detalle\">\r\n");
      out.write("						<div class=\"seleccionProvincia\">\r\n");
      out.write("							<div style=\"font-weight: 300;\">Provincia</div>\r\n");
      out.write("\r\n");
      out.write("							<select id=\"provincia\" onchange=\"cambiarOpciones()\"	name=\"txtProvincia\">\r\n");
      out.write("								<option value=\"Lima\">Lima</option>\r\n");
      out.write("								<option value=\"Callao\">Callao</option>\r\n");
      out.write("							</select>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"seleccionDistrito\" style=\"margin-top: 13px;\">\r\n");
      out.write("							<div style=\"font-weight: 300;\">Distrito</div>\r\n");
      out.write("							<select id=\"distrito\" name=\"txtDistrito\"></select>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"referencia\">\r\n");
      out.write("						<div>Añade una Referencia</div>\r\n");
      out.write("						<input type=\"text\" placeholder=\"Ingresa el nombre de la Calle o Av.\" name=\"txtReferencia\" id=\"txtReferencia\">\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"tiempo\">\r\n");
      out.write("					<h2>Tiempo estimado</h2>\r\n");
      out.write("					<div class=\"entrega\">\r\n");
      out.write("						<div style=\"font-weight: 400;\">Entrega estimada:</div>\r\n");
      out.write("						<div>45 - 60 min</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"metodo-pago\">\r\n");
      out.write("					<h2>Metodo de Pago</h2>\r\n");
      out.write("					<div class=\"detalle\">\r\n");
      out.write("						<div class=\"tarjeta\">\r\n");
      out.write("							<h4 style=\"font-weight: 400;\">Tarjeta de crédito o débito</h4>\r\n");
      out.write("							<div class=\"card-tarjeta\">\r\n");
      out.write("								<div class=\"titulo\">\r\n");
      out.write("									<img src=\"https://images.rappi.pe/payment_methods/cc_round.png\">\r\n");
      out.write("									<div style=\"font-weight: 400;\">Tarjeta</div>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<input type=\"radio\" id=\"opcion1\" name=\"txtMetodo\" value=\"tarjeta\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"efectivo\">\r\n");
      out.write("							<h4 style=\"font-weight: 400;\">Efectivo</h4>\r\n");
      out.write("							<div class=\"card-efectivo\">\r\n");
      out.write("								<div class=\"titulo\">\r\n");
      out.write("									<img src=\"https://images.rappi.pe/payment_methods/circle-cash.png?e=webp&q=40&d=10x10\">\r\n");
      out.write("									<div style=\"font-weight: 400;\">Efectivo</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<input type=\"radio\" id=\"opcion2\" name=\"txtMetodo\" value=\"efectivo\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"resumen\">\r\n");
      out.write("\r\n");
      out.write("				<h2>Resumen</h2>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"contenido\">\r\n");
      out.write("					<div class=\"detalle\">\r\n");
      out.write("						<div class=\"costo\">\r\n");
      out.write("							<div>Costo de productos</div>\r\n");
      out.write("							<div id=\"divImporteSub\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.total}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"tarifa\">\r\n");
      out.write("							<div>Tarifa de Servicio</div>\r\n");
      out.write("							<div id=\"tarifaValue\" value=\"4.00\">4.00</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"envio\">\r\n");
      out.write("							<div>Costo de envío</div>\r\n");
      out.write("							<div id=\"envioValue\" value=\"10.00\">10.00</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"total\">\r\n");
      out.write("						<div>Total</div>\r\n");
      out.write("						<div class=\"precio\" style=\"display: flex;\">\r\n");
      out.write("							<div>S/</div>\r\n");
      out.write("							<div id=\"divImportetotal\" name=\"divImportetotal\" value=\"\" style=\"margin-left: 5px\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<input type=\"hidden\" name=\"txtidCliente\" value=\"");
      out.print(session.getAttribute("codigo"));
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"txtNombre1Cliente\" value=\"");
      out.print(session.getAttribute("nombre1"));
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"txtNombre2Cliente\" value=\"");
      out.print(session.getAttribute("nombre2"));
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"txtApellido1Cliente\" value=\"");
      out.print(session.getAttribute("apellido1"));
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"txtApellido2Cliente\"	value=\"");
      out.print(session.getAttribute("apellido2"));
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"txtImporteSub\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.total}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"txtImportetotal\" id=\"importeTotal\">\r\n");
      out.write("				<input id=\"fechaActual\" type=\"hidden\" name=\"txtFecha\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"comprar\">\r\n");
      out.write("					<input type=\"submit\" value=\"Hacer Pedido\" name=\"tipo\" id=\"btnHacerPedido\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</main>\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"svg-back\">\r\n");
      out.write("		<a href=\"carrito.jsp\" class=\"volver\">\r\n");
      out.write("			<svg width=\"81\" height=\"81\"	fill=\"#2acf86\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("				<path d=\"M22 12a10 10 0 1 0-20 0 10 10 0 0 0 20 0Zm-11.86 3.69-2.86-3a.49.49 0 0 1-.1-.15.54.54 0 0 1-.1-.16.94.94 0 0 1 0-.76 1 1 0 0 1 .21-.33l3-3a1.004 1.004 0 0 1 1.42 1.42L10.41 11H16a1 1 0 0 1 0 2h-5.66l1.25 1.31a1.001 1.001 0 0 1-1.45 1.38Z\"></path>\r\n");
      out.write("			</svg>\r\n");
      out.write("		</a>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"./javascript/pagossss.js\"></script>\r\n");
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
