package dao;

import interfaces.InterfacePago;
import interfaces.InterfaceUsuario;
import modelos.ModeloPago;
import modelos.ModeloUsuario;

public class MySqlDAOFactory extends DAOFactory {
	
	public InterfaceUsuario getInterfaceUsuario() {
		return new ModeloUsuario();
	}
	
	public InterfacePago getInterfacePago() {
		return new ModeloPago();
	}
}
