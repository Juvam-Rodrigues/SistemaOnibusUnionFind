package br.edu.ufrn.lpii.repo.onibus;

import java.util.ArrayList;
import java.util.List;

public class ListaTodosOnibus {
	private List<Onibus> lista;

	public ListaTodosOnibus() {
		lista = new ArrayList<>();
	}

	public List<Onibus> getTodosOsOnibus() {
		return lista;
	}

	public void setListaTodosOnibus(Onibus onibus) {
		lista.add(onibus);
	}
	
}
