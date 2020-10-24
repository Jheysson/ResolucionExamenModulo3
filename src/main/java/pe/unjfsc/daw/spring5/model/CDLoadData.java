package pe.unjfsc.daw.spring5.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import pe.unjfsc.daw.spring5.entity.CECliente;
import pe.unjfsc.daw.spring5.entity.CECompraEfectuada;
import pe.unjfsc.daw.spring5.entity.CEProducto;

public class CDLoadData {
	
	private HashSet<CEProducto> oListProducto;
	private ArrayList<CECliente> ArrayListCECliente;
	private LinkedHashSet<CECompraEfectuada> oListaCompraEfectuada;
	
	public CDLoadData() {
		loadProducto();
		loadCliente();
		loadCompraEfectuadas();
	}
	
	public HashSet<CEProducto> loadProducto(){
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
		return oListProducto;
	}
	public ArrayList<CECliente> loadCliente(){
		ArrayListCECliente = new ArrayList<CECliente>();
		ArrayListCECliente.add(new CECliente("0333132031", "PEREZ RIVERA GIANELA ESTHER", "0333132031@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333092018", "ALCANTARA MIRANDA CARLOS ENRIQUE", "0333132030@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333141002", "ARAMBULO AQUIJES GEAN PAUL ALEX", "0333141002@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161007", "BORDA NONATO CARLOS ALONSO", "0333161007@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161010", "CHAVEZ OBREGON LEONEL GUILLERMO", "0333161010@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161014", "FELIX ESCALANTE AMGEL GABINO", "0333161014@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333152007", "FLORES BRONCANO PEDRO CESAR", "0333152007@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333111040", "FLORES ROMERO EBLE CHRISTIAN", "0333111040@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333132017", "GARGATE TARAZONA JHIMI RUSVEL", "0333132017@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333152034", "LA ROSA FERNANDEZ ANGELA ELIZAB", "0333152034@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333142015", "LANDA SOLIS JUNIOR IVAN", "0333142015@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333151023", "MENDOZA SAMAN LEIDY VANESSA", "0333151023@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161030", "MUNAYCO PERALTA JERCY BRYAN", "0333161030@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333142025", "NARVASTA VELAZCO ANTHONY JHONAT", "0333142025@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161033", "OLORTIGUE JIMENEZ KENT NAY", "0333161033@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161045", "SANCHEZ CASTRO ROBERTO FREDI", "0333161034@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161046", "URBANO LINO JHEYSSON JESUS", "0333161045@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161048", "VARGAS LEON BEATRIZ MILAGRITOS", "0333161047@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161049", "ZELAYA HUERTA CLAUDIA JULISA", "0333161046@unjfsc.edu.pe"));
		ArrayListCECliente.add(new CECliente("0333161040", "ZEVALLOS SALAS DELMER FRANCISCO", "0333161040@unjfsc.edu.pe"));
		return ArrayListCECliente;
	}
	
	public LinkedHashSet<CECompraEfectuada> loadCompraEfectuadas(){
		oListaCompraEfectuada = new LinkedHashSet<CECompraEfectuada>();
		oListaCompraEfectuada.add(new CECompraEfectuada(1, "0333132031", "PEREZ RIVERA GIANELA ESTHER", "17/102020", 10, "", 2.00, 6.00, 20.00));
		oListaCompraEfectuada.add(new CECompraEfectuada(2, "0333152034", "LA ROSA FERNANDEZ ANGELA ELIZAB", "16/10/2020", 15, "", 4.00, 4.50, 14.00));
		oListaCompraEfectuada.add(new CECompraEfectuada(3, "0333152034", "LA ROSA FERNANDEZ ANGELA ELIZAB", "16/10/2020", 20, "", 6.00, 2.50, 15.00));
		oListaCompraEfectuada.add(new CECompraEfectuada(4, "0333151023", "MENDOZA SAMAN LEIDY VANESSA", "15/10/2020", 25, "", 8.00, 2.50, 20.00));
		return oListaCompraEfectuada;
	}
}
