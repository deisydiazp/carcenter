package co.com.carcenter.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.com.carcenter.repositorio.entidad.Mecanico;

public interface MecanicoRepositorio extends CrudRepository<Mecanico, Integer>{

	List<Mecanico> findAll();

	@Query("SELECT m.mecanico FROM Mantenimiento m ")
	List<Mecanico> findParaAsignacion();
}
