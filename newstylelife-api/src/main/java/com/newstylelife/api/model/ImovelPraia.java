package com.newstylelife.api.model;

public class ImovelPraia extends Imovel {
	
	private String nome;
	private String localizado;
	private boolean codominio;
	
	public ImovelPraia(int codigoImovel, String registroImovel, String endereco, Cliente cliente,
			boolean statusImovel, String nome, String localizado, boolean condominio) {
		super(codigoImovel, registroImovel, endereco, cliente, statusImovel);
		this.nome = nome;
		this.localizado = localizado;
		this.codominio = condominio;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizado() {
		return localizado;
	}

	public void setLocalizado(String localizado) {
		this.localizado = localizado;
	}

	public boolean isCodominio() {
		return codominio;
	}

	public void setCodominio(boolean codominio) {
		this.codominio = codominio;
	}

	
}
