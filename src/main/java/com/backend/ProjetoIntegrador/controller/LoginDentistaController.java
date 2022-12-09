package com.backend.ProjetoIntegrador.controller;

import com.backend.ProjetoIntegrador.login.LoginDentista;
import com.backend.ProjetoIntegrador.repository.LoginDentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loginDentista")
public class LoginDentistaController {

    @Autowired
    private LoginDentistaRepository loginDentistaRepository;



    @PostMapping(value = "/salvar")
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody LoginDentista login){

        LoginDentista logins = loginDentistaRepository.save(login);

        return new ResponseEntity<LoginDentista>(login, HttpStatus.OK);

    }
}
