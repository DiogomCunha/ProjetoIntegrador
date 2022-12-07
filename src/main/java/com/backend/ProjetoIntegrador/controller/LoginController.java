package com.backend.ProjetoIntegrador.controller;

import com.backend.ProjetoIntegrador.model.Login;
import com.backend.ProjetoIntegrador.model.Paciente;
import com.backend.ProjetoIntegrador.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;



    @PostMapping(value = "/salvar")
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody Login login){

        Login logins = usuarioRepository.save(login);

        return new ResponseEntity<Login>(login, HttpStatus.OK);

    }
}
