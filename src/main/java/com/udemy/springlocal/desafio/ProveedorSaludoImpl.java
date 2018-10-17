package com.udemy.springlocal.desafio;

/**
 * Esta clase utiliza un string, que es donde se va a almacenar el saludo.
 */

public class ProveedorSaludoImpl implements ProveedorSaludo {

    // El valor es asignado en el beans.xml
    private String saludo;

    @Override
    public String getSaludo() {
        return this.saludo;
    }

    @Override
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}
