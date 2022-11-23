package com.backend.ProjetoIntegrador.controller;


import com.backend.ProjetoIntegrador.model.Dentista;
import com.backend.ProjetoIntegrador.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/dentista")//Para chamar metodo pela URL, após IP ou localhost / e porta que estiver rodando o Tomcat
    public class DentistaController {

    @Autowired
    private DentistaRepository dentistaRepository;


        @GetMapping(value = "/listartodos") // exemplo: localhost:8080/dentista/listartodos
        @ResponseBody
        public ResponseEntity<List<Dentista>> listaUsuario(){// lista todos os usuarios cadastrados no BD

            List<Dentista> dentistas = dentistaRepository.findAll();

            return new ResponseEntity<List<Dentista>>(dentistas,HttpStatus.OK);
        };



    @PostMapping(value = "/salvar")// exemplo: localhost:8080/dentista/salvar
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody Dentista dentista){//Salva um novo dentista solicitando
        //um objeto JSON

    Dentista dentistas = dentistaRepository.save(dentista);

    return new ResponseEntity<Dentista>(dentista, HttpStatus.OK);

    }



}
