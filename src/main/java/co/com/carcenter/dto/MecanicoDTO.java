package co.com.carcenter.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import co.com.carcenter.repositorio.entidad.Mecanico;
import co.com.carcenter.repositorio.entidad.MecanicoPK;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MecanicoDTO {
	
	private String tipoDocumento;
	private Integer documento;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String celular;
	private String direccion;
	private String email;
	private String estado;

	
	public MecanicoDTO() {
		
	}

}
