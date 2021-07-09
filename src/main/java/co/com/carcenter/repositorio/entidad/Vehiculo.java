package co.com.carcenter.repositorio.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name = "VEHICULO")
public class Vehiculo {

	@Id
	@Column(name = "PLACA", length = 6)
	private String placa;
	
	@Column(name = "COLOR", length = 30)
	private String color;
	
	@ManyToOne
	private Marca marca;
	
	@ManyToOne
	private Cliente cliente;
}
