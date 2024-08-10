package com.christianmedrano.webapp.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christianmedrano.webapp.biblioteca.model.Cliente;
import com.christianmedrano.webapp.biblioteca.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {
   @Autowired
   ClienteRepository clienteRepository;

   public ClienteService() {
   }

   public List<Cliente> listarClientes() {
      return this.clienteRepository.findAll();
   }

   public void guardarClientes(Cliente cliente) {
      this.clienteRepository.save(cliente);
   }

   public Cliente buscarClienteId(Long Id) {
      return (Cliente)this.clienteRepository.findById(Id).orElse(null);
   }

   public void eliminarCliente(Cliente cliente) {
      this.clienteRepository.delete(cliente);
   }
}
