package com.example.demo.service;

import java.time.Year;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LibroRepository;
import com.example.demo.entity.Libro;

@Service
public class LibroServiceImpl implements LibroService {
	
	  @Autowired
	   private LibroRepository libroRepository;

	@Override
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		
		return libroRepository.findAll();
	}

	@Override
	public Libro findById(Long id) {
		// TODO Auto-generated method stub
		return libroRepository.findById(id).get();
	}

	@Override
	public Libro add(Libro libro) {
		//verificar campos no sean string vacios
		publicacionValida(libro);
		// TODO Auto-generated method stub
		return libroRepository.save(libro);
	}





	public void publicacionValida(Libro libro) {
		// TODO Auto-generated method stub
		Integer anio = libro.getAnioPublicacion(); 

	    if (anio != null && anio > Year.now().getValue()) {
	        throw new IllegalArgumentException("El año de publicación no puede ser posterior al año actual");
	    }
		
	}

	@Override
	public Libro update(Libro libro) {
		// TODO Auto-generated method stub
		return libroRepository.save(libro);
	}

	@Override
	public void delete(Long id) {
		libroRepository.deleteById(id);
		
	}

}
