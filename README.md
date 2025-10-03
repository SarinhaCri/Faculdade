# Projeto de Streaming de Áudio

Este projeto foi desenvolvido como parte das atividades acadêmicas da disciplina de **Programação Orientada a Objetos**.  
O sistema simula uma plataforma de streaming de áudio, permitindo gerenciar músicas, podcasts, audiobooks, playlists, histórico de reprodução e diferentes tipos de usuários.



## Funcionalidades

- **Usuários**
  - Usuário Gratuito (com anúncios)
  - Usuário Premium (mensalidade)
  - Usuário Família (contas múltiplas)

- **Conteúdos**
  - Músicas
  - Podcasts
  - Audiobooks

- **Estruturas**
  - Álbuns
  - Playlists
  - Histórico de reprodução
  - Avaliações e recomendações

- **Polimorfismo**
  - Todos os conteúdos (Música, Podcast, Audiobook) herdam de `Conteudo` e implementam o método `reproduzir()`.


## Tecnologias Utilizadas

- **Java 21**
- **Orientação a Objetos**
  - Herança
  - Encapsulamento
  - Polimorfismo
- **VS Code** (com extensões para Java)



## Estrutura do Projeto

-src/
-├── conteudo/
-│ ├── Audiobook.java
-│ ├── Conteudo.java
-│ ├── Musica.java
-│ └── Podcast.java
-├── estruturas/
-│ ├── Album.java
-│ ├── Avaliacao.java
-│ ├── Comentario.java
-│ ├── Genero.java
-│ ├── Historico.java
-│ ├── Pagamento.java
-│ ├── Playlist.java
-│ └── Recomendacao.java
-├── usuarios/
-│ ├── Apresentador.java
-│ ├── Artista.java
-│ ├── Narrador.java
-│ ├── Usuario.java
-│ ├── UsuarioFamilia.java
-│ ├── UsuarioGratuito.java
-│ └── UsuarioPremium.java
-└── streaming/
-└── Main.java

# Autor

Sara Cristina Viana Rocha



