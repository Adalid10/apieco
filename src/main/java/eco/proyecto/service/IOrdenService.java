package eco.proyecto.service;

import java.util.List;
import java.util.Optional;

import eco.proyecto.model.Orden;
import eco.proyecto.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
