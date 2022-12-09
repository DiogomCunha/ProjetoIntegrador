package com.backend.ProjetoIntegrador.login;

import com.backend.ProjetoIntegrador.model.Paciente;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
@SequenceGenerator(name = "seq_login",sequenceName = "seq_login",allocationSize = 1,initialValue = 1)
public class LoginPaciente implements UserDetails {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String login;
    private String senha;

    @Enumerated(EnumType.STRING)
    private UserRoles userRoles;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "Id_paciente")
    private Paciente paciente;





    public LoginPaciente() {
    }

    public LoginPaciente(String login, String senha, UserRoles userRoles) {
        this.login = login;
        this.senha = senha;
        this.userRoles = userRoles;
    }

    public LoginPaciente(String login, String senha, UserRoles userRoles, Paciente paciente) {
        this.login = login;
        this.senha = senha;
        this.userRoles = userRoles;
        this.paciente = paciente;
    }

    public LoginPaciente(String login, String senha, Paciente paciente) {
        this.login = login;
        this.senha = senha;
        this.paciente = paciente;
    }

    public LoginPaciente(Long id) {
        this.id = id;
    }




    public Long getId() {
        return id;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public Paciente getPaciente() {
//        return paciente;
//    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

//    public Dentista getDentista() {
//        return dentista;
//    }


    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userRoles.name());

        return Collections.singleton(grantedAuthority);
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
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
}

