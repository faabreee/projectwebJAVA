package modelos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import conexiones.MySqlConexion;
import entidades.Producto;
import entidades.Usuario;
import interfaces.InterfaceUsuario;

public class ModeloUsuario implements InterfaceUsuario {
	
	public Usuario verificarCorreo(Usuario u) {
		
		Usuario user = null;
		Connection con = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		
		try {
			
			con = MySqlConexion.getConexion();
			String sql = "SELECT * FROM usuarios WHERE correo = ? AND clave = ?";
			psm = con.prepareStatement(sql);
			
			psm.setString(1, u.getCorreo());
			psm.setString(2, u.getClave());
			
			rs = psm.executeQuery();
			
			if(rs.next()) {
				user = new Usuario();
				user.setCodigo(rs.getInt(1));
				user.setCorreo(rs.getString(2));
				user.setClave(rs.getString(3));
				user.setNombre1(rs.getString(4));
				user.setNombre2(rs.getString(5));
				user.setApellido1(rs.getString(6));
				user.setApellido2(rs.getString(7));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psm != null)
					psm.close();
				if(rs != null)
					rs.close();
				if(con != null)
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
		
			}

		}
		
		return user;
	}
	
	public void registrarUsuario(Usuario u) {
		
		Connection con = null;
		PreparedStatement psm = null;
		
		try {
			
			con = MySqlConexion.getConexion();
			String sql = " INSERT INTO minimarket.usuarios (correo, clave, nombre1, nombre2, apellido1, apellido2) VALUES (?, ?, ?, ?, ?, ?)";
			psm = con.prepareStatement(sql);
			
			psm.setString(1, u.getCorreo());
			psm.setString(2, u.getClave());
			psm.setString(3, u.getNombre1());
			psm.setString(4, u.getNombre2());
			psm.setString(5, u.getApellido1());
			psm.setString(6, u.getApellido2());

			
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
	
	
	
	public List listar() {
		
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		
		List<Producto>lista = new ArrayList<>();
		String sql = "select * from productos";
		try {
            con = MySqlConexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
            	Producto p = new Producto();
            	p.setIdproducto(rs.getInt(1));
            	p.setNombrePro(rs.getString(2));
            	p.setDescripcionPro(rs.getString(3));
            	p.setPrecioPro(rs.getDouble(4));
            	p.setImagenPro(rs.getNString(5));
            	lista.add(p);
            }
            
		} catch (Exception e) {
		}
		return lista;
	}
	
	public void listarImg(int id, HttpServletResponse response) {
		
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		
		String sql = "select * from productos where idproducto="+id;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		response.setContentType("images/*");
		
		try {
            con= MySqlConexion.getConexion();
            ps = con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            if(rs.next()) {
            	inputStream = rs.getBinaryStream("imagenPro");
            	
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;
            while((i=bufferedInputStream.read())!=-1) {
            	bufferedOutputStream.write(i);
            }
            
			
		} catch (Exception e) {

            
		}
		
	}
	
	
	
public void actualizarUsuario(Usuario u) {
		
		Connection con = null;
		PreparedStatement psm = null;
		String sql = "CALL actualizarUsuario(?, ?, ?, ?, ?, ?, ?)";
		try {
		    con = MySqlConexion.getConexion();
		    psm = con.prepareStatement(sql);
		    psm.setInt(1, u.getCodigo());
		    psm.setString(2, u.getCorreo());
		    psm.setString(3, u.getClave());
		    psm.setString(4, u.getNombre1());
		    psm.setString(5, u.getNombre2());
		    psm.setString(6, u.getApellido1());
		    psm.setString(7, u.getApellido2());
	
		    psm.executeUpdate();
		} catch (SQLException ex) {
		    ex.printStackTrace();
		} finally {
		    try {
		        if (psm != null)
		            psm.close();
		        if (con != null)
		            con.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}

		}
	
}
