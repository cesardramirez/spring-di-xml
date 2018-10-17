package com.udemy.springlocal.desafio;

/**
 * Esta clase define un objeto de la interfaz proveedorMensaje que posteriormente utilizará proveedorSaludo y luego al texto.
 * Por medio del archivo beans.xml es inyectado este objeto (o bean) utilizando el atributo ref del tag <property>.
 */
public class ImprimeMensajeImpl implements ImprimeMensaje {
	
	// Inyectado en el beans.xml
	private ProveedorMensaje proveedorMensaje = null;
	
	@Override
	public ProveedorMensaje getProveedorMensaje() {
		return this.proveedorMensaje;
	}

	@Override
	public void setProveedorMensaje(ProveedorMensaje proveedor) {
		this.proveedorMensaje = proveedor;
		
	}

	@Override
	public void imprimir() {
		if (proveedorMensaje == null) {
			throw new RuntimeException(
					"Debe establecer la propiedad de la clase ProveedorMensaje: "
					+ ImprimeMensajeImpl.class.getName());
		}
		System.out.println(proveedorMensaje.getMensaje());
	}
}
