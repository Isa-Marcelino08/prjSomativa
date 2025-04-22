package com.example.isakusmitsch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.isakusmitsch.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
