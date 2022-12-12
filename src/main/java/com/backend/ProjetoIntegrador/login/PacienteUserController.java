package com.backend.ProjetoIntegrador.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteUserController {


    @GetMapping("/")
    public String home(){
        return "<h1> Hello World Welcome </h1>";
    }

    @GetMapping("/user")
    public String userr(){
        return "<h1> Hello World Welcome user</h1>";
    }

    @GetMapping("/admin")
    public String adminn(){
        return "<h1> Hello World Welcome  admin</h1>";
    }
}
