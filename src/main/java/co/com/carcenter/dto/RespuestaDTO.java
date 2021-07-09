package co.com.carcenter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public final class RespuestaDTO<T> {

	private final T contenido;
	private final Boolean exitoso;
	private final String mensaje;

	public RespuestaDTO(@JsonProperty("contenido") T contenido) {
		this(null, contenido, null);
	}

	public RespuestaDTO(@JsonProperty("exitoso") Boolean exitoso, 
			@JsonProperty("contenido") T contenido,
			@JsonProperty("mensaje") String mensaje) {
		this.contenido = contenido;
		this.exitoso = exitoso;
		this.mensaje = mensaje;
	}
}