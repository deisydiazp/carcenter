package co.com.carcenter.repositorio.entidad;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "MANTENIMIENTO")
public class Mantenimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "ESTADO")
	private Integer estado;
	
	@ManyToOne
	private Vehiculo vehiculo;
	
	@Column(name = "FECHA")
	private LocalDate fecha;
	
	@ManyToOne
	private Mecanico mecanico;
	
	@JsonBackReference
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Foto> fotos;
	
	@OneToMany(mappedBy = "mantenimiento")
	private List<RepuestoMantenimiento> repuestosMantenimiento;
	
	@OneToMany(mappedBy = "mantenimiento")
	private List<ServicioMantenimiento> serviciosMantenimiento;
	
}
