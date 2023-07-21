package br.com.records.principal;

import br.com.records.modelos.MinhasPreferidas;
import br.com.records.modelos.Musica;
import br.com.records.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Bolha dev");
        podcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(podcast);
        minhasPreferidas.inclui(minhaMusica);
    }
}
