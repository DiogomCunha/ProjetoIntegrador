package com.backend.ProjetoIntegrador.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface PacienteUserRopository extends JpaRepository<PacienteUser,Long> {

    Optional<PacienteUser> findByEmail(String email);
}
