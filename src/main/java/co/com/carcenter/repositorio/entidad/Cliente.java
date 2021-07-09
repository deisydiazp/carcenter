package co.com.carcenter.repositorio.entidad;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@EmbeddedId
	private ClientePK codigo;
	
	@Column(name = "PRIMER_NOMBRE", length = 30)
	private String primerNombre;

	@Column(name = "SEGUNDO_NOMBRE", length = 30)		
	private String segundoNombre;
	
	@Column(name = "PRIMER_APELLIDO", length = 30)
	private String primerApellido;
	
	@Column(name = "SEGUNDO_APELLIDO", length = 30)
	private String segundoApellido;
	
	@Column(name = "CELULAR", length = 10)
	private String celular;
	
	@Column(name = "DIRECCION", length = 200)
	private String direccion;
	
	@Column(name = "EMAIL", length = 100)
	private String email;

}
