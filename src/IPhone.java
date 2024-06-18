public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private String numeroTelefone;
    private int capacidadeBateria;
    private boolean ligado;
    private int volume;

    public IPhone(String modelo, String numeroTelefone, int capacidadeBateria) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
        this.capacidadeBateria = capacidadeBateria;
        this.ligado = false;
        this.volume = 50;
    }

    @Override
    public void tocarMusica(String musica) {
        if (ligado) {
            System.out.println("Tocando a música: " + musica);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para tocar música.");
        }
    }

    @Override
    public void pausarMusica() {
        if (ligado) {
            System.out.println("Música pausada.");
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para pausar música.");
        }
    }

    @Override
    public void pararMusica() {
        if (ligado) {
            System.out.println("Música parada.");
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para parar música.");
        }
    }

    @Override
    public void fazerChamada(String numero) {
        if (ligado) {
            System.out.println("Fazendo chamada para: " + numero);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para fazer uma chamada.");
        }
    }

    @Override
    public void atenderChamada() {
        if (ligado) {
            System.out.println("Chamada atendida.");
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para atender a chamada.");
        }
    }

    @Override
    public void finalizarChamada() {
        if (ligado) {
            System.out.println("Chamada finalizada.");
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para finalizar a chamada.");
        }
    }

    @Override
    public void navegar(String url) {
        if (ligado) {
            System.out.println("Navegando para: " + url);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para navegar na internet.");
        }
    }

    @Override
    public void adicionarAba(String url) {
        if (ligado) {
            System.out.println("Adicionando nova aba com URL: " + url);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para adicionar uma nova aba.");
        }
    }

    @Override
    public void atualizarPagina() {
        if (ligado) {
            System.out.println("Atualizando a página.");
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para atualizar a página.");
        }
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("iPhone ligado.");
        } else {
            System.out.println("O iPhone já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("iPhone desligado.");
        } else {
            System.out.println("O iPhone já está desligado.");
        }
    }

    public void carregarBateria(int porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            capacidadeBateria = porcentagem;
            System.out.println("Bateria carregada para " + capacidadeBateria + "%.");
        } else {
            System.out.println("Porcentagem inválida. A porcentagem deve estar entre 0 e 100.");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume += 10;
            if (volume > 100) {
                volume = 100;
            }
            System.out.println("Volume aumentado para " + volume + "%.");
        } else {
            System.out.println("O volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume -= 10;
            if (volume < 0) {
                volume = 0;
            }
            System.out.println("Volume diminuído para " + volume + "%.");
        } else {
            System.out.println("O volume já está no mínimo.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume ajustado para " + volume + "%.");
        } else {
            System.out.println("Volume inválido. Deve estar entre 0 e 100.");
        }
    }
}
