package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import entidades.ArrayProducto;
import entidades.Producto;
import entidades.Usuario;
import interfaces.InterfaceUsuario;
import modelos.modeloProducto;

/**
 * Servlet implementation class ServletCarrito
 */
@WebServlet("/ServletCarrito")
public class ServletCarrito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCarrito() {
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
	            case "AgregarCarrito":
	                agregarCarrito(request, response, session);
	                break;
	            case "eliminar":
	                eliminarCarrito(request, response, session);
	                break;
                case "Ir a Pagar":
                    procesarCarrito(request, response, session);
                    break;
                default:
                    break;
	        }
	    } else {
	        // Manejar el caso en el que el parámetro "tipo" no esté presente o sea nulo
	        // Puedes mostrar un mensaje de error, redireccionar a una página de error, etc.
	    }
		
	}

	private void agregarCarrito(HttpServletRequest request, HttpServletResponse response, HttpSession session)
            throws ServletException, IOException {
        String idProductoStr = request.getParameter("idProducto");
        String nombrePro = request.getParameter("nombrePro");
        String descripcionPro = request.getParameter("descripcionPro");
        String precioProStr = request.getParameter("precioPro");
        String imagenPro = request.getParameter("imagenPro");
        String cantidadStr = request.getParameter("cantidadHidden");

        // Verificar si los valores son nulos o vacíos
        if (idProductoStr == null || nombrePro == null || descripcionPro == null || precioProStr == null
                || imagenPro == null || cantidadStr == null || idProductoStr.isEmpty() || nombrePro.isEmpty()
                || descripcionPro.isEmpty() || precioProStr.isEmpty() || imagenPro.isEmpty() || cantidadStr.isEmpty()) {
            // Manejar el error o redireccionar a una página de error
            // Por ejemplo, mostrar un mensaje de error y redirigir al inicio
            request.setAttribute("error", "Faltan datos para agregar al carrito");
            request.getRequestDispatcher("inicio.jsp").forward(request, response);
            return;
        }

        int idproducto = Integer.parseInt(idProductoStr);
        double precioPro = Double.parseDouble(precioProStr);
        int cantidad = Integer.parseInt(cantidadStr);

        Producto p = new Producto();
        p.setIdproducto(idproducto);
        p.setNombrePro(nombrePro);
        p.setDescripcionPro(descripcionPro);
        p.setPrecioPro(precioPro);
        p.setImagenPro(imagenPro);
        p.setcantidad(cantidad);

        ArrayProducto arrayProducto = (ArrayProducto) session.getAttribute("listaProducto");

        if (arrayProducto == null) {
            arrayProducto = new ArrayProducto();
        }
        
        Producto productoExistente = arrayProducto.buscarProducto(idproducto);
        
        if (productoExistente != null) {
            // Si el producto ya existe, incrementar la cantidad
            productoExistente.setcantidad(productoExistente.getcantidad() + cantidad);
        } else {
            // Si el producto no existe, agregarlo al carrito
            Producto pro = new Producto();
            pro.setcantidad(cantidad);
            arrayProducto.agregarProducto(p);
        }
        
        session.setAttribute("listaProducto", arrayProducto);


        request.getRequestDispatcher("listadoProductos.jsp").forward(request, response);
    }

	private void eliminarCarrito(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        String eliminarIdProducto = request.getParameter("eliminarIdProducto");

	    if (eliminarIdProducto != null && !eliminarIdProducto.isEmpty()) {
	        int idProducto = Integer.parseInt(eliminarIdProducto);

	        ArrayProducto arrayProducto = (ArrayProducto) session.getAttribute("listaProducto");

	        if (arrayProducto != null) {
	            arrayProducto.eliminarProducto(idProducto);
	            session.setAttribute("listaProducto", arrayProducto);
	        }
	    }
	    ArrayProducto arrayProductoActualizado = (ArrayProducto) session.getAttribute("listaProducto");
	    if (arrayProductoActualizado != null && arrayProductoActualizado.getProductos().isEmpty()) {
	        // Si el carrito está vacío, redirigir a una página diferente (por ejemplo, a una página de carrito vacío)
	        request.getRequestDispatcher("carrito.jsp").forward(request, response);
	    } else {
	        // Si el carrito no está vacío, redirigir a la misma página del carrito
	        request.getRequestDispatcher("carrito.jsp").forward(request, response);
	    }
	}
   
	private void procesarCarrito(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        
        String total = request.getParameter("total");
        session.setAttribute("total", total);
        request.getRequestDispatcher("pago.jsp").forward(request, response);
    }
	
}
