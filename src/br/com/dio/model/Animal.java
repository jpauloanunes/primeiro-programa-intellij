package br.com.dio.model;

import java.util.Objects;

public class Animal {

    private String tipo;
    private String nome;

    public Animal() {}

    public Animal(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(tipo, animal.tipo) && Objects.equals(nome, animal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, nome);
    }

    @Override
    public String toString() {
        return "Animal [" +
                "tipo = '" + tipo + '\'' +
                ", nome = '" + nome + '\'' +
                ']';
    }
}
