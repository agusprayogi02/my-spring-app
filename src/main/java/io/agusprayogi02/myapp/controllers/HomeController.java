package io.agusprayogi02.myapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String welcome(Model model) {
        model.addAttribute("msg", "Welcome to Spring Boot!");
        // doing something
        return "index";
    }
}
