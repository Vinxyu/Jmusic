package br.com.vinxyu.Jmusic.principal;

import br.com.vinxyu.Jmusic.modelos.Favoritos;
import br.com.vinxyu.Jmusic.modelos.Musica;
import br.com.vinxyu.Jmusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Black");
        musica.setArtista("Pearl Jam");
        musica.setAlbum("Ten");
        musica.setGenero("Rock");

        for (int i = 0; i < 2000; i++) {
            musica.reproduz();

        }

        for (int i = 0; i < 50; i++) {
            musica.curte();

        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Flow");
        podcast.setDescricao("Podcast que tras famosos de todo o Brasil para discutir histórias e debates");

        for (int i = 0; i < 3000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 200; i++) {
            podcast.curte();
        }
        Favoritos favoritos = new Favoritos();
        favoritos.inclui(podcast);
        favoritos.inclui(musica);
    }
}
