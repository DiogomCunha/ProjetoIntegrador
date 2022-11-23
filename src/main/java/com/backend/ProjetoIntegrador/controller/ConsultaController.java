package com.backend.ProjetoIntegrador.controller;


import com.backend.ProjetoIntegrador.model.Consulta;
import com.backend.ProjetoIntegrador.model.Dentista;
import com.backend.ProjetoIntegrador.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;


    @PostMapping(value = "/salvar")
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody Consulta consulta){
        Consulta consultas = consultaRepository.save(consulta);


        return new ResponseEntity<Consulta>(consulta, HttpStatus.OK);
    }
}
