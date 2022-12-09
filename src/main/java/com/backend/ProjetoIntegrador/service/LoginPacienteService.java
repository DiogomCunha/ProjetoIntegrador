package com.backend.ProjetoIntegrador.service;

import com.backend.ProjetoIntegrador.repository.LoginPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginPacienteService implements UserDetailsService {

    private final LoginPacienteRepository loginPacienteRepository;

    @Autowired
    public LoginPacienteService(LoginPacienteRepository loginPacienteRepository) {
        this.loginPacienteRepository = loginPacienteRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return loginPacienteRepository
                .findByLogin(login).orElseThrow(()-> new UsernameNotFoundException("Usuario não encontrado"));
    }
}
