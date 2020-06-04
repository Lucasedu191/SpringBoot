package com.example.exercicossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.exercicossb.model.entities.Produto;

public interface ProdutoRepository 
extends CrudRepository<Produto, Integer>{

}
