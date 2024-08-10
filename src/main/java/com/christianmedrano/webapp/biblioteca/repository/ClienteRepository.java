package com.christianmedrano.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christianmedrano.webapp.biblioteca.model.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
