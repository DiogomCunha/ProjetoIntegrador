package com.backend.ProjetoIntegrador.controller;


import com.backend.ProjetoIntegrador.model.Paciente;
import com.backend.ProjetoIntegrador.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping(value = "/listartodos")
    @ResponseBody
    public ResponseEntity<List<Paciente>>listaPaciente(){
        List<Paciente> pacientes = pacienteRepository.findAll();
        return new ResponseEntity<List<Paciente>>(pacientes, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar")
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody Paciente paciente){

        Paciente pacientes = pacienteRepository.save(paciente);
        return new ResponseEntity<Paciente>(paciente,HttpStatus.OK);
    }

    //deletar

    //update
}
