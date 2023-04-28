package com.gilson.estruturadados.vetor.teste;

import com.gilson.estruturadados.vetor.Vetor;

public class Aula02 {
  public static void main(String[] args) {
    Vetor vetor = new Vetor(5);

    vetor.adicionar("Primeiro");
    vetor.adicionar("Segundo");
    vetor.adicionar("Terceiro");
    vetor.adicionar("Quarto");
    System.out.println("tamanho: " + vetor.tamanho());
    System.out.println("elemento da posição 3: " + vetor.busca(3));
    System.out.println("posição do elemento: " + vetor.busca("Quarto"));
  }
}
