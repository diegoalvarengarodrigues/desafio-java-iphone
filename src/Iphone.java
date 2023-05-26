
import apresentacao.novoIphone;

public class Iphone {
    public static void main(String[] args) {
        //Iniciando a apresentacao.
        novoIphone iphone = new novoIphone();
        iphone.inciarApresentacao();
        //Demonstrando o Reprodutor de Musicas.
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        //Demonstrando o Aparelho Telefonico.
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        //Demonstrando o Navegador Web.
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        //Finalizando a Demonstracao.
        iphone.finalizarApresentacao();

    }
}