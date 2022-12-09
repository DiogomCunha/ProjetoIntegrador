package com.backend.ProjetoIntegrador.repository;

import com.backend.ProjetoIntegrador.login.LoginDentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface LoginDentistaRepository extends JpaRepository<LoginDentista,Long> {

    Optional<LoginDentista> findByLogin(String login);
}
