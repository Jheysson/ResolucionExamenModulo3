package pe.unjfsc.daw.spring5.logical.impl;

//import java.util.Iterator;
import java.util.LinkedHashSet;

import pe.unjfsc.daw.spring5.entity.CECompraEfectuada;
//import pe.unjfsc.daw.spring5.entity.CEProducto;
import pe.unjfsc.daw.spring5.logical.CICompraEfectuada;

public class CMCompraEfectuada implements CICompraEfectuada{
	
	//private String Producto="";
	private LinkedHashSet<CECompraEfectuada> oListaCompraEfectuada;
	//private LinkedHashSet<CEProducto> oListaProducto;
	//private CEProducto moCEProducto;
	
	public CMCompraEfectuada() {
		oListaCompraEfectuada = new LinkedHashSet<CECompraEfectuada>();
		oListaCompraEfectuada.add(new CECompraEfectuada(1, "0333132031", "PEREZ RIVERA GIANELA ESTHER", "17/102020", 10, "a", 2.00, 6.00, 20.00));
		oListaCompraEfectuada.add(new CECompraEfectuada(2, "0333152034", "LA ROSA FERNANDEZ ANGELA ELIZAB", "16/10/2020", 15, "a", 4.00, 4.50, 14.00));
		oListaCompraEfectuada.add(new CECompraEfectuada(3, "0333152034", "LA ROSA FERNANDEZ ANGELA ELIZAB", "16/10/2020", 20, "a", 6.00, 2.50, 15.00));
		oListaCompraEfectuada.add(new CECompraEfectuada(4, "0333151023", "MENDOZA SAMAN LEIDY VANESSA", "15/10/2020", 25, "a", 8.00, 2.50, 20.00));
	}
	
	@Override
	public LinkedHashSet<CECompraEfectuada> showAll() {
		return oListaCompraEfectuada;
	}
	
	/*private String buscarProducto(int idProducto) {
		Iterator<CEProducto> it = oListaProducto.iterator();
		while (it.hasNext()){
			moCEProducto = it.next();
			if(moCEProducto.getId() == idProducto) {
				Producto = moCEProducto.getModelo()+"/"+moCEProducto.getMarca();
			}
		}
		return Producto;
	}*/
	
}
