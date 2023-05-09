package br.com.organizacao.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, unique=true)
	private Integer idtarefa;
	
	@Column(nullable=false)
	private String titulo;
	
	@Column(nullable=false )
	private String descricao;
	
	@Column(nullable=false )
	private String datainicio;
	
	@Column(nullable=false )
	private String datatermino;
	
	@Column(nullable=false)
	private String estado;

	public Tarefa() {
	}

	public Tarefa(Integer idtarefa, String titulo, String descricao, String datainicio, String datatermino,
			String estado) {
		this.idtarefa = idtarefa;
		this.titulo = titulo;
		this.descricao = descricao;
		this.datainicio = datainicio;
		this.datatermino = datatermino;
		this.estado = estado;
	}

	public Integer getIdtarefa() {
		return idtarefa;
	}

	public void setIdtarefa(Integer idtarefa) {
		this.idtarefa = idtarefa;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}

	public String getDatatermino() {
		return datatermino;
	}

	public void setDatatermino(String datatermino) {
		this.datatermino = datatermino;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
}
