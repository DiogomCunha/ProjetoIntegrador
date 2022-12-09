package com.backend.ProjetoIntegrador.controller;

import com.backend.ProjetoIntegrador.login.LoginPaciente;
import com.backend.ProjetoIntegrador.repository.LoginPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loginPaciente")
public class LoginPacienteController {

    @Autowired
    private LoginPacienteRepository loginPacienteRepository;



    @PostMapping(value = "/salvar")
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody LoginPaciente login){

        LoginPaciente logins = loginPacienteRepository.save(login);

        return new ResponseEntity<LoginPaciente>(login, HttpStatus.OK);

    }
}
