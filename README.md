# Sistema de Ônibus com Union-Find e Listas Ligadas

## Descrição do Projeto

Este projeto implementa um **sistema de gerenciamento de rotas de ônibus** usando uma estrutura de dados baseada em **Union-Find com listas ligadas**. Cada **rota** é representada como um **conjunto disjunto**, e cada **parada ou ônibus** é um **nó** desse conjunto.

O sistema permite:

- Criar e gerenciar rotas de ônibus.
- Adicionar novas paradas e ônibus dinamicamente.
- Unir rotas diferentes em uma única rota.
- Verificar se duas paradas ou ônibus estão na mesma rota.
- Listar todas as paradas e ônibus de uma rota.

A implementação com **listas ligadas** facilita percorrer todos os elementos de uma rota e mantém a lógica de **representante de cada conjunto**.

---

## Estrutura do Projeto

### Classe `No`
Representa um elemento do sistema (parada ou ônibus).

- **Campos principais**:
  - `String nomeParada` → nome único da parada ou do ônibus
  - `No representante` → representante do conjunto (rota)
  - `No proximo` → próximo elemento da lista ligada da rota

- **Funções**:
  - `getRepresentante()` / `setRepresentante()`
  - `getProximo()` / `setProximo()`

### Classe `Rota`
Gerencia todas as paradas e rotas.

- **Campos principais**:
  - `Map<String, No> paradas` → mapeia nomes únicos para os nós correspondentes

- **Funções principais**:
  - `adicionarParada(String nomeParada)` → adiciona uma nova parada
  - `find(No parada)` → retorna o representante da rota do nó
  - `unirParadas(String nomeParadaA, String nomeParadaB)` → une duas rotas
  - `mesmaRota(String nameA, String nameB)` → verifica se dois elementos estão na mesma rota
  - `printRoute(String name)` → imprime todas as paradas e ônibus de uma rota

---

## Exemplo de Uso

```java
Rota rota = new Rota();

// Adicionar paradas
rota.adicionarParada("Terminal A");
rota.adicionarParada("Parada 1");
rota.adicionarParada("Parada 2");

// Unir paradas para formar uma rota
rota.unirParadas("Terminal A", "Parada 1");
rota.unirParadas("Parada 1", "Parada 2");

// Verificar se estão na mesma rota
System.out.println(rota.mesmaRota("Terminal A", "Parada 2")); // true

// Imprimir rota completa
rota.printRoute("Terminal A");
// Saída: Terminal A -> Parada 1 -> Parada 2 -> null
