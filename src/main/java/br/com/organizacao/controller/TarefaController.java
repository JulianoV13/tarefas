package br.com.organizacao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.organizacao.Repository.TarefaRepository;
import br.com.organizacao.domain.Tarefa;

@RestController
public class TarefaController {
	
	@Autowired
	private TarefaRepository cr;
	
	@GetMapping("/mensagem")
	public String mensagem() {
		return "Dados do servidor";
	}
	
	@GetMapping("/tarefa/listar")
	public List<Tarefa> listar(){
		return cr.findAll();
	}
	@GetMapping("/tarefa/titulo")
	public List<Tarefa> ListarTarefas(@RequestParam String titulo) {
		return cr.findByTitulo(titulo);
	}
	@GetMapping("/tarefa/estado")
	public List<Tarefa> Listerestado(@RequestParam String estado) {
		return cr.findByEstado(estado);
	}
	@PostMapping("/tarefa/cadastrar")
	public String cadastrar(@RequestBody Tarefa Tarefa) {
	
		cr.save(Tarefa);
		return "Cadastrou";
}
	@PutMapping("/tarefa/atualizar/{id}")
	public String atualizar(@PathVariable Integer id,@RequestBody Tarefa Tarefa) {
		String msg = "";
		Optional<Tarefa> c = cr.findById(id);
		
		if(c.isPresent()) {
			Tarefa.setIdtarefa(id);
			cr.save(Tarefa);
			msg = "Tarefa atualizado";
		}
		else {
			msg = "Tarefa não encontrado";
		}
		return msg;
	}
}

