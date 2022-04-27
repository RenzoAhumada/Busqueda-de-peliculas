
package Service;

import Repository.GeneroRepository;
import entitis.Genero;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService implements GeneroServiceImpl {
    
    
    @Autowired
    private GeneroRepository generorepository;
    
    @Override
    @Transactional
    public List<Genero> listarGenero() {
        return generorepository.findAll();
    }
    
    @Override
    @Transactional
    public void eliminarGenero(Integer id) {
        generorepository.delete(findByIdGenero(id));
    }

    @Override
    public void crearGenero(Genero genero) {
        generorepository.save(genero);
    }
    
    @Override
    @Transactional
    public Genero findByIdGenero(Integer id) {
        return (Genero) generorepository.findById(id).orElse(null);
    }
    
    @Override
    public Genero buscarPorNombre(String nombre) {
       return (Genero) generorepository.findByNombre(nombre).orElse(null);
    }
    
}
