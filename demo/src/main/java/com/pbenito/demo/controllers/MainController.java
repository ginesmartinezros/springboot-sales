package com.pbenito.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "¡Bienvenido a tu página con Spring Boot!");
        return "home"; // Carga la plantilla 'home.html' desde /src/main/resources/templates
    }
}
