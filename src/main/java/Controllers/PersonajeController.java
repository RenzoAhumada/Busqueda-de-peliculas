/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Service.PersonajeService;
import entitis.Personaje;
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
public class PersonajeController {
        
    @Autowired
    private PersonajeService personajeservice;
    
    @GetMapping("/list")
        public String listarGenero(Model model){
        model.addAttribute("genero",personajeservice.listarPersonaje());
        model.addAttribute("titulo","Lista de Personajes");
        return "list/personaje-list";
    }
    @GetMapping("/created")
        public String crearPersonaje(Model model){
        model.addAttribute("titulo","Created Personaje");
        model.addAttribute("categoria",new Personaje());
        return "form/Form-personaje";
    }
    
    @PostMapping("/formPersonaje")
        public String guadarPersonaje(Personaje personaje){

        personajeservice.crearPersonaje(personaje);
        return "redirect:/personaje/list";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Integer id, Model model) {
        if (personajeservice.findByIdPersonaje(id) == null) {
            model.addAttribute("error", "Error al editar");
            return "redirect:/persoanje/listar";
        }
        model.addAttribute("titulo", "Editar Personaje");
        model.addAttribute("Personaje", personajeservice.findByIdPersonaje(id));
        return "form/Form-Personaje";
    }
    
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id, Model model) {
        if (personajeservice.findByIdPersonaje(id) == null) {
            model.addAttribute("error", "Error al eliminar");
            return "redirect:/personaje/listar";
        }
        personajeservice.eliminarPersonaje(id);
        return "redirect:/personaje/listar";
    }
}
