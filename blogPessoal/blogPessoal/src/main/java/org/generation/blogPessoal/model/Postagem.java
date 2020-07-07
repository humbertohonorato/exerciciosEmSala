package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity	// identificar que trata-se de uma sql
@Table(name = "postagem") // criar tabela com nome postagem
public class Postagem {

	// cria a coluna id
	@Id	// cria uma primary-key
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// auto incrementar valores
	private long id;
	
	// cria a coluna titulo
	@NotNull // não pode ser nulo
	@Size(min = 5, max = 100)	// define o tamanho minimo e maximo dos campos
	private String titulo;
	
	//cria a coluna texto
	@NotNull	// não pode ser nulo
	@Size(min = 10, max = 500)	// define o tamanho minimo e maximo dos campos
	private String texto;
	
	// cria a coluna data
	@Temporal(TemporalType.TIMESTAMP) // define o tipo date 
	private Date date = new java.sql.Date(System.currentTimeMillis());	// recebe a data exata das criações

	// Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
