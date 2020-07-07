package generation.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_cliente")
public class Usuario {
	
	@Id
	@Column(name = "cd_cpf", nullable = false)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 255)
	@Column(name = "nm_nome", nullable = false, length = 255)
	private String nome;
	
	@Size(min = 20, max = 255)
	@Column(name = "nm_email", nullable = true, length = 255)
	private String email;
	
	@Size(min = 16, max = 30)
	@Column(name = "cd_telefone", nullable = true, length = 30)
	private String telefone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
