/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Service.PeliculaoSerieService;
import entitis.PeliculaoSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RenzoAhumada
 */
@Controller
@RequestMapping
public class PeliculaoSerieController {
    
    @Autowired
    private PeliculaoSerieService peliculaoserieser;
    
    @GetMapping("/list")
        public String listarGenero(Model model){
        model.addAttribute("peliculaoserie",peliculaoserieser.listarPeliculaoSerie());
        model.addAttribute("titulo","Lista de peliculas o series");
        return "list/peliculaoserie-list";
    }
    @GetMapping("/created")
        public String crearPeliculaoSerie(Model model){
        model.addAttribute("titulo","Created Personaje");
        model.addAttribute("categoria",new PeliculaoSerie());
        return "form/Form-peliculaoserie";
    }
    
    @PostMapping("/formpeliculaoserie")
        public String guadarCategoria(PeliculaoSerie peliculaoserie){

        peliculaoserieser.crearPeliculaoSerie(peliculaoserie);
        return "redirect:/peliculaoserie/list";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Integer id, Model model) {
        if (peliculaoserieser.findByIdPeliculaoSerie(id) == null) {
            model.addAttribute("error", "Error al editar");
            return "redirect:/peliculaoserie/listar";
        }
        model.addAttribute("titulo", "Editar peliculaoserie");
        model.addAttribute("peliculaoserie", peliculaoserieser.findByIdPeliculaoSerie(id));
        return "form/Form-peliculaoserie";
    }
    
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id, Model model) {
        if (peliculaoserieser.findByIdPeliculaoSerie(id) == null) {
            model.addAttribute("error", "Error al eliminar");
            return "redirect:/peliculaoserie/listar";
        }
        peliculaoserieser.eliminarPeliculaoSerie(id);
        return "redirect:/peliculaoserie/listar";
    }
}
