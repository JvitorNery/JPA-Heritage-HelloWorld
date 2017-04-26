package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="T_PESSOA_FISICA")
@PrimaryKeyJoinColumn(name="CD_PESSOA")
public class PessoaFisica extends Pessoa {
	
	@Column(name="NR_CPF")
	private String cpf;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;

	public PessoaFisica(String nome, String endereco,String cpf, Sexo sexo) {
		super(nome, endereco);
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public PessoaFisica() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}
