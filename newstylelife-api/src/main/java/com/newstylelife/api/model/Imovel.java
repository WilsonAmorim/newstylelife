package com.newstylelife.api.model;

public class Imovel {
	private int codigoImovel;
	private String registroImovel;
	private String Endereco;
	private Cliente cliente;
	private boolean statusImovel;
	
	
	public Imovel(int codigoImovel, String registroImovel, String endereco, Cliente cliente, boolean statusImovel) {
		this.codigoImovel = codigoImovel;
		this.registroImovel = registroImovel;
		Endereco = endereco;
		this.cliente = cliente;
		this.statusImovel = statusImovel;
	}
	
	public int getCodigoImovel() {
		return codigoImovel;
	}
	public void setCodigoImovel(int codigoImovel) {
		this.codigoImovel = codigoImovel;
	}
	public String getRegistroImovel() {
		return registroImovel;
	}
	public void setRegistroImovel(String registroImovel) {
		this.registroImovel = registroImovel;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public boolean isStatusImovel() {
		return statusImovel;
	}
	public void setStatusImovel(boolean statusImovel) {
		this.statusImovel = statusImovel;
	}

	@Override
	public String toString() {
		return "Imoveis [codigoImovel=" + codigoImovel + ", registroImovel=" + registroImovel + ", Endereco=" + Endereco
				+ ", cliente=" + cliente + ", statusImovel=" + statusImovel + "]";
	}
	
	
	
}
