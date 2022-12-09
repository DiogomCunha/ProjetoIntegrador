package com.backend.ProjetoIntegrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLoginTeste {

    @GetMapping("/")
    public String home(){
        return "<h1>Hello word<h1>";
    }

    @GetMapping("/paciente")
    public String paciente(){
        return "<h1>Hello word<h1>";
    }

    @GetMapping("/dentista")
    public String dentista(){
        return "<h1>Hello word<h1>";
    }
}
