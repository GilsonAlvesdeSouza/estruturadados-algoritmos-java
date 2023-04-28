package com.gilson.estruturadados.vetor;

public class VetorString {
  private String[] elementos;
  private int tamanhoVetor;

  public VetorString() {
    this.elementos = new String[10];
    this.tamanhoVetor = 0;
  }

  public VetorString(int capacidade) {
    this.elementos = new String[capacidade];
    this.tamanhoVetor = 0;
  }

  public boolean adicionar(String elemento) {
    this.aumentaCapacidade();
    if (this.tamanhoVetor < this.elementos.length) {
      this.elementos[this.tamanhoVetor] = elemento;
      this.tamanhoVetor++;
      return true;
    } else {
      return false;
    }
  }

  public boolean adicionar(int posicao, String elemento) {
    if (!(posicao >= 0 && posicao < this.tamanhoVetor)) {
      throw new IllegalArgumentException("Posicão inválida");
    }
    this.aumentaCapacidade();
    for (int i = this.tamanhoVetor - 1; i >= posicao; i--) {
      this.elementos[i + 1] = this.elementos[i];
    }

    this.elementos[posicao] = elemento;
    this.tamanhoVetor++;
    return false;
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

  public boolean remover(String elemento) {
    var existe = this.busca(elemento);
    if (existe == -1) {
      return false;
    }
    this.remover(existe);
    return true;
  }

  public void remover(int posicao) {
    if (!(posicao >= 0 && posicao < this.tamanhoVetor)) {
      throw new IllegalArgumentException("Posicão inválida");
    }
    for (int i = posicao; i < this.tamanhoVetor - 1; i++) {
      this.elementos[i] = this.elementos[i + 1];
    }
    this.tamanhoVetor--;
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

  private void aumentaCapacidade() {
    if (this.tamanhoVetor == this.elementos.length) {
      String[] elementosNovos = new String[this.elementos.length * 2];
      for (int i = 0; i < this.elementos.length; i++) {
        elementosNovos[i] = this.elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }
}
