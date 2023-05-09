package br.com.organizacao.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.organizacao.domain.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa,Integer>{
	
	public List<Tarefa> findByTitulo(String titulo);
	public List<Tarefa> findByEstado(String estado);


}
