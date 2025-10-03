package usuarios;

public class UsuarioPremium extends usuario {
    private Double valorMensal;

    public UsuarioPremium(Integer id, String nome, String email, Double valorMensal) {
        super(id, nome, email);
        this.valorMensal = valorMensal;
    }

    public Double getValorMensal() { return valorMensal; }
    public void setValorMensal(Double valorMensal) { this.valorMensal = valorMensal; }

    @Override
    public void ouvirConteudo() {
        System.out.println(getNome() + " está ouvindo conteúdo (Premium).");
    }

    public void baixar(String item) {
        System.out.println(getNome() + " baixou: " + item);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário Premium: " + getNome() + " | Email: " + getEmail() + " | Valor mensal: " + valorMensal);
    }
}
