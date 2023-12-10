package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestContenidoCelda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Celda celda = new Celda("L0356");
		Celda celda2 = new Celda("M0547");
		Producto p = new Producto("Lapto", 750, "L0356");
		Producto p2 = new Producto("Mouse", 23, "M0547");

		celda.setProducto(p);
		celda2.setProducto(p2);
		celda.setStock(5);
		celda2.setStock(15);
		
		System.out.println("--------------DATOS----------");
		
		
		celda.imprimir();
		celda2.imprimir();
	}

}
