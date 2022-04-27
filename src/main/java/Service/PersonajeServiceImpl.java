
package Service;

import entitis.Personaje;
import java.util.List;

public interface PersonajeServiceImpl {
    
    List <Personaje> listarPersonaje();
    
    void eliminarPersonaje (Integer id);
    
    void crearPersonaje (Personaje personaje);
    
    Personaje findByIdPersonaje (Integer id);
    
    Personaje buscarPorNombre (String nombre);
      
}
