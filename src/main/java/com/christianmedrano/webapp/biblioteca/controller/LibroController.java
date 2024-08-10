package com.christianmedrano.webapp.biblioteca.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.christianmedrano.webapp.biblioteca.model.Categoria;
import com.christianmedrano.webapp.biblioteca.model.Libro;
import com.christianmedrano.webapp.biblioteca.service.LibroService;

@Controller
@RestController
@RequestMapping({"libro"})
public class LibroController {
   @Autowired
   LibroService libroService;

   public LibroController() {
   }

   @GetMapping({"/"})
   public ResponseEntity<Object> listarLibros() {
      try {
         return ResponseEntity.ok(this.libroService.listarLibros());
      } catch (Exception var2) {
         return ResponseEntity.badRequest().body((Object)null);
      }
   }

   @GetMapping({"/{id}"})
   public ResponseEntity<Object> buscarLibro(@PathVariable Long id) {
      try {
         Libro libro = this.libroService.buscarLibroPorId(id);
         return ResponseEntity.ok(libro);
      } catch (Exception var3) {
         return ResponseEntity.badRequest().body((Object)null);
      }
   }

   @PostMapping({"/"})
   public ResponseEntity<Map<String, Boolean>> agregarLibro(@RequestBody Libro libro) {
      Map<String, Boolean> response = new HashMap();

      try {
         this.libroService.guardarLibro(libro);
         response.put("Libro se ha Agregado con Exito", Boolean.TRUE);
         return ResponseEntity.ok(response);
      } catch (Exception var4) {
         response.put("Libro se ha Agregado con Exito", Boolean.FALSE);
         return ResponseEntity.badRequest().body(response);
      }
   }

   @PutMapping({"/{id}"})
   public ResponseEntity<Map<String, Boolean>> editarLibro(@PathVariable Long id, Libro libroNuevo) {
      Map<String, Boolean> response = new HashMap();

      try {
         Libro libro = this.libroService.buscarLibroPorId(id);
         libro.setIsbn(libroNuevo.getIsbn());
         libro.setNombre(libroNuevo.getNombre());
         libro.setSinopsis(libroNuevo.getSinopsis());
         libro.setAutor(libroNuevo.getAutor());
         libro.setEditorial(libroNuevo.getEditorial());
         libro.setDisponibilidad(libroNuevo.getDisponibilidad());
         libro.setNumeroEstanteria(libroNuevo.getNumeroEstanteria());
         libro.setCluster(libroNuevo.getCluster());
         libro.setCategoria(libroNuevo.getCategoria());
         response.put("La edici\u00f3n del Libro ha sido Exitosa", Boolean.TRUE);
         return ResponseEntity.ok(response);
      } catch (Exception var5) {
         response.put("La edici\u00f3n del Libro ha sido Exitosa", Boolean.FALSE);
         return ResponseEntity.badRequest().body(response);
      }
   }

   @DeleteMapping({"/{id}"})
   public ResponseEntity<Map<String, Boolean>> eliminarLibro(@PathVariable Long id) {
      Map<String, Boolean> response = new HashMap();

      try {
         Libro libro = this.libroService.buscarLibroPorId(id);
         this.libroService.elimnarLibro(libro);
         response.put("El libro ha sido Eliminado con Exito", Boolean.TRUE);
         return ResponseEntity.ok(response);
      } catch (Exception var4) {
         response.put("El libro ha sido Eliminado con Exito", Boolean.FALSE);
         return ResponseEntity.badRequest().body(response);
      }
   }
}
