package br.edu.ufrn.lpii.repo.onibus;

import br.edu.ufrn.lpii.repo.union_find.Rota;

public class Onibus {
	private String nome;
	private Rota rota;
	
	public Onibus(String nome, Rota rota) {
		super();
		this.nome = nome;
		this.rota = rota;
	}

	public Onibus() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Rota getRota() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	} 
	
	
}
