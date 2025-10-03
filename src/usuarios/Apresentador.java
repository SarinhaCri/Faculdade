package usuarios;

public class Apresentador extends usuario {
    private String programa;

    public Apresentador(Integer id, String nome, String email, String programa) {
        super(id, nome, email);
        this.programa = programa;
    }

    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }

    @Override
    public void ouvirConteudo() {
        System.out.println(getNome() + " (Apresentador) ouve episódios para preparação.");
    }

    public void exibirInfo() {
        System.out.println("Apresentador: " + getNome() + " | Programa: " + programa);
    }

    public void apresentar() {
        System.out.println(getNome() + " está apresentando o programa " + programa);
    }
}
