package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import java.sql.Date;
import entidades.Pago;
import entidades.Usuario;
import interfaces.InterfacePago;
import interfaces.InterfaceUsuario;

/**
 * Servlet implementation class ServletPago
 */
@WebServlet("/ServletPago")
public class ServletPago extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPago() {
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

	    // Verificar si el parámetro "tipo" está presente y no es nulo
	    if (tipo != null && !tipo.isEmpty()) {
	        switch(tipo) {
	            case "Hacer Pedido":
	            	agregar(request, response, session);
	                break;
	            case "Eliminar":
	            	eliminarPedido(request, response, session);
	                break;
	            default:
	                // Manejar el caso en el que el valor del parámetro "tipo" no coincida con ninguna opción válida
	                // Puedes mostrar un mensaje de error, redireccionar a una página de error, etc.
	                break;
	        }
	    } else {
	        // Manejar el caso en el que el parámetro "tipo" no esté presente o sea nulo
	        // Puedes mostrar un mensaje de error, redireccionar a una página de error, etc.
	    }
		
	}
	
	protected void agregar(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
	    int idCliente = Integer.parseInt(request.getParameter("txtidCliente"));
	    String Nombre1Cliente = request.getParameter("txtNombre1Cliente");
	    String Nombre2Cliente = request.getParameter("txtNombre2Cliente");
	    String Apellido1Cliente = request.getParameter("txtApellido1Cliente");
	    String Apellido2Cliente = request.getParameter("txtApellido2Cliente");
	    String Provincia = request.getParameter("txtProvincia");
	    String Distrito = request.getParameter("txtDistrito");
	    String Referencia = request.getParameter("txtReferencia");
	    String Metodo = request.getParameter("txtMetodo");
	    String Fecha = request.getParameter("txtFecha");

	    double ImporteSub = 0.0;
	    String importeSubString = request.getParameter("txtImporteSub");
	    if (importeSubString != null && !importeSubString.isEmpty()) {
	        ImporteSub = Double.parseDouble(importeSubString);
	    }

	    double Importetotal = 0.0;
	    String importeTotalString = request.getParameter("txtImportetotal");
	    if (importeTotalString != null && !importeTotalString.isEmpty()) {
	        Importetotal = Double.parseDouble(importeTotalString);
	    }


	    
	    Pago pa = new Pago();
	    pa.setIdCliente(idCliente);
	    pa.setNombre1Cliente(Nombre1Cliente);
	    pa.setNombre2Cliente(Nombre2Cliente);
	    pa.setApellido1Cliente(Apellido1Cliente);
	    pa.setApellido2Cliente(Apellido2Cliente);
	    pa.setProvincia(Provincia);
	    pa.setDistrito(Distrito);
	    pa.setReferencia(Referencia);
	    pa.setMetodoPago(Metodo);
	    pa.setFecha(Fecha);
	    pa.setImporteSub(ImporteSub);
	    pa.setImporteTotal(Importetotal);

	    DAOFactory df = DAOFactory.obtenerDAOFactory(DAOFactory.MYSQL);
	    InterfacePago ie = df.getInterfacePago();

	    ie.registrarPago(pa);

	    request.setAttribute("pago", pa);
	    request.getRequestDispatcher("mensajePedido.jsp").forward(request, response);
	}


	protected void eliminarPedido(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
		
		int codigoPedido = Integer.parseInt(request.getParameter("txtidPago"));
		
	    DAOFactory df = DAOFactory.obtenerDAOFactory(DAOFactory.MYSQL);
	    InterfacePago ie = df.getInterfacePago();
		
		ie.eliminarPedido(codigoPedido);
		
	    request.getRequestDispatcher("listadoPedidos.jsp").forward(request, response);
	}
	

}
