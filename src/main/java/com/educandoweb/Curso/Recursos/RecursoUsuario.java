package com.educandoweb.Curso.Recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.Curso.Entities.Usuario;
import com.educandoweb.Curso.Servico.UsuarioServico;

@RestController
@RequestMapping(value = "/Usuarios")
public class RecursoUsuario {

	@Autowired
	private UsuarioServico servico;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> lista = servico.findAll();
	
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id){
		Usuario obj = servico.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
