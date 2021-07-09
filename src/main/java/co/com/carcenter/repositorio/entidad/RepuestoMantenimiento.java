package co.com.carcenter.repositorio.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "REPUESTO_MANTENIMIENTO")
public class RepuestoMantenimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "UNIDADES")
	private Integer unidades;
	
	@Column(name = "TIEMPO_ESTIMADO")
	private Integer tiempoEstimado;
	
	@ManyToOne
	private Repuesto repuesto;
	
	@ManyToOne
	private Mantenimiento mantenimiento;
}
