package com.backend.ProjetoIntegrador.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@SequenceGenerator(name = "seq_consulta",sequenceName = "seq_consulta",allocationSize = 1,initialValue = 1)
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String especialidade;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "Id_dentista")
    private Dentista dentista;
//    private Paciente paciente;


    public Consulta(String especialidade, String descricao, Dentista dentista) {
        this.especialidade = especialidade;
        this.descricao = descricao;
        this.dentista = dentista;
    }

    public Consulta(long id, String especialidade, String descricao, Dentista dentista, Paciente paciente) {
        this.id = id;
        this.especialidade = especialidade;
        this.descricao = descricao;
        this.dentista = dentista;
//        this.paciente = paciente;

    }


    public Consulta(String especialidade, String descricao, Dentista dentista, Paciente paciente) {
        this.especialidade = especialidade;
        this.descricao = descricao;
        this.dentista = dentista;
//        this.paciente = paciente;
    }

    public Consulta() {
    }

    public Dentista getDentista() {

        return dentista;
    }
}
