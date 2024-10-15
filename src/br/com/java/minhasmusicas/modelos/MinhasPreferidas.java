package br.com.java.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado "+
                    "o top da balada");
        }else {
            System.out.println(audio.getTitulo() + " bastante ouvido");
        }
    }
}
