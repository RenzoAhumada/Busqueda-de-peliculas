/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Repository.PeliculaoSerieRepository;
import entitis.PeliculaoSerie;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RenzoAhumada
 */

@Service
public class PeliculaoSerieService implements PeliculaoSerieServiceImpl {

    @Autowired
    private PeliculaoSerieRepository peliculaoserierepository;
    
    @Override
    @Transactional
    public List<PeliculaoSerie> listarPeliculaoSerie() {
        return peliculaoserierepository.findAll();
    }

    @Override
    @Transactional
    public void eliminarPeliculaoSerie(Integer id) {
        peliculaoserierepository.delete(findByIdPeliculaoSerie(id));
    }

    @Override
    @Transactional
     public void crearPeliculaoSerie(PeliculaoSerie peliculaoserie) {
        peliculaoserierepository.save(peliculaoserie);
    }

    @Override
    @Transactional
    public PeliculaoSerie findByIdPeliculaoSerie(Integer id) {
        return (PeliculaoSerie) peliculaoserierepository.findById(id).orElse(null);
    }

    @Override
    public PeliculaoSerie buscarPorNombre(String nombre) {
       return (PeliculaoSerie) peliculaoserierepository.findByNombre(nombre).orElse(null);
    }
    }



