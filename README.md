# Árvore de Busca Binária em Java

 Luiz Roberto Vicari

## Descrição do projeto

Implementação manual de uma Árvore de Busca Binária (Binary Search Tree) em Java, sem uso de bibliotecas externas ou classes prontas de estruturas de dados. O projeto permite inserir valores inteiros respeitando as propriedades da BST e contar a quantidade de nós folhas da árvore.

## Como a estrutura foi implementada

- **Node.java**: representa um nó, com o valor inteiro e as referências para os filhos `esquerda` e `direita`. Possui o método `isLeaf()`, que retorna `true` quando o nó não tem filhos.
- **Tree.java**: guarda a referência para a raiz (`root`) e implementa:
  - `insert(int valor)`: inserção recursiva. Valores menores vão para a subárvore esquerda e maiores para a direita. Valores duplicados são ignorados.
  - `countLeaves()`: contagem recursiva. Árvore vazia retorna 0, um nó folha retorna 1, e nos demais casos soma as folhas das subárvores esquerda e direita.
  - `inOrder()`: exibe os valores em ordem crescente, para conferir a estrutura.
  - `isEmpty()`: indica se a árvore está vazia.
- **Main.java**: executa testes com árvore vazia, só com a raiz, balanceada, desbalanceada, degenerada, com valores duplicados e com inserções posteriores.

## Exemplo de utilização

```java
Tree tree = new Tree();

tree.insert(50);
tree.insert(30);
tree.insert(70);
tree.insert(20);
tree.insert(40);
tree.insert(60);
tree.insert(80);

tree.inOrder();
System.out.println("Folhas: " + tree.countLeaves());
```

Saída:

```
20 30 40 50 60 70 80 
Folhas: 4
```

As folhas são os nós 20, 40, 60 e 80.

## Como executar

```
javac Node.java Tree.java Main.java
java Main
```
