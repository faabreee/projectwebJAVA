package interfaces;

import entidades.Pago;

public interface InterfacePago {
	
	public void registrarPago(Pago p);
	
	public void eliminarPedido(int idPago);

}
