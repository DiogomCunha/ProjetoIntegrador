package com.backend.ProjetoIntegrador.controller;

import com.backend.ProjetoIntegrador.model.Endereco;
import com.backend.ProjetoIntegrador.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping(value = "/salvar")
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody Endereco endereco){

        Endereco enderecos = enderecoRepository.save(endereco);
        return new ResponseEntity<Endereco>(endereco, HttpStatus.OK);
    }

    // deletar

    //update

}
