package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Libro;


public interface LibroService {
	  List<Libro> findAll();
	    Libro findById(Long id);
	    Libro add(Libro libro);
	    Libro update(Libro libro);
	    void delete(Long id);

}
