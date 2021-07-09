package co.com.carcenter.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.com.carcenter.dto.MecanicoDTO;
import co.com.carcenter.dto.RespuestaDTO;
import co.com.carcenter.repositorio.MecanicoRepositorio;
import co.com.carcenter.repositorio.entidad.Mecanico;
import co.com.carcenter.repositorio.entidad.MecanicoPK;

@Service
public class MecanicoFunciones {

	private final MecanicoRepositorio repositorio;

	MecanicoFunciones(MecanicoRepositorio repositorio) {
		this.repositorio = repositorio;
	}	
	
	public String crearMecanico(MecanicoDTO mecanicoDto) {
		MecanicoPK pk = new MecanicoPK();
		pk.setTipoDocumento(mecanicoDto.getTipoDocumento());
		pk.setDocumento(mecanicoDto.getDocumento());
		
		Mecanico mecanico = new Mecanico();
		mecanico.setCodigo(pk);
		mecanico.setPrimerNombre(mecanicoDto.getPrimerNombre());
		mecanico.setSegundoNombre(mecanicoDto.getSegundoNombre());
		mecanico.setPrimerApellido(mecanicoDto.getPrimerApellido());
		mecanico.setSegundoApellido(mecanicoDto.getSegundoApellido());
		mecanico.setDireccion(mecanicoDto.getDireccion());
		mecanico.setEmail(mecanicoDto.getEmail());
		mecanico.setCelular(mecanicoDto.getCelular());
		mecanico.setEstalibre(true);
		repositorio.save(mecanico);
		return "Se ha guardado la información satisfactoriamente";
	}

	public List<MecanicoDTO> listaAsignar() {
		List<MecanicoDTO> listaDto = new ArrayList<>();
		List<Mecanico> listaEntidades  = repositorio.findParaAsignacion();
		for (Mecanico mecanico : listaEntidades) {
			listaDto.add(new MecanicoDTO().builder()
					.tipoDocumento(mecanico.getCodigo().getTipoDocumento())
					.documento(mecanico.getCodigo().getDocumento())
					.primerNombre(mecanico.getPrimerNombre())
					.primerApellido(mecanico.getPrimerApellido())
					.segundoNombre(mecanico.getSegundoNombre())
					.segundoApellido(mecanico.getSegundoApellido())
					.build());
		}
		return listaDto;
	}
	
}
