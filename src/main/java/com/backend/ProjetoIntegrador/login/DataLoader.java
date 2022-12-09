package com.backend.ProjetoIntegrador.login;

import com.backend.ProjetoIntegrador.repository.LoginPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class DataLoader implements ApplicationRunner {

    private LoginPacienteRepository loginPacienteRepository;

    @Autowired
    public DataLoader(LoginPacienteRepository loginPacienteRepository) {
        this.loginPacienteRepository = loginPacienteRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("senha1");



        loginPacienteRepository.save(new LoginPaciente("jose",password,UserRoles.ROLE_PACIENTE));

    }
}
