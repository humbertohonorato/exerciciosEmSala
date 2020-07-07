package atividade.hotel.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_pessoa")
public class Usuario {

	@Column(name = "cd_cpf", nullable = false )
	@NotNull
	@Id 
	@Size(min = 11, max = 11)
	private long cpf;
	
	@Column(name = "nm_nome", nullable = false, length = 80)
	@NotNull
	@Size(min = 2, max = 80)
	private String nome;
	
	@Column(name = "dt_data_nascimento")
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "nm_email", nullable = false, length = 120)
	@NotNull
	@Email
	@Size(min = 7, max = 80)
	private String email;
	
	@Column(name = "cd_celular", nullable = false, length = 20)
	@NotNull
	@Size(min = 10, max = 20)
	private int celular;
	
	@Column(name = "nm_placa_veiculo", nullable = false, length = 8)
	@NotNull
	@Size(min = 7, max = 8)
	private String placa;

	
	//GEtters and Setters
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
}
