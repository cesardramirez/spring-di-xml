package com.udemy.springlocal.desafio;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		BeanFactory context = getBeanFactory();
		
		// Se obtiene el bean según su nombre.
		ImprimeMensaje msj = (ImprimeMensaje) context.getBean("renderer");
		msj.imprimir();
	}
	
	/**
	 * Se obtiene el acceso al contenedor de Spring (contexto) y así obtener los beans.
	 * @return factory
	 * @throws Exception
	 */
	private static BeanFactory getBeanFactory() throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
		return factory;
	}

}
