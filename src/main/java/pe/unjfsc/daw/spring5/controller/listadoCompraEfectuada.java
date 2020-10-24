package pe.unjfsc.daw.spring5.controller;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.unjfsc.daw.spring5.entity.CECompraEfectuada;
import pe.unjfsc.daw.spring5.logical.CICompraEfectuada;

@Controller
public class listadoCompraEfectuada {
	private LinkedHashSet<CECompraEfectuada> oListaCompraEfectuada;
	
	@Autowired
	private CICompraEfectuada oCICompraEfectuada;
	
	@RequestMapping(value = "/listadoCompraEfectuada.eur")
	public ModelAndView LinkedListlistadoCompraEfectuada(HttpServletRequest request,HttpServletResponse response) {
		String lArchivoRealJsp = "jsp03ListadoComprasEfectuadas";
		oListaCompraEfectuada = new LinkedHashSet<>();
		oListaCompraEfectuada = oCICompraEfectuada.showAll();
		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listaCompraEfectuadas", oListaCompraEfectuada);
		return new ModelAndView(lArchivoRealJsp,"model", myModel);
	}
}
