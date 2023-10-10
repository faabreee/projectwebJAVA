package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conexiones.MySqlConexion;
import entidades.Producto;
import entidades.Usuario;

public class modeloProducto {
	
	public void registrarProducto(Producto u) {
		
		Connection con = null;
		PreparedStatement psm = null;
		
		try {
			
			con = MySqlConexion.getConexion();
			String sql = " INSERT INTO minimarket.carrito (idproducto, nombrePro, descripcionPro, precioPro, imagenPro, cantidad) VALUES (?, ?, ?, ?, ?, ?)";
			psm = con.prepareStatement(sql);
			
			psm.setInt(1, u.getIdproducto());
			psm.setString(2, u.getNombrePro());
			psm.setString(3, u.getDescripcionPro());
			psm.setDouble(4, u.getPrecioPro());
			psm.setString(4, u.getImagenPro());
			psm.setInt(4, u.getcantidad());

			
			psm.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psm != null)
					psm.close();
				if(con != null)
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
