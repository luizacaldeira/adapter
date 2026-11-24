package org.example;

public class Cliente {

    IClassificacao classificacao;
    ClassificacaoAdapter legado;

    public Cliente() {
        classificacao = new ClassificacaoConceito();
        legado = new ClassificacaoAdapter(classificacao);
    }

    public void setClassificacao(String conceito) {
        classificacao.setClassificacao(conceito);
        legado.salvarClassificacao();
    }

    public String getClassificacao() {
        return legado.recuperarClassificacao();
    }

    public float getScore() {
        return legado.getScore();
    }

}
