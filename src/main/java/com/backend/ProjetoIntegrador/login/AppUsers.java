package com.backend.ProjetoIntegrador.login;

import com.backend.ProjetoIntegrador.model.Dentista;
import com.backend.ProjetoIntegrador.model.Paciente;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
public class AppUsers implements UserDetails {

    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sequence")
    private Long id;
    private String nome;
    private String username;
    private String email;
    private String password;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_paciente")
    private Paciente paciente;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_dentista")
    private Dentista dentista;
    @Enumerated(EnumType.STRING)
    private AppUserRoles appUserRoles;

    public AppUsers() {
    }

    public AppUsers(String nome, String username, String email, String password, AppUserRoles pacienteUserRoles) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.password = password;
        this.appUserRoles = pacienteUserRoles;
    }

    public AppUsers(String nome, String username, String email, String password, Paciente paciente, AppUserRoles appUserRoles) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.password = password;
        this.paciente = paciente;
        this.appUserRoles = appUserRoles;
    }

    public AppUsers(String nome, String username, String email, String password, Dentista dentista, AppUserRoles appUserRoles) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.password = password;
        this.dentista = dentista;
        this.appUserRoles = appUserRoles;
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
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(appUserRoles.name());
        return Collections.singleton(simpleGrantedAuthority);
    }

    @Override
    public String getPassword() {
     return password;
    }

    @Override
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


    public void setPassword(String password) {
        this.password = password;
    }

    public AppUserRoles getAppUserRoles() {
        return appUserRoles;
    }

    public void setAppUserRoles(AppUserRoles appUserRoles) {
        this.appUserRoles = appUserRoles;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }
}

