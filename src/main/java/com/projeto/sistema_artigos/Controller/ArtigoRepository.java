package com.projeto.sistema_artigos.Controller;

import org.springframework.data.repository.CrudRepository;

import com.projeto.sistema_artigos.Model.Artigo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called artigoRepository
// CRUD refers Create, Read, Update, Delete

public interface ArtigoRepository extends CrudRepository<Artigo, Integer> {

}