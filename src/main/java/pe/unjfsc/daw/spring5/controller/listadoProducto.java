package pe.unjfsc.daw.spring5.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.unjfsc.daw.spring5.entity.CEProducto;
import pe.unjfsc.daw.spring5.logical.CIProducto;

@Controller
public class listadoProducto {
	

	private HashSet<CEProducto> oListaProducto;
	
	@Autowired
	private CIProducto oCIProducto;
	
	@RequestMapping(value = "listadoProducto.eur")
	public ModelAndView HashSetlistadoProducto(HttpServletRequest request,HttpServletResponse response) {
		String lArchivoRealJsp = "jsp01ListadoProductos";
		oListaProducto = new HashSet<>();
		oListaProducto = oCIProducto.showAll();
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listaProducto", oListaProducto);
		return new ModelAndView(lArchivoRealJsp,"model", myModel);
	}
}
