package br.com.dio;

import br.com.dio.model.Animal;
import br.com.dio.model.Pessoa;

public class PrimeiroPrograma {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("José", 26);
        System.out.println(pessoa);

        Livro livro = new Livro("O Espião", 350);
        System.out.println(livro);

        Animal animal = new Animal("Gato", "Tônico");
        System.out.println(animal);
    }
}

class Livro {
    private String nome;
    private Integer numPg;

    public Livro(String nome, Integer numPg) {
        this.nome = nome;
        this.numPg = numPg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPg() {
        return numPg;
    }

    public void setNumPg(Integer numPg) {
        this.numPg = numPg;
    }

    @Override
    public String toString() {
        return "Livro [" +
                "nome = '" + nome + '\'' +
                ", numPg = " + numPg +
                ']';
    }
}
