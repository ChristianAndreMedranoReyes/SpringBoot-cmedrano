package com.christianmedrano.webapp.biblioteca.service;

import java.util.List;

import com.christianmedrano.webapp.biblioteca.model.Empleados;

public interface IEmpleadosService {
    List<Empleados> listarEmpleados();
 
    void guardarEmpleado(Empleados empleado);
 
    Empleados buscarEmpleados(Long id);
 
    void eliminarEmpleado(Empleados empleado);
 }
