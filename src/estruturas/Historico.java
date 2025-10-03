package estruturas;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private String descricao;
    private List<String> registros;

    public Historico(String descricao) {
        this.descricao = descricao;
        this.registros = new ArrayList<>();
    }

    public void adicionarRegistro(String registro) {
        registros.add(registro);
    }

    public void exibir() {
        System.out.println("Histórico: " + descricao);
        for (String r : registros) {
            System.out.println(" - " + r);
        }
    }
}
