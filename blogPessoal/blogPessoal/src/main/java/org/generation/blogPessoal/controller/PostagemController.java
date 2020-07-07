package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		// informa para o spring que essa classe é um controller
@RequestMapping("/postagens")	// informa a uri
@CrossOrigin("*")	// aceitar requisições de qualquer origin
public class PostagemController {
	
	// metodo para utilizar todos os serviços da interface
	@Autowired	// garantir que todos os serviços da interface repository sejam acessadas pelo controller
	private PostagemRepository repository;	// injetar a classe de repositorio origin 
	
	// metodo findAll
	@GetMapping	// expor para a api que o metodo é um get
	public ResponseEntity<List<Postagem>> GetAll(){	// tipo resposeentity retornando uma lista de postagem com o nome de getall
		return ResponseEntity.ok(repository.findAll());	// recebe um objeto do tipo responseentity passando um ok(resposta no http) e na body faz a requisição de todas as postagens
	}
	
	// metodo findById
	@GetMapping("/{id}") // expor um metodo get que recebe um valor id
	public ResponseEntity<Postagem> GetById (@PathVariable long id){	// captura qual a variavel , 
		return repository.findById(id)	// retorna a interface com o metodo findById
				.map(resp -> ResponseEntity.ok(resp))	// retona o objeto se houver
				.orElse(ResponseEntity.notFound().build());	// se não retona um erro
	}
	
	// metodo findByTitulo
	@GetMapping("/titulo/{titulo}") // necessario para não haver duplicidade nos parametros
	public ResponseEntity<List<Postagem>> GetByTitulo (@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	// metodo post
	@PostMapping
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	// metodo put
	@PutMapping
	public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	// metodo delete
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id){
		repository.deleteById(id);
	}
}










