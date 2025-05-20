public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private String paginaAtual;

    // ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando a música: " + musicaAtual);
    }
    public void pausar() {
        System.out.println("Música pausada");
    }
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    public void atender() {
        System.out.println("Chamando atendido");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    // NavegadorInternet
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada: " + paginaAtual);
    }
}
