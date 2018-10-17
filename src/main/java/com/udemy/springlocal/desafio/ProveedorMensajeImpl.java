package com.udemy.springlocal.desafio;

/**
 * Esta clase define un objeto de la interfaz proveedorSaludo (name y ref).
 * Por medio del archivo beans.xml es inyectado este objeto (o bean) utilizando el atributo ref del tag <property>.
 */
public class ProveedorMensajeImpl implements ProveedorMensaje {
	
	// Inyectado en el beans.xml
	private ProveedorSaludo proveedorSaludo;

	@Override
	public ProveedorSaludo getProveedorSaludo() {
		return this.proveedorSaludo;
	}

	@Override
	public void setProveedorSaludo(ProveedorSaludo proveedor) {
		this.proveedorSaludo = proveedor;
		
	}

	@Override
	public String getMensaje() {
		return this.proveedorSaludo.getSaludo();
	}
}
