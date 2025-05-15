package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LbroDTO;
import com.example.demo.entity.Libro;
import com.example.demo.service.LibroService;



@RestController
@RequestMapping("api/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> findAll() {
        return libroService.findAll();
    }

    @GetMapping("{id}")
    public Libro findById(@PathVariable Long id) {
        return libroService.findById(id);
    }

    @PostMapping
    public Libro add(@RequestBody Libro libro) {
    	//System.out.println("libro enviado="+ libro.getAutor());
    	System.out.println("libro enviado="+ libro.getAutor());
        return libroService.add(libro);
    }

    @PutMapping
    public Libro update(@RequestBody Libro libro) {
        return libroService.update(libro);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        libroService.delete(id);
    }
}
