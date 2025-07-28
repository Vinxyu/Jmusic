package br.com.vinxyu.Jmusic.modelos;

public class Audio {
    private int getNumeroDeCurtidas;
    private String titulo;
    private int duracaoEmMinutos;
    private int numeroDeCurtidas;
    private int totalDeReproducoes;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.numeroDeCurtidas++;
    }

    public void reproduz() {
        this.totalDeReproducoes++;
    }
}
