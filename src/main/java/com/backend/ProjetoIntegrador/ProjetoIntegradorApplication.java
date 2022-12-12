package com.backend.ProjetoIntegrador;


import com.backend.ProjetoIntegrador.login.PacienteUser;
import com.backend.ProjetoIntegrador.login.PacienteUserRoles;
import com.backend.ProjetoIntegrador.login.PacienteUserRopository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProjetoIntegradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoIntegradorApplication.class, args);

		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String senha = bCryptPasswordEncoder.encode("123");

		PacienteUser pacienteUser = new PacienteUser("jose","jose","jose2@dh.com",senha, PacienteUserRoles.ROLE_USER);



	}





}
