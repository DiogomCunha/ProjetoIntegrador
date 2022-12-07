package com.backend.ProjetoIntegrador.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "seq_login",sequenceName = "seq_login",allocationSize = 1,initialValue = 1)
public class Login implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String login;
    private String senha;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "Id_paciente")
    private  Paciente paciente;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "Id_dentista")
    private  Dentista dentista;


    public Login() {
    }

    public Login(Long id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public Login(String login, String senha, Dentista dentista) {
        this.login = login;
        this.senha = senha;
        this.dentista = dentista;
    }

    public Login(String login, String senha, Paciente paciente) {
        this.login = login;
        this.senha = senha;
        this.paciente = paciente;
    }

    public Login(Long id) {
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

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }
}

