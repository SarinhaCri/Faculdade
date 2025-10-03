package estruturas;

public class Avaliacao {
    private String comentario;
    private int nota;

    public Avaliacao(String comentario, int nota) {
        this.comentario = comentario;
        this.nota = nota;
    }

    public void avaliar() {
        System.out.println("Avaliação: " + comentario + " | Nota: " + nota);
    }
}

