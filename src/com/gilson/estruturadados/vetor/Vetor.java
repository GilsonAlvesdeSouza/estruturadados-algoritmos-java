package com.gilson.estruturadados.vetor;

public class Vetor {
  private String[] elementos;
  private int tamanhoVetor;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.tamanhoVetor = 0;
  }

  public boolean adicionar(String elemento) {
    if (this.tamanhoVetor < this.elementos.length) {
      this.elementos[this.tamanhoVetor] = elemento;
      this.tamanhoVetor++;
      return true;
    } else {
      return false;
    }
  }

  public int tamanho() {
    return this.tamanhoVetor;
  }

  public String busca(int posicao) {
    if (!(posicao >= 0 && posicao < this.tamanhoVetor)) {
      throw new IllegalArgumentException("Posicão inválida");
    }
    return this.elementos[posicao];
  }

  public int busca(String elemento) {
    var count = 0;
    while (count < this.tamanhoVetor) {
      if (this.elementos[count].equals(elemento)) {
        return count;
      }
      count++;
    }
    return -1;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("[");

    for (int i = 0; i < this.tamanhoVetor - 1; i++) {
      s.append(this.elementos[i]);
      s.append(", ");
    }

    if (this.tamanhoVetor > 0) {
      s.append(this.elementos[this.tamanho() - 1]);
    }

    s.append("]");
    return s.toString();
  }
}
