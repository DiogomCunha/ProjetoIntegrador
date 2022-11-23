package com.backend.ProjetoIntegrador.repository;

import com.backend.ProjetoIntegrador.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConsultaRepository extends JpaRepository<Consulta,Long> {

}
