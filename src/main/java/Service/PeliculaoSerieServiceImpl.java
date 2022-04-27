
package Service;

import entitis.PeliculaoSerie;
import java.util.List;

/**
 *
 * @author RenzoAhumada
 */
public interface PeliculaoSerieServiceImpl {
    
    
    List <PeliculaoSerie> listarPeliculaoSerie();
    
    void eliminarPeliculaoSerie (Integer id);
    
    void crearPeliculaoSerie (PeliculaoSerie peliculaoSerie);
    
    PeliculaoSerie findByIdPeliculaoSerie (Integer id);
    
    PeliculaoSerie buscarPorNombre (String nombre);


      
}

