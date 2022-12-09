package com.backend.ProjetoIntegrador.service;

import com.backend.ProjetoIntegrador.repository.LoginDentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class LoginDentistaService implements UserDetailsService {
    private final LoginDentistaRepository loginDentistaRepository;

    @Autowired
    public LoginDentistaService(LoginDentistaRepository loginDentistaRepository) {
        this.loginDentistaRepository = loginDentistaRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return (UserDetails) loginDentistaRepository
                .findByLogin(login).orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado"));
    }

}
