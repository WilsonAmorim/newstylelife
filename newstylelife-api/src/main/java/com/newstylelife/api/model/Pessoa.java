package com.newstylelife.api.model;

public class Pessoa {
	
	private String cpf;
	private String nome;
	private String email;
	private String celular;
	
	
	
	public Pessoa(String cpf, String nome, String email, String celular) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpfCliente(String cpf) {
		this.cpf = cpf;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", celular=" + celular + "]";
	}
	
	
}
