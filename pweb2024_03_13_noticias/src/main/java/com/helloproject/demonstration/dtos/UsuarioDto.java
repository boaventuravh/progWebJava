package com.helloproject.demonstration.dtos;

import com.helloproject.demonstration.entities.Usuario;

public record UsuarioDto(Long id, String nome, String login) {
	
	public UsuarioDto(Usuario usuario) {
		this(usuario.getId(), usuario.getNome(), usuario.getLogin());
	}

}
