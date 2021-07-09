package co.com.carcenter.repositorio.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClientePK implements Serializable{
	
	@Column(name = "TIPO_DOCUMENTO", nullable = false, length = 2)
	private String tipoDocumento;
	
	@Column(name = "DOCUMENTO", nullable = false)
	private Integer documento;
}
