package com.etec.alunos.atividade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etec.alunos.atividade.dto.AlunosDTO;
import com.etec.alunos.atividade.model.Alunos;
import com.etec.alunos.atividade.repository.AlunosRepository;

@Service
public class AlunosService {
	
	@Autowired
	AlunosRepository repository;

	public List<Alunos> buscar(){
		return repository.findAll();	
	}
	
	public Alunos cadastrarAlunos(AlunosDTO alunos) {
		Alunos aluno = repository.save(alunos.toEntityAlunos());
		return aluno;
	}
}
