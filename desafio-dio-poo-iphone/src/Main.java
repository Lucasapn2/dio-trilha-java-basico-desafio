public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        // Testar Reprodutor Musical
        meuIphone.selecionarMusica("Hey Jude");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testar Aparelho Telefônico
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testar Navegador
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
