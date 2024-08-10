package com.christianmedrano.webapp.biblioteca.service;

import java.util.List;

import com.christianmedrano.webapp.biblioteca.model.Libro;

public interface ILibroService {

    public List<Libro> listarLibros();

    public Libro buscarLibroPorId(Long Id);

    public Libro guardarLibro(Libro libro);

    public void elimnarLibro(Libro libro);

}
