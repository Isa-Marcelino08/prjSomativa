package com.example.isakusmitsch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.isakusmitsch.entities.Aluno;
import com.example.isakusmitsch.entities.Curso;

public interface  AlunoRepository extends JpaRepository<Aluno, Long> {

}