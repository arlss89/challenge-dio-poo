package br.com.dio.challenge.domain;

public abstract class Conteudo extends BaseObject {
    protected static final double XP_PADRAO = 10d;
    private String descricao;

    public abstract double calcularXp();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
