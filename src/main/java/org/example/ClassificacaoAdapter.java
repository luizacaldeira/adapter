package org.example;

public class ClassificacaoAdapter extends ClassificacaoScore {

    private IClassificacao classificacaoConceito;

    public ClassificacaoAdapter(IClassificacao classificacaoConceito) {
        this.classificacaoConceito = classificacaoConceito;
    }

    public String recuperarClassificacao() {
        if (this.getScore() >= 90.0f)
            classificacaoConceito.setClassificacao("A");
        else
        if (this.getScore() >= 80.0f)
            classificacaoConceito.setClassificacao("B");
        else
        if (this.getScore() >= 70.0f)
            classificacaoConceito.setClassificacao("C");
        else
            classificacaoConceito.setClassificacao("D");
        return classificacaoConceito.getClassificacao();
    }

    public void salvarClassificacao() {
        if (classificacaoConceito.getClassificacao().equals("A"))
            this.setScore(90.0f);
        else
        if (classificacaoConceito.getClassificacao().equals("B"))
            this.setScore(80.0f);
        else
        if (classificacaoConceito.getClassificacao().equals("C"))
            this.setScore(70.0f);
        else
            this.setScore(0.0f);
    }
}