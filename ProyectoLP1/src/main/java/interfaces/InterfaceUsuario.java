package interfaces;

import entidades.Usuario;

public interface InterfaceUsuario {

	public Usuario verificarCorreo(Usuario u);
	
	public void registrarUsuario(Usuario usu);
	public void actualizarUsuario(Usuario u) ;

}
