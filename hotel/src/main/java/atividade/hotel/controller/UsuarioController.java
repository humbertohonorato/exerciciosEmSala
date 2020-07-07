package atividade.hotel.controller;

import java.util.List;

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

import atividade.hotel.model.Usuario;
import atividade.hotel.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> GetAll (){
		return ResponseEntity.ok(repository.findAll());
	}
	
	// metodo findById
		@GetMapping("/{cpf}") // expor um metodo get que recebe um valor id
		public ResponseEntity<Usuario> GetById (@PathVariable long cpf){	// captura qual a variavel , 
			return repository.findById(cpf)	// retorna a interface com o metodo findById
					.map(resp -> ResponseEntity.ok(resp))	// retona o objeto se houver
					.orElse(ResponseEntity.notFound().build());	// se não retona um erro
		}
		
		// metodo findByTitulo
		@GetMapping("/usuarios/{nome}") // necessario para não haver duplicidade nos parametros
		public ResponseEntity<List<Usuario>> GetByTitulo (@PathVariable String nome){
			return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
		}
		
		// metodo post
		@PostMapping
		public ResponseEntity<Usuario> post (@RequestBody Usuario usuario){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
		}
		
		// metodo put
		@PutMapping
		public ResponseEntity<Usuario> put (@RequestBody Usuario usuario){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
		}
		
		// metodo delete
		@DeleteMapping("/{cpf}")
		public void delete (@PathVariable long cpf){
			repository.deleteById(cpf);
		}
	
	
	
}
