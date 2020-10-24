package pe.unjfsc.daw.spring5.logical.impl;

import java.util.HashSet;


import pe.unjfsc.daw.spring5.entity.CEProducto;
import pe.unjfsc.daw.spring5.logical.CIProducto;

public class CMProducto implements CIProducto{
	
	private HashSet<CEProducto> oListProducto;
	
	public CMProducto() {
		oListProducto = new HashSet<CEProducto>();
		oListProducto.add(new CEProducto(10, "Bebidas", "Gaseosa", "Retornable", "Coca cola", "1.5 lt", 6.00));
		oListProducto.add(new CEProducto(15, "Bebidas", "Gaseosa", "Retornable", "Coca cola", "1.0 lt", 3.50));
		oListProducto.add(new CEProducto(20, "Bebidas", "Gaseosa", "No Retornable", "Coca cola", "500 ml", 2.50));
		oListProducto.add(new CEProducto(25, "Bebidas", "Gaseosa", "Retornable", "Inka cola", "500 ml", 2.50));
		oListProducto.add(new CEProducto(30, "Bebidas", "Gaseosa", "No Retornable", "Inka cola", "2 lt", 6.50));
		oListProducto.add(new CEProducto(35, "Licores", "Cervezas", "Botella", "Pilsen", "650 ml", 6.50));
		oListProducto.add(new CEProducto(40, "Licores", "Cervezas", "Botella", "Cristal", "650 ml", 6.50));
		oListProducto.add(new CEProducto(45, "Lacteos", "Formula de crecimiento", "Nan3", "Nestle", "Liquida", 3.70));
		oListProducto.add(new CEProducto(50, "Lacteos", "Formula lactea", "Nan2", "Nestle", "Liquida", 4.30));
	
	}
	
	public HashSet<CEProducto> showAll() {
		return oListProducto;
	}

}
