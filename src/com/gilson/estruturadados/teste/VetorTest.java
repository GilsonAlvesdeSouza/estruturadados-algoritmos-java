package com.gilson.estruturadados.teste;

import java.util.HashMap;
import java.util.Map;

import com.gilson.estruturadados.vetor.Vetor;

public class VetorTest {
  public static void main(String[] args) {
    Vetor vetor = new Vetor();
    Vetor nomes = new Vetor();

    Map<String, String> pessoa = new HashMap<>();

    pessoa.put("nome", "Gilson");
    pessoa.put("idade", "41");
    pessoa.put("sexo", "M");

    nomes.adicionar("Fulano");
    nomes.adicionar("Ciclano");
    nomes.adicionar("Beltrano");
    nomes.adicionar("Juresca");
    vetor.adicionar(10);
    vetor.adicionar(2);
    vetor.adicionar(2);
    vetor.adicionar("asdf");
    vetor.adicionar(nomes);
    vetor.adicionar(pessoa);
    vetor.adicionar(false);
    vetor.adicionar(false);
    vetor.adicionar(9);
    vetor.adicionar(3);

    System.out.println(vetor.tamanho());
    System.out.println(vetor);
  }

}
