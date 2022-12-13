package com.backend.ProjetoIntegrador.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService implements UserDetailsService {

    private final AppUserRopository pacienteUserRopository;

    @Autowired
    public AppUserService(AppUserRopository pacienteUserRopository) {
        this.pacienteUserRopository = pacienteUserRopository;
    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return pacienteUserRopository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("User not found"));
    }
}
