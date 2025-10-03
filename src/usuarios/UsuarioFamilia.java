package usuarios;

public class UsuarioFamilia extends usuario {
    private Integer numeroMembros;

    public UsuarioFamilia(Integer id, String nome, String email, Integer numeroMembros) {
        super(id, nome, email);
        this.numeroMembros = numeroMembros;
    }

    public Integer getNumeroMembros() { return numeroMembros; }
    public void setNumeroMembros(Integer numeroMembros) { this.numeroMembros = numeroMembros; }

    @Override
    public void ouvirConteudo() {
        System.out.println(getNome() + " (Família) está ouvindo conteúdo.");
    }

    public void adicionarMembro() {
        numeroMembros++;
        System.out.println("Membro adicionado. Total membros: " + numeroMembros);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário Família: " + getNome() + " | Email: " + getEmail() + " | Membros: " + numeroMembros);
    }
}
