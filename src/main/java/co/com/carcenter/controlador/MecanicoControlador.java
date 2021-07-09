package co.com.carcenter.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.carcenter.dto.EnvoltorioPeticionDTO;
import co.com.carcenter.dto.MecanicoDTO;
import co.com.carcenter.dto.RespuestaDTO;


@RestController
@RequestMapping("/mecanico")
@CrossOrigin(origins = "*")
public class MecanicoControlador {

	private final MecanicoFunciones funciones;

	MecanicoControlador(MecanicoFunciones funciones) {
		this.funciones = funciones;
	}
	
	
	@ResponseBody
	@PostMapping(path = "/crear")
	public RespuestaDTO<String> crear(@RequestBody EnvoltorioPeticionDTO<MecanicoDTO> peticion) {
		return new RespuestaDTO<>(funciones.crearMecanico(peticion.getContenido()));
	}


	@ResponseBody
	@GetMapping(path = "/asignar")
	public RespuestaDTO<List<MecanicoDTO>> listaAsignar() {
		return new RespuestaDTO<>(funciones.listaAsignar());
	}
}
