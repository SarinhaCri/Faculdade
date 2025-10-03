package streaming;

import conteudo.Audiobook;
import conteudo.Musica;
import conteudo.Podcast;
import estruturas.Album;
import estruturas.Assinatura;
import estruturas.Avaliacao;
import estruturas.Comentario;
import estruturas.Genero;
import estruturas.Historico;
import estruturas.Pagamento;
import estruturas.Playlist;
import estruturas.Recomendacao;
import usuarios.Apresentador;
import usuarios.Artista;
import usuarios.Narrador;
import usuarios.UsuarioFamilia;
import usuarios.UsuarioGratuito;
import usuarios.UsuarioPremium;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando aplicativo de streaming de áudio");

        
        UsuarioGratuito usuarioGratuito = new UsuarioGratuito(1, "João Pedro", "joaopedro@email.com", true);
        UsuarioPremium usuarioPremium = new UsuarioPremium(2, "Maria Clara", "maria.c@example.com", 19.90);
        UsuarioFamilia usuarioFamilia = new UsuarioFamilia(3, "Família Silva", "familia.silva@example.com", 4);

        
        Artista artista = new Artista(4, "Roberto Carlos", "roberto@email.com", "MPB");
        Narrador narrador = new Narrador(5, "Carlos Alberto", "carlos@example.com", "Dramático");
        Apresentador apresentador = new Apresentador(6, "Ana Paula", "ana@example.com", "Tech Talk");

     
        System.out.println("\n--- Informações dos Usuários ---");
        usuarioGratuito.exibirInfo();
        usuarioPremium.exibirInfo();
        usuarioFamilia.exibirInfo();
        artista.exibirInfo();
        narrador.exibirInfo();
        apresentador.exibirInfo();

        Album album1 = new Album("Grandes Sucessos", 2022);
        Album album2 = new Album("Novidades", 2023);

    
        Musica musica = new Musica(1, "Emoções", 4, artista, album1);
        Podcast podcast = new Podcast(2, "Tecnologia Hoje", 45, apresentador, 10);
        Audiobook audiobook = new Audiobook(3, "O Poder do Hábito", 360, narrador, "Capítulo 1-12");

      
        album2.addMusica("Lançamento 1");
        album2.addMusica("Lançamento 2");

        
        System.out.println("\n--- Manipulação de Conteúdos ---");
       musica.reproduzir();
       podcast.reproduzir();
       audiobook.reproduzir();
        
        System.out.println("\n--- Playlists e Histórico ---");
        Playlist playlist = new Playlist("Favoritas do Apres.", "Seleção de episódios e músicas");
        playlist.addConteudo(musica);
        playlist.addConteudo(podcast);
        playlist.reproduzir();

        Historico historico = new Historico("Músicas ouvidas recentemente");
        historico.adicionarRegistro("Emoções - Roberto Carlos");
        historico.adicionarRegistro("Tecnologia Hoje - Ep.10");
        historico.exibir();

        
        album1.addMusica("Detalhes");
        album1.addMusica("Como é grande o meu amor por você");

        System.out.println("\n--- Informações dos Álbuns ---");
        album1.exibirInfo();
        album2.exibirInfo();

        System.out.println("\n--- Pagamentos e Assinaturas ---");
        Pagamento pagamento = new Pagamento("Cartão de Crédito", 19.90);
        pagamento.processar();

        Assinatura assinatura = new Assinatura();
        assinatura.setTipo("Premium");
        assinatura.setPreco(19.90);
        assinatura.exibir();

        
        System.out.println("\n--- Avaliações e Comentários ---");
        Avaliacao avaliacao = new Avaliacao("Ótima música!", 5);
        avaliacao.avaliar();

        Comentario comentario = new Comentario("Adorei esse podcast!", usuarioPremium);
        System.out.println("Comentário de " + comentario.getUsuario().getNome() + ": " + comentario.getTexto());

       
        Genero genero = new Genero("Rock");
        System.out.println("Gênero criado: " + genero.getNome());
        Recomendacao recomendacao = new Recomendacao("Baseado nos seus gostos musicais");
        recomendacao.sugerir();

        
        System.out.println("\n--- Funcionalidades Específicas ---");
        usuarioPremium.baixar("Música: Emoções");
        usuarioGratuito.ouvirAnuncio();
        usuarioFamilia.adicionarMembro();
        artista.publicarConteudo();
        narrador.narrar();
        apresentador.apresentar();

        System.out.println("\nAplicativo encerrado com sucesso!");
    }
}
