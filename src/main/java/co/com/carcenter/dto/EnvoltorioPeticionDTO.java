package co.com.carcenter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public final class EnvoltorioPeticionDTO<T> {
	/**
	 * El contenido de la peticion
	 */

	@JsonProperty("contenido")
	private T contenido;


}

