package estruturas;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private int ano;
    private List<String> musicas;

    public Album(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.musicas = new ArrayList<>();
    }

    public String getTitulo() { return titulo; }
    public int getAno() { return ano; }

    public void addMusica(String nome) {
        musicas.add(nome);
        System.out.println("Música '" + nome + "' adicionada ao álbum '" + titulo + "'.");
    }

    public void exibirInfo() {
        System.out.println("Album: " + titulo + " (" + ano + ") - Músicas: " + musicas);
    }
}
