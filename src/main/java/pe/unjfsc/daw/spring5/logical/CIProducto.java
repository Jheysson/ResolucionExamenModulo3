package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CEProducto;

public interface CIProducto {
	public HashSet<CEProducto> showAll();
}
