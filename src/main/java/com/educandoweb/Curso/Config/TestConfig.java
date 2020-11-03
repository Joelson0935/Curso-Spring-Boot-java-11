package com.educandoweb.Curso.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.Curso.Entities.Usuario;
import com.educandoweb.Curso.Repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Joelson", "Joelson@gmail.com", "998643385", "123456");
		Usuario u2 = new Usuario(null, "Jamile", "Jamile@yahoo.com", "997215119", "55321");
		repositorio.saveAll(Arrays.asList(u1,u2));
	}
	
}
