package com.gilson.estruturadados.teste;

import com.gilson.estruturadados.vetor.VetorString;

public class VetorStringTest {
  public static void main(String[] args) {
    VetorString vetor = new VetorString();

    vetor.adicionar("Primeiro");
    vetor.adicionar("Segundo");
    vetor.adicionar("Terceiro");
    vetor.adicionar("Quarto");
    vetor.adicionar("Quinto");
    System.out.println("tamanho: " + vetor.tamanho());
    // System.out.println("elemento da posição 3: " + vetor.busca(3));
    // System.out.println("posição do elemento: " + vetor.busca("Quarto"));
    // vetor.adicionar(0, "Vai dar merda");
    vetor.remover("Quarto");
    System.out.println(vetor);
  }
}
