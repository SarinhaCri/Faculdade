package conteudo;

import usuarios.Apresentador;

public class Podcast extends Conteudo {
    private Apresentador apresentador;
    private int episodios;

    public Podcast(int id, String titulo, double duracao, Apresentador apresentador, int episodios) {
        super(id, titulo, duracao);
        this.apresentador = apresentador;
        this.episodios = episodios;
    }

    @Override
    public void reproduzir() {
        System.out.println("Podcast: " + getTitulo() + 
                       " | Apresentador: " + apresentador.getNome() +
                       " | Episódios: " + episodios);
}

}
