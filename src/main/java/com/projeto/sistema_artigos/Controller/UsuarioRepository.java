package com.projeto.sistema_artigos.Controller;

import org.springframework.data.repository.CrudRepository;

import com.projeto.sistema_artigos.Model.Usuario;  

// Este será AUTO IMPLEMENTADO pelo Spring em um Bean chamado artigoRepository
// CRUD se refere a Create, Read, Update, Delete

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}