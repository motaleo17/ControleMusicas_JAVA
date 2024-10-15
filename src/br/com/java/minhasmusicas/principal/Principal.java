package br.com.java.minhasmusicas.principal;

import br.com.java.minhasmusicas.modelos.MinhasPreferidas;
import br.com.java.minhasmusicas.modelos.Musica;
import br.com.java.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("So os Loucos Sabem");
        minhaMusica.setArtista("Chorao");
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow");
        meuPodcast.setApresentador("Igor");

        for (int i = 0; i < 30; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica );
    }
}
