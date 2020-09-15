package com.etec.alunos.atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etec.alunos.atividade.model.Alunos;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}
