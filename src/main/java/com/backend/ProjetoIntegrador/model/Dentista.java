package com.backend.ProjetoIntegrador.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@SequenceGenerator(name = "seq_dentista",sequenceName = "seq_dentista",allocationSize = 1,initialValue = 1)
public class Dentista implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;

    private String sobreNome;

    private String matricula;

    private String cadastro;

    @OneToMany(mappedBy = "dentista")
  private List<Consulta> consultas;

    public Dentista(long id) {
        this.id = id;
    }

    public Dentista(String nome, String sobreNome, String matricula, String cadastro) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.matricula = matricula;
        this.cadastro = cadastro;
    }

    public Dentista(long id, String nome, String sobreNome, String matricula, String cadastro, ArrayList<Consulta> consultas) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.matricula = matricula;
        this.cadastro = cadastro;
        this.consultas = consultas;
    }

    public Dentista(String nome, String sobreNome, String matricula, String cadastro, ArrayList<Consulta> consultas) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.matricula = matricula;
        this.cadastro = cadastro;
        this.consultas = consultas;
    }

    public Dentista() {
    }



}
