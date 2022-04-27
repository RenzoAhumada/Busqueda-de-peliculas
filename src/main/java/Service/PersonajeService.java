/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Repository.PersonajeRepository;
import entitis.Personaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RenzoAhumada
 */

@Service
public class PersonajeService  implements PersonajeServiceImpl{

    @Autowired
    private PersonajeRepository personajerepository;
    
    @Override
    public List<Personaje> listarPersonaje() {
        return personajerepository.findAll();
    }

    @Override
    public void eliminarPersonaje(Integer id) {
        personajerepository.delete(id);
    }

    @Override
    public void crearPersonaje(Personaje personaje) {
       personajerepository.save(personaje);
    }

    @Override
    public Personaje findByIdPersonaje(Integer id) {
        return (Personaje) personajerepository.findById(id).orElse(null);
    }

    @Override
    public Personaje buscarPorNombre(String nombre) {
       return (Personaje) personajerepository.findByNombre(nombre).orElse(null);
    }
    
    
}
