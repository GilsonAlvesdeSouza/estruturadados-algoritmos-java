package com.gilson.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
  private T[] elementos;
  private int tamanhoVetor;

  public Lista() {
    this.elementos = (T[]) new Object[10];
    this.tamanhoVetor = 0;
  }

  public Lista(int capacidade, Class<T> tipoClasse) {
    this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
    this.tamanhoVetor = 0;
  }

  public boolean adicionar(T elemento) {
    this.aumentaCapacidade();
    if (this.tamanhoVetor < this.elementos.length) {
      this.elementos[this.tamanhoVetor] = elemento;
      this.tamanhoVetor++;
      return true;
    } else {
      return false;
    }
  }

  public boolean adicionar(int posicao, T elemento) {
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

  public Object busca(int posicao) {
    if (!(posicao >= 0 && posicao < this.tamanhoVetor)) {
      throw new IllegalArgumentException("Posicão inválida");
    }
    return this.elementos[posicao];
  }

  public int busca(Object elemento) {
    var count = 0;
    while (count < this.tamanhoVetor) {
      if (this.elementos[count].equals(elemento)) {
        return count;
      }
      count++;
    }
    return -1;
  }

  public boolean remover(Object elemento) {
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
      T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
      for (int i = 0; i < this.elementos.length; i++) {
        elementosNovos[i] = this.elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }
}
