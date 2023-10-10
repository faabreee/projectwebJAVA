package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conexiones.MySqlConexion;
import entidades.Pago;
import entidades.Usuario;
import interfaces.InterfacePago;

public class ModeloPago implements InterfacePago{
	public void registrarPago(Pago p) {
		
		Connection con = null;
		PreparedStatement psm = null;
		
		try {
			
			con = MySqlConexion.getConexion();
			String sql = " INSERT INTO minimarket.detallepago (idCliente, nombre1Cliente, nombre2Cliente, apellido1Cliente, apellido2Cliente, provincia, distrito, referencia, metodoPago, fecha, importeSub, importeTotal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			psm = con.prepareStatement(sql);
			
			psm.setInt(1, p.getIdCliente());
			psm.setString(2, p.getNombre1Cliente());
			psm.setString(3, p.getNombre2Cliente());
			psm.setString(4, p.getApellido1Cliente());
			psm.setString(5, p.getApellido2Cliente());
			psm.setString(6, p.getProvincia());
			psm.setString(7, p.getDistrito());
			psm.setString(8, p.getReferencia());
			psm.setString(9, p.getMetodoPago());
			psm.setString(10, p.getFecha());
			psm.setDouble(11, p.getImporteSub());
			psm.setDouble(12, p.getImporteTotal());
			
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
	
	public void eliminarPedido(int idPago) {
		Connection con = null;
		PreparedStatement psm = null;
		
		try {
			
			con = MySqlConexion.getConexion();
			String sql = "DELETE FROM detallepago WHERE idPago = ?;";
			psm = con.prepareStatement(sql);
			
	        psm.setInt(1, idPago);
			
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
