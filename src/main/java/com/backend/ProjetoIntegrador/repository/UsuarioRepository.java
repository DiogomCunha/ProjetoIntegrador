package com.backend.ProjetoIntegrador.repository;

import com.backend.ProjetoIntegrador.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Login,Long> {

}
