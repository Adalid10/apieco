package eco.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eco.proyecto.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
