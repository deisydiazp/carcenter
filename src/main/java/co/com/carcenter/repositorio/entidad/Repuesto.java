package co.com.carcenter.repositorio.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "REPUESTO")
public class Repuesto {

	@Id
	@Column(name = "CODIGO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "NOMBRE_REPUESTO", length=100)
	private String nombreRepuesto;
	
	@Column(name = "PRECIO_UNITARIO")
	private Double precioUnitario;
	
	@Column(name = "UNIDADES_INVENTARIO")
	private Integer unidadesInventario;
	
	@Column(name = "PROVEEDOR", length=300)
	private String proveedor;
}
