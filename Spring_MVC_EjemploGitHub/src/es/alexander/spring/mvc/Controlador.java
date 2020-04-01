package es.alexander.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	@RequestMapping
	public String muestraPagina(){
		//Aqui le decimos que pagina deve correr primero
		return "paginaEjemplo";
	}
}
