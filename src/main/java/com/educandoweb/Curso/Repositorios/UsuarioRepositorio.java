package com.educandoweb.Curso.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.Entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	
}
