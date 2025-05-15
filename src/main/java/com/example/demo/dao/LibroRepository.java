package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long> {

}
