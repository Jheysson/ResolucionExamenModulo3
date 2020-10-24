package pe.unjfsc.daw.spring5.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.unjfsc.daw.spring5.entity.CECliente;
import pe.unjfsc.daw.spring5.logical.CICliente;

@Controller
public class listadoCliente {
	
	private ArrayList<CECliente> oListacliente;
	
	@Autowired
	private CICliente oCICliente;

	
	@RequestMapping(value = "listadoCliente.eur")
	public ModelAndView ArraylistlistadoCliente(HttpServletRequest request,HttpServletResponse response) {
		String lArchivoRealJsp = "jsp02ListadoClientes";
		oListacliente = new ArrayList<>();
		oListacliente = oCICliente.showAll();
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listaCliente", oListacliente);
		return new ModelAndView(lArchivoRealJsp,"model", myModel);
	}
}
