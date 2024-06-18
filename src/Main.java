public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone("iPhone 14", "123-456-789", 100);

        meuIphone.ligar();
        meuIphone.tocarMusica("Imagine - John Lennon");
        meuIphone.aumentarVolume();
        meuIphone.diminuirVolume();
        meuIphone.fazerChamada("987-654-321");
        meuIphone.navegar("www.youtube.com");
        meuIphone.adicionarAba("www.google.com");
        meuIphone.atualizarPagina();
        meuIphone.desligar();
    }
}