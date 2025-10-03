package conteudo;

public abstract class Conteudo {
    protected int id;
    private String titulo;
    protected double duracao; // se usar int, mude pra int no resto

    public Conteudo(int id, String titulo, double duracao) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void reproduzir();
}
