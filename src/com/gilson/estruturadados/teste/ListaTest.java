package com.gilson.estruturadados.teste;

import com.gilson.estruturadados.vetor.Lista;

public class ListaTest {
  public static void main(String[] args) {
    Lista<String> nomes = new Lista<>();
    nomes.adicionar("João");
    nomes.adicionar("Maria");
    nomes.adicionar("Pedro");
    nomes.adicionar("" + 1);
    System.out.println(nomes);
  }
}
