package br.com.java.minhasmusicas.modelos;

public class Musica extends Audio{
    private String Album;
    private String Artista;
    private String Genero;

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 300){
            return 10;
        }else {
            return 7;
        }
    }
}
