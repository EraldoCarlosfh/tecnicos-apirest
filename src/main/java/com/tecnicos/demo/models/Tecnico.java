package com.tecnicos.demo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_TECNICOS")
public class Tecnico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
		
	private String nome;
	
	private String email;
	
	private Number cpf;
	
	private String estado;
	
	private String cidade;
	
	private String nasc;

	private Number cep;
	
	private String stacks;

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

	public Number getCpf() {
		return cpf;
	}

	public void setCpf(Number cpf) {
		this.cpf = cpf;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDataNasc() {
		return nasc;
	}

	public void setDataNasc(String nasc) {
		this.nasc = nasc;
	}

	public Number getCep() {
		return cep;
	}

	public void setCep(Number cep) {
		this.cep = cep;
	}

	public String getStacks() {
		return stacks;
	}

	public void setStacks(String stacks) {
		this.stacks = stacks;
	}
	
}


