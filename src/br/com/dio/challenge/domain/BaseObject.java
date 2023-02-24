package br.com.dio.challenge.domain;

public abstract class BaseObject {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "BaseObject{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
