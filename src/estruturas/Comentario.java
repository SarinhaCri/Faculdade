package estruturas;

import usuarios.usuario;

public class Comentario {
    private String texto;
    private usuario usuario;

    public Comentario(String texto, usuario usuario) {
        this.texto = texto;
        this.usuario = usuario;
    }

    public String getTexto() { return texto; }
    public usuario getUsuario() { return usuario; }
}

