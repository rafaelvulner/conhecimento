package com.teste.balada.entities;

public class BaladaEntity {
  public Integer id;

  public String nome;

  public Integer idade;

  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }
}
