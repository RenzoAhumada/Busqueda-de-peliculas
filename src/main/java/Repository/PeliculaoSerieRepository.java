package Repository;

import entitis.PeliculaoSerie;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RenzoAhumada
 */

@Repository
public interface PeliculaoSerieRepository extends JpaRepository {
    
        Optional<PeliculaoSerie> findByNombre(String nombre);


}
    
