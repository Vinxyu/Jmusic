package br.com.vinxyu.Jmusic.modelos;

public class Favoritos {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 7) {
            System.out.println(audio.getTitulo()+" é um grande sucesso!");
        } else {
            System.out.println(audio.getTitulo()+" está em crescimento");
        }
    }
}
