package com.backend.ProjetoIntegrador;


import com.backend.ProjetoIntegrador.login.AppUsers;
import com.backend.ProjetoIntegrador.login.AppUserRoles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProjetoIntegradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoIntegradorApplication.class, args);

		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String senha = bCryptPasswordEncoder.encode("123");

		AppUsers pacienteUser = new AppUsers("jose","jose","jose2@dh.com",senha, AppUserRoles.ROLE_USER);



	}





}
