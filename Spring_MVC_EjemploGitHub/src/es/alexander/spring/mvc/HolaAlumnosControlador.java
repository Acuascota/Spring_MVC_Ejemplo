package es.alexander.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {
	
	//Este metodo proporciona el Formulario
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(){
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaSpring";
	}
	
	//metodo paara
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request,Model modelo) {
		String nombre=request.getParameter("nombreAlumno");
		nombre+=" es el mejor programador";
		String mensajeFinal="Quien es el mejor programador? "+nombre;
		
		//Agregando informacion al modelo
		modelo.addAttribute("mensajeClaro",mensajeFinal);
		
		return "HolaSpring";
	}

}
