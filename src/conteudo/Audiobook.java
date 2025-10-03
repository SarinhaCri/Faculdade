package conteudo;

import usuarios.Narrador;

public class Audiobook extends Conteudo {
    private Narrador narrador;
    private String capitulos;

    
    public Audiobook(int id, String titulo, double duracao, Narrador narrador, String capitulos) {
        super(id, titulo, duracao);
        this.narrador = narrador;
        this.capitulos = capitulos;
    }

    
    public Narrador getNarrador() {
        return narrador;
    }

    public String getCapitulos() {
        return capitulos;
    }

    
    @Override
    public void reproduzir() {
        System.out.println("Audiobook: " + getTitulo() +
                           " | Narrador: " + narrador.getNome() +
                           " | Capítulos: " + capitulos);
    }
}

