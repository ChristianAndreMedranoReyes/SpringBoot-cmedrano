package com.christianmedrano.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christianmedrano.webapp.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}
