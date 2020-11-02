package com.educandoweb.Curso.Recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.Curso.Entities.Usuario;

@RestController
@RequestMapping(value = "/Usuarios")
public class RecursoUsuario {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "Maria", "Maria@gmail.com", "998643385", "123456789");
		return ResponseEntity.ok(u);
	}
	
}
