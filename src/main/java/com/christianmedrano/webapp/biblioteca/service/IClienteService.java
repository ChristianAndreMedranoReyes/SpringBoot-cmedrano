package com.christianmedrano.webapp.biblioteca.service;

import java.util.List;

import com.christianmedrano.webapp.biblioteca.model.Cliente;

public interface IClienteService {
    List<Cliente> listarClientes();
 
    void guardarClientes(Cliente cliente);
 
    Cliente buscarClienteId(Long Id);
 
    void eliminarCliente(Cliente cliente);
 }
