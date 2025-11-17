package br.edu.ufrn.lpii.repo.union_find;

import java.util.HashMap;
import java.util.Map;

public class Rota { //Representa um conjunto disjunto

	private Map<String, No> paradas = new HashMap<>();
	
	public Rota() {
		super();
	}

	public void adicionarParada(String nomeParada) {
		if(paradas.containsKey(nomeParada)) {
			//Adicionar exception de que já existe
			
		}
		else {
			No parada = new No(nomeParada);
			paradas.put(parada.getNomeParada(), parada);
		}
	}
	
	public No find(No parada) {
		return parada.getRepresentante();
	}
	
	public void unirParadas(String nomeParadaA, String nomeParadaB){
	       	No repA = find(paradas.get(nomeParadaA));
	       	No repB = find(paradas.get(nomeParadaB));
	        if(repA.getNomeParada() == repB.getNomeParada()) {
	        	return;
	        }

	        //Por padrão o representante da primeira parada virá o novo representante
	        // anexar lista B ao final da lista A
	        No percorrerA = repA;
	        while(percorrerA.getProximo() != null) {
	        	percorrerA = percorrerA.getProximo();
	        }
	        percorrerA.setProximo(repB);

	        // atualizar representante de todos os nós da lista B
	        No atualB = repB;
	        while(atualB != null){
	            atualB.setRepresentante(repA);
	            atualB = atualB.getProximo();
	        }
	    }
	
	public boolean mesmaRota(String nameA, String nameB){
        No paradaA = paradas.get(nameA);
        No paradaB = paradas.get(nameB);
        return find(paradaA) == find(paradaB);
    }

	public void printRoute(String name){
        No node = paradas.get(name);
        No representante = find(node);
        No atual = representante;
        while(atual != null){
            System.out.print(atual.getNomeParada() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }
	
}
