package com.backend.ProjetoIntegrador.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    private AppUserRopository pacienteUserRopository;

    @Autowired
    public DataLoader(AppUserRopository pacienteUserRopository) {
        this.pacienteUserRopository = pacienteUserRopository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String senha = passwordEncoder.encode("1234 ");
        String senha2 = passwordEncoder.encode("1234");

        pacienteUserRopository.save(new AppUsers("José","jose","jose@dh.com",senha, AppUserRoles.ROLE_USER));
        pacienteUserRopository.save(new AppUsers("José2","jose2","jose2@dh.com",senha2, AppUserRoles.ROLE_ADMIN));
    }
}
