package com.christianmedrano.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christianmedrano.webapp.biblioteca.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
