package com.backend.ProjetoIntegrador.login;

import com.backend.ProjetoIntegrador.model.Dentista;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "seq_login",sequenceName = "seq_login",allocationSize = 1,initialValue = 1)
public class LoginDentista {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String login;
    private String senha;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "Id_dentista")
    private Dentista dentista;


    public LoginDentista() {
    }

    public LoginDentista(Long id) {
        this.id = id;
    }

    public LoginDentista(String login, String senha, Dentista dentista) {
        this.login = login;
        this.senha = senha;
        this.dentista = dentista;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }
}
