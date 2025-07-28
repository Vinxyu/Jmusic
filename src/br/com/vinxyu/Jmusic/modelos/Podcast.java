package br.com.vinxyu.Jmusic.modelos;

public class Podcast extends Audio {
    private String descricao;
    private String host;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassificacao() {
        if (this.getNumeroDeCurtidas() > 500) {
            return 10;
        } else {
            return 6;
        }
    }
}
