
package Repository;

import entitis.Genero;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GeneroRepository   extends JpaRepository{
        
    Optional<Genero> findByNombre(String nombre);


}
