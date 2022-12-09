package com.backend.ProjetoIntegrador.repository;

import com.backend.ProjetoIntegrador.login.LoginPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;


@Repository
@Transactional
public interface LoginPacienteRepository extends JpaRepository<LoginPaciente,Long> {

    Optional<LoginPaciente> findByLogin(String login);

}
