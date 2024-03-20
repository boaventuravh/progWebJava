package com.helloproject.demonstration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helloproject.demonstration.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
}
