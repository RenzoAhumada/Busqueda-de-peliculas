
package Service;

import entitis.Genero;
import java.util.List;

/**
 *
 * @author RenzoAhumada
 */
public interface GeneroServiceImpl {
        
    List <Genero> listarGenero();
    
    void eliminarGenero (Integer id);
    
    void crearGenero(Genero genero);
    
    Genero findByIdGenero (Integer id);
    
    Genero buscarPorNombre (String nombre);
      
}

