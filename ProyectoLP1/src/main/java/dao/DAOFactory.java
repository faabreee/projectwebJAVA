package dao;

import interfaces.InterfacePago;
import interfaces.InterfaceUsuario;

public abstract class DAOFactory {
	public static final int MYSQL = 1;

	public static final int SQLSERVER = 2;

	public static final int ORACLE = 3;

	public abstract InterfaceUsuario getInterfaceUsuario();
	
	public abstract InterfacePago getInterfacePago();
	
	
	public static DAOFactory obtenerDAOFactory(int tipo) {

		switch(tipo) {
			case MYSQL: return new MySqlDAOFactory();
			case SQLSERVER: return null;
			case ORACLE: return null;
			default: return null;
		}
	}
}
