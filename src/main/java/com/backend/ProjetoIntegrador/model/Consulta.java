package com.backend.ProjetoIntegrador.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "seq_consulta",sequenceName = "seq_consulta",allocationSize = 1,initialValue = 1)
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String especialidade;
    private String descricao;
//    private Dentista dentista;
//    private Paciente paciente;


    public Consulta(long id, String especialidade, String descricao, Dentista dentista, Paciente paciente) {
        this.id = id;
        this.especialidade = especialidade;
        this.descricao = descricao;
//        this.dentista = dentista;
//        this.paciente = paciente;
    }


    public Consulta(String especialidade, String descricao, Dentista dentista, Paciente paciente) {
        this.especialidade = especialidade;
        this.descricao = descricao;
//        this.dentista = dentista;
//        this.paciente = paciente;
    }

    public Consulta() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
