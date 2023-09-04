package com.newstylelife.api.model;

public class Cliente extends Pessoa {
	private boolean status;
	private Imovel imovel;
	
	public Cliente(String cpf, String nome, String email, String celular, boolean status, Imovel imovel) {
		super(cpf, nome, email, celular);
		this.status = status;
		this.imovel = imovel;
	}
		
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	
}
