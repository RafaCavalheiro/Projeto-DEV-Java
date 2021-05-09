package com.projeto.sistema_artigos.Controller;

import org.springframework.data.repository.CrudRepository;

import com.projeto.sistema_artigos.Model.Usuario;  

// This will be AUTO IMPLEMENTED by Spring into a Bean called usuarioRepository
// CRUD refers Create, Read, Update, Delete

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}