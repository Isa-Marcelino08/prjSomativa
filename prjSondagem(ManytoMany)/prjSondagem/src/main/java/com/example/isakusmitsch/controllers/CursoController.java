package com.example.isakusmitsch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.isakusmitsch.entities.Curso;
import com.example.isakusmitsch.service.CursoService;


@RestController
@RequestMapping("/cursos")
public class CursoController {

	private final CursoService cursoService;
	
	@Autowired
	public CursoController(CursoService cursoService) {
		this.cursoService = cursoService;
	}
	
	
	@PostMapping("/create")
	public Curso createCurso( @RequestBody Curso curso) {
		return cursoService.saveCursos(curso);
	}
	
	@GetMapping("/{id}")
	public Curso getcurso(@PathVariable Long id) {
		return cursoService.findCursoByid(id);
	}
	
	@GetMapping("/all")
	public List<Curso> getAllCursos(){
		return cursoService.findAllCursos();
	}
}
