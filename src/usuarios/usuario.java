package usuarios;

public abstract class usuario {
    private Integer id;
    private String nome;
    private String email;

    public usuario(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public void fazerLogin() {
        System.out.println(nome + " fez login com o email " + email);
    }

    public abstract void ouvirConteudo();

    public abstract void exibirInfo();
}
