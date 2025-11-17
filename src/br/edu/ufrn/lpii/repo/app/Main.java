package br.edu.ufrn.lpii.repo.app;

import br.edu.ufrn.lpii.repo.union_find.Rota;

public class Main {

	public static void main(String[] args) {
		Rota rota = new Rota();

		rota.adicionarParada("Parada Midway");
		rota.adicionarParada("Parada Natal Shopping");
		rota.adicionarParada("Parada Alecrim");
		rota.adicionarParada("Parada IMD");
		rota.adicionarParada("Parada Setor 2");
		rota.adicionarParada("Parada Setor 3");

		rota.unirParadas("Parada Midway", "Parada Alecrim");
		rota.printRoute("Parada Midway");
		rota.unirParadas("Parada IMD", "Parada Setor 2");
		rota.unirParadas("Parada Alecrim", "Parada IMD");
		System.out.println();
		rota.printRoute("Parada Midway");

	}

}
