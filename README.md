```mermaid
classDiagram
    class IPhone {
        -String modelo
        -String numeroTelefone
        -int capacidadeBateria
        -boolean ligado
        -int volume
        +iPhone(String modelo, String numeroTelefone, int capacidadeBateria)
        +void tocarMusica(String musica)
        +void pausarMusica()
        +void pararMusica()
        +void fazerChamada(String numero)
        +void atenderChamada()
        +void finalizarChamada()
        +void navegar(String url)
        +void adicionarAba(String url)
        +void atualizarPagina()
        +void ligar()
        +void desligar()
        +void carregarBateria(int porcentagem)
        +void aumentarVolume()
        +void diminuirVolume()
        +String getModelo()
        +String getNumeroTelefone()
        +int getCapacidadeBateria()
        +boolean isLigado()
        +int getVolume()
        +void setVolume(int volume)
    }
    ReprodutorMusical <|.. iPhone
    AparelhoTelefonico <|.. iPhone
    NavegadorInternet <|.. iPhone

    class ReprodutorMusical {
        <<interface>>
        +void tocarMusica(String musica)
        +void pausarMusica()
        +void pararMusica()
    }

    class AparelhoTelefonico {
        <<interface>>
        +void fazerChamada(String numero)
        +void atenderChamada()
        +void finalizarChamada()
    }

    class NavegadorInternet {
        <<interface>>
        +void navegar(String url)
        +void adicionarAba(String url)
        +void atualizarPagina()
    }
