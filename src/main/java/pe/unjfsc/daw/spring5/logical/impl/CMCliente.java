package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;


import pe.unjfsc.daw.spring5.entity.CECliente;
import pe.unjfsc.daw.spring5.logical.CICliente;

public class CMCliente implements CICliente{
	private ArrayList<CECliente> ArrayListCECliente;

	public CMCliente() {
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
		
	}

	@Override
	public ArrayList<CECliente> showAll() {
		return ArrayListCECliente;
	}
	
}
