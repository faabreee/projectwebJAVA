package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConexion {
	
	public static Connection getConexion() {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/minimarket";
			String user = "root";
			String pass = "1970";
			con = DriverManager.getConnection(url, user, pass);
		}catch (ClassNotFoundException e) {
			System.out.println("Error...Driver no instalado"+e.getMessage());
		}catch(SQLException e) {
			System.out.println("Error...Conexion con la bd"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Error...General"+e.getMessage());
		}
		
		return con;
	}
}
