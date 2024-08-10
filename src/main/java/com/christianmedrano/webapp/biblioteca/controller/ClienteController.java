package com.christianmedrano.webapp.biblioteca.controller;

import java.util.List;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.christianmedrano.webapp.biblioteca.model.Cliente;
import com.christianmedrano.webapp.biblioteca.service.ClienteService;

@Controller
@RestController
@RequestMapping({"cliente"})
public class ClienteController {
   @Autowired
   ClienteService clienteService;

   public ClienteController() {
   }

   @GetMapping({"/"})
   public List<Cliente> listarClientes() {
      return this.clienteService.listarClientes();
   }

   @GetMapping({"/{id}"})
   public ResponseEntity<Cliente> buscarClienteId(@PathVariable Long id) {
      try {
         Cliente cliente = this.clienteService.buscarClienteId(id);
         return ResponseEntity.ok(cliente);
      } catch (Exception var3) {
         return ResponseEntity.badRequest().body(null);
      }
   }

   @RequestMapping({"/"})
   public ResponseEntity<Map<String, Boolean>> agregarCliente(@RequestBody Cliente cliente) {
      Map<String, Boolean> response = new HashMap();

      try {
         this.clienteService.guardarClientes(cliente);
         response.put("Cliente agregado con exito", Boolean.TRUE);
         return ResponseEntity.ok(response);
      } catch (Exception var4) {
         response.put("Cliente agregado con exito", Boolean.FALSE);
         return ResponseEntity.badRequest().body(response);
      }
   }

   @PutMapping({"/{id}"})
   public ResponseEntity<Map<String, Boolean>> editarCliente(@PathVariable Long id, @RequestBody Cliente clienteNuevo) {
      Map<String, Boolean> response = new HashMap();

      try {
         Cliente cliente = this.clienteService.buscarClienteId(id);
         cliente.setNombre(clienteNuevo.getNombre());
         cliente.setApellido(clienteNuevo.getApellido());
         cliente.setTelefono(clienteNuevo.getTelefono());
         response.put("Edici\u00f3n de Datos Exitosa", Boolean.TRUE);
         return ResponseEntity.ok(response);
      } catch (Exception var5) {
         response.put("Edici\u00f3n de Datos Exitosa", Boolean.FALSE);
         return ResponseEntity.badRequest().body(response);
      }
   }

   @DeleteMapping({"/{id}"})
   public ResponseEntity<Map<String, Boolean>> eliminarCliente(@PathVariable Long Id) {
      Map<String, Boolean> response = new HashMap();

      try {
         Cliente cliente = this.clienteService.buscarClienteId(Id);
         this.clienteService.eliminarCliente(cliente);
         response.put("Se elimino el cliente con exito", Boolean.TRUE);
         return ResponseEntity.ok(response);
      } catch (Exception var4) {
         response.put("Se elimino el cliente con exito", Boolean.TRUE);
         return ResponseEntity.badRequest().body(response);
      }
   }
}
