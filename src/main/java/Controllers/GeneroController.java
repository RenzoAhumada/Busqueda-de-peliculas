/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Service.GeneroService;
import entitis.Genero;
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
@RequestMapping("/Genero")
public class GeneroController {
        
    @Autowired
    private GeneroService generoservice;
    
    @GetMapping("/list")
        public String listarGenero(Model model){
        model.addAttribute("genero",generoservice.listarGenero());
        model.addAttribute("titulo","Lista de Generos");
        return "list/genero-list";
    }
    @GetMapping("/created")
        public String crearGenero(Model model){
        model.addAttribute("titulo","Created Genero");
        model.addAttribute("categoria",new Genero());
        return "form/Form-genero";
    }
    
    @PostMapping("/formGenero")
        public String guadarGenero(Genero genero){

        generoservice.crearGenero(genero);
        return "redirect:/genero/list";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Integer id, Model model) {
        if (generoservice.findByIdGenero(id) == null) {
            model.addAttribute("error", "Error al editar");
            return "redirect:/genero/listar";
        }
        model.addAttribute("titulo", "Editar genero");
        model.addAttribute("genero", generoservice.findByIdGenero(id));
        return "form/Form-Genero";
    }
    
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id, Model model) {
        if (generoservice.findByIdGenero(id) == null) {
            model.addAttribute("error", "Error al eliminar");
            return "redirect:/genero/listar";
        }
        generoservice.eliminarGenero(id);
        return "redirect:/genero/listar";
    }
    
}
