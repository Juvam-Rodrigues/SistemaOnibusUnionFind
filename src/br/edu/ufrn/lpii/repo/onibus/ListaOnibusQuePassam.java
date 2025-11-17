package br.edu.ufrn.lpii.repo.onibus;

import java.util.ArrayList;
import java.util.List;

public class ListaOnibusQuePassam {
	private List<Onibus> listaOnibusQuePassam;

	
	public ListaOnibusQuePassam() {
		listaOnibusQuePassam = new ArrayList<>();
	}

	public void getOnibusQuePassam() {
		System.out.println("Ônibus que te levam ao seu destino:");
		boolean existeOnibus = false;
		for(Onibus onibus: listaOnibusQuePassam){
			if(onibus != null) {
				 System.out.print(onibus.getNome() + " -> ");			
				 existeOnibus = true;
			}
		}
		if(existeOnibus == false) {
			System.out.println("Não existe ônibus que faça essa rota...");
		}
	}

	public void setOnibusQuePassam(String paradaA, String paradaB, ListaTodosOnibus listaTodos) {
		for(Onibus onibus: listaTodos.getTodosOsOnibus()) {
			if(onibus.getRota().mesmaRota(paradaA, paradaB)) {
				listaOnibusQuePassam.add(onibus);
			}
		}
	}
	
}
