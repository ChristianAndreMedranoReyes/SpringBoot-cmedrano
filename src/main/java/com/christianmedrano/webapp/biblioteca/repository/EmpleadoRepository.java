package com.christianmedrano.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christianmedrano.webapp.biblioteca.model.Empleados;

public interface EmpleadoRepository extends JpaRepository<Empleados, Long>{

}
