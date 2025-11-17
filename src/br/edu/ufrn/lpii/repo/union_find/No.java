package br.edu.ufrn.lpii.repo.union_find;

import java.util.Objects;

public class No { //Cada Nó é uma parada
	private String nomeParada;
	private No representante;
	private No proximo;
	
	public No(String nomeParada) {
		super();
		this.nomeParada = nomeParada;
		this.representante = this;  // inicialmente representante é ele mesmo
        this.proximo = null;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(nomeParada);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		No other = (No) obj;
		if(nomeParada.equalsIgnoreCase(other.getNomeParada())) {
			return true;
		}else {
			return false;
		}
	}



	public String getNomeParada() {
		return nomeParada;
	}

	public void setNomeParada(String nomeParada) {
		this.nomeParada = nomeParada;
	}

	public No getRepresentante() {
		return representante;
	}

	public void setRepresentante(No representante) {
		this.representante = representante;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
	
}
