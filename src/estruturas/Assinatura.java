package estruturas;

public class Assinatura {
    private String tipo;
    private double preco;

    public Assinatura() {}

    public Assinatura(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public void renovar() {
        System.out.println("Assinatura '" + tipo + "' renovada. Valor: R$ " + preco);
    }

    public void exibir() {
        System.out.println("Assinatura: " + tipo + " | Preço: R$ " + preco);
    }
}
