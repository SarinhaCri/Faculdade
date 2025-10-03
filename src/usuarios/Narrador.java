package usuarios;

public class Narrador extends usuario {
    private String estiloNarracao;

    public Narrador(Integer id, String nome, String email, String estiloNarracao) {
        super(id, nome, email);
        this.estiloNarracao = estiloNarracao;
    }

    public String getEstiloNarracao() { return estiloNarracao; }
    public void setEstiloNarracao(String estiloNarracao) { this.estiloNarracao = estiloNarracao; }

    @Override
    public void ouvirConteudo() {
        System.out.println(getNome() + " (Narrador) está ouvindo audiobooks.");
    }

    public void exibirInfo() {
        System.out.println("Narrador: " + getNome() + " | Estilo: " + estiloNarracao);
    }

    public void narrar() {
        System.out.println(getNome() + " está narrando um capítulo...");
    }
}
