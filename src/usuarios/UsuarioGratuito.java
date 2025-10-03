package usuarios;

public class UsuarioGratuito extends usuario {
    private boolean anuncio;

    public UsuarioGratuito(Integer id, String nome, String email, boolean anuncio) {
        super(id, nome, email);
        this.anuncio = anuncio;
    }

    public boolean isAnuncio() { return anuncio; }
    public void setAnuncio(boolean anuncio) { this.anuncio = anuncio; }

    @Override
    public void ouvirConteudo() {
        System.out.println(getNome() + " está ouvindo conteúdo (versão gratuita).");
        if (anuncio) {
            ouvirAnuncio();
        }
    }

    public void ouvirAnuncio() {
        System.out.println(getNome() + " está ouvindo um anúncio...");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário Gratuito: " + getNome() + " | Email: " + getEmail() + " | Anúncios: " + anuncio);
    }
}
