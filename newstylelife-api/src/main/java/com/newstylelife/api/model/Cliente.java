package com.newstylelife.api.model;

public class Cliente {
	private String cpfCliente;
	private String nome;
	private String email;
	private String celular;
	private boolean status;
	
		
	public Cliente(String cpfCliente, String nome, String email, String celular, boolean status) {
		this.cpfCliente = cpfCliente;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.status = status;
	}
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Cliente [cpfCliente=" + cpfCliente + ", nome=" + nome + ", email=" + email + ", celular=" + celular
				+ ", status=" + status + "]";
	}
	
	
	
}
