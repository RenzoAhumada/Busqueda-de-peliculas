
package Repository;

import entitis.Personaje;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository {
    
    Optional<Personaje> findByNombre(String nombre);

}
