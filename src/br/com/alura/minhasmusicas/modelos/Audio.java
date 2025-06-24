package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalRepoducao;
    private int totalCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalRepoducao() {
        return totalRepoducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalRepoducao++;
    }
}
