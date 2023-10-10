package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import entidades.Usuario;
import interfaces.InterfaceUsuario;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tipo = request.getParameter("tipo");
		
	    HttpSession session = request.getSession();
		
		switch(tipo) {
			case "Ingresar":  loginUsuario(request, response); break;
			case "Registrarse":  registrarUsuario(request, response); break;
			case "Actualizar":  actualizarUsuario(request, response); break;
			default: 			
			request.getSession().invalidate();
			response.sendRedirect("inicio.jsp");
		}
		
	}
    
	protected void loginUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
			String correo = request.getParameter("txtCorreo");
			String clave = request.getParameter("txtClave");
			
			Usuario u = new Usuario();
			
			u.setCorreo(correo);
			u.setClave(clave);
			
			DAOFactory df = DAOFactory.obtenerDAOFactory(DAOFactory.MYSQL);
			InterfaceUsuario iu = df.getInterfaceUsuario();
			
			Usuario usu = new Usuario();
			usu = iu.verificarCorreo(u);
			
			if(usu != null) {

				HttpSession session = request.getSession();
				
				session.setAttribute("codigo", String.valueOf(usu.getCodigo()));
				session.setAttribute("correo", usu.getCorreo());
				session.setAttribute("clave", usu.getClave());
				session.setAttribute("nombre1", usu.getNombre1());
				session.setAttribute("nombre2", usu.getNombre2());
				session.setAttribute("apellido1", usu.getApellido1());
				session.setAttribute("apellido2", usu.getApellido2());
								
				session.setMaxInactiveInterval(300);
				
				request.setAttribute("usuario", usu);
				request.getRequestDispatcher("listadoProductos.jsp").forward(request, response);
			}
			else {
				
				String mensaje = " Oh vaya! :( \n" + "Su correo y/o clave no son correctos";
				request.setAttribute("mensaje", mensaje);
				request.getRequestDispatcher("inicio.jsp").forward(request, response);
			}
			
	}
	
	protected void registrarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre1 = request.getParameter("txtNombre1");
		String nombre2 = request.getParameter("txtNombre2");
		String apellido1 = request.getParameter("txtApellido1");
		String apellido2 = request.getParameter("txtApellido2");
		String correo = request.getParameter("txtCorreoR");
		String clave = request.getParameter("txtClaveR");
		
		Usuario usu = new Usuario();
		usu.setNombre1(nombre1);
		usu.setNombre2(nombre2);
		usu.setApellido1(apellido1);
		usu.setApellido2(apellido2);
		usu.setCorreo(correo);
		usu.setClave(clave);
		
		HttpSession session = request.getSession();
		session.setAttribute("codigo", String.valueOf(usu.getCodigo()));
		session.setAttribute("correo", usu.getCorreo());
		session.setAttribute("clave", usu.getClave());
		session.setAttribute("nombre1", usu.getNombre1());
		session.setAttribute("nombre2", usu.getNombre2());
		session.setAttribute("apellido1", usu.getApellido1());
		session.setAttribute("apellido2", usu.getApellido2());
								
		DAOFactory df = DAOFactory.obtenerDAOFactory(DAOFactory.MYSQL);
		InterfaceUsuario ie = df.getInterfaceUsuario();
		
		ie.registrarUsuario(usu);
		
		//response.sendRedirect("listadoProductos.jsp");

		request.setAttribute("usuario", usu);
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
		
		
	}

	protected void actualizarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codigoA = Integer.parseInt(request.getParameter("txtCodigoA"));
		String nombre1A = request.getParameter("txtNombre1A");
		String nombre2A = request.getParameter("txtNombre2A");
		String apellido1A = request.getParameter("txtApellido1A");
		String apellido2A = request.getParameter("txtApellido2A");
		String correoA = request.getParameter("txtCorreoA");
		String claveA = request.getParameter("txtClaveA");

		Usuario usu = new Usuario();
		usu.setCodigo(codigoA);
		usu.setCorreo(nombre1A);
		usu.setClave(nombre2A);
		usu.setNombre1(apellido1A);
		usu.setNombre2(apellido2A);
		usu.setApellido1(correoA);
		usu.setApellido2(claveA);

		
		DAOFactory df = DAOFactory.obtenerDAOFactory(DAOFactory.MYSQL);
		InterfaceUsuario ie = df.getInterfaceUsuario();
		
		ie.actualizarUsuario(usu);
		
		//response.sendRedirect("actualizarUsuario.jsp");

		request.setAttribute("usuario", usu);
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
		
	}

}
