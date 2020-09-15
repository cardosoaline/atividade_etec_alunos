package com.etec.alunos.atividade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etec.alunos.atividade.dto.AlunosDTO;
import com.etec.alunos.atividade.model.Alunos;
import com.etec.alunos.atividade.service.AlunosService;

@Controller
@RequestMapping("/aluno")
public class AlunosController {
	
	
	@Autowired
	AlunosService service;

	@PostMapping("/cadastrar")
	public ResponseEntity<?> cadastrarAluno(@RequestBody AlunosDTO dto) {
	   Alunos alunos = service.cadastrarAlunos(dto);
		return ResponseEntity.status(HttpStatus.OK).body(alunos);
	}

	@GetMapping("/listar")
	public ResponseEntity<?> listarAlunos(AlunosDTO dto){
		List<Alunos> alunos = service.buscar();
		return ResponseEntity.status(HttpStatus.OK).body(alunos);
	}

}
