package com.backend.ProjetoIntegrador.login;

import com.backend.ProjetoIntegrador.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppUserController {

    @Autowired
    private AppUserRopository appUserRopository;

    @PostMapping(value = "usuario/salvar")
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody AppUsers usser){

     AppUsers users = appUserRopository.save(usser);


    return new  ResponseEntity<AppUsers>(users,HttpStatus.OK);
    }


    @GetMapping("/")
    public String home(){
        return "<h1> Hello World Welcome </h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1> Hello World Welcome Admin</h1>" +
                "";
    }

    @GetMapping("/paciente")
    public String paciente(){
        return "<h1> Hello World Welcome paciente</h1>";
    }

    @GetMapping("/dentista")
    public String dentista(){
        return "<h1> Hello World Welcome dentista</h1>";
    }




}
