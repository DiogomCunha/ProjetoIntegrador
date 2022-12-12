package com.backend.ProjetoIntegrador.login;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
public class PacienteUser implements UserDetails {

    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sequence")
    private Long id;
    private String nome;
    private String username;
    private String email;
    private String senha;
    @Enumerated(EnumType.STRING)
    private PacienteUserRoles pacienteUserRoles;

    public PacienteUser() {
    }

    public PacienteUser(String nome, String username, String email, String senha, PacienteUserRoles pacienteUserRoles) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.pacienteUserRoles = pacienteUserRoles;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(pacienteUserRoles.name());
        return Collections.singleton(simpleGrantedAuthority);
    }

    @Override
    public String getPassword() {
        return null;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public PacienteUserRoles getPacienteUserRoles() {
        return pacienteUserRoles;
    }

    public void setPacienteUserRoles(PacienteUserRoles pacienteUserRoles) {
        this.pacienteUserRoles = pacienteUserRoles;
    }
}
