package usuarios;

public class Artista extends usuario {
    private String generoMusical;

    public Artista(Integer id, String nome, String email, String generoMusical) {
        super(id, nome, email);
        this.generoMusical = generoMusical;
    }

    public String getGeneroMusical() { return generoMusical; }
    public void setGeneroMusical(String generoMusical) { this.generoMusical = generoMusical; }

    @Override
    public void ouvirConteudo() {
        System.out.println(getNome() + " (Artista) está ouvindo suas próprias faixas.");
    }

    public void exibirInfo() {
        System.out.println("Artista: " + getNome() + " | Gênero: " + generoMusical);
    }

    public void publicarConteudo() {
        System.out.println(getNome() + " publicou um novo conteúdo!");
    }
}
