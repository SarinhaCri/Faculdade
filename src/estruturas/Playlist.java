package estruturas;

import java.util.ArrayList;
import java.util.List;

import conteudo.Conteudo;

public class Playlist {
    private String nome;
    private String conteudo; // descrição
    private List<Conteudo> itens;

    public Playlist(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.itens = new ArrayList<>();
    }

    public void addConteudo(Conteudo c) {
        itens.add(c);
        System.out.println("Conteúdo '" + c.getTitulo() + "' adicionado à playlist '" + nome + "'.");
    }

    public void reproduzir() {
        System.out.println("Reproduzindo playlist: " + nome);
        for (Conteudo c : itens) {
            c.reproduzir();
        }
    }
}
