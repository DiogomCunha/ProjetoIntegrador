package com.backend.ProjetoIntegrador.repository;

import com.backend.ProjetoIntegrador.model.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistaRepository extends JpaRepository<Dentista,Long> {

}
