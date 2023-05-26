package apresentacao;

import aplicacoes.AparelhoTelefonico;
import aplicacoes.Navegador;
import aplicacoes.ReprodutorMusical;

public class novoIphone implements AparelhoTelefonico, ReprodutorMusical, Navegador {

    public void inciarApresentacao() {
        System.out.println(" ___________________________________ ");
        System.out.println("|           IPHONE INICIADO         |");
        System.out.println("|              BEM VINDO            |");
        System.out.println("|           CARREGANDO APPS         |");
        System.out.println("|          3 APPS DISPONÍVEIS       |");
        System.out.println("|        FAREI UMA DEMONSTRACAO     |");
        System.out.println("|-----------------------------------|");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("|---ABRINDO REPRODUTOR DE MUSICAS---|");
        System.out.println("|-----------------------------------|");
        System.out.println("|Iphone: MUSICA SELECIONADA         |");
    }
    @Override
    public void tocar() {
        System.out.println("|Iphone: TOCANDO MUSICA             |");
    }
    @Override
    public void pausar() {
        System.out.println("|Iphone: PAUSANDO MUSICA            |");
        System.out.println("|-----------------------------------|");
    }
    @Override
    public void ligar() {
        System.out.println("|----------ABRINDO DISCADOR---------|");
        System.out.println("|-----------------------------------|");
        System.out.println("|Iphone: FAZENDO LIGACAO            |");
        System.out.println("|tu...tu...tu...tu...tu...          |");
        System.out.println("|Iphone: ENCERRANDO LIGACAO         |");
    }
    @Override
    public void atender() {
        System.out.println("|-----TRIM...TRIM...TRIM...TRIM-----|");
        System.out.println("|Iphone: RECEBENDO LIGACAO          |");
        System.out.println("|Iphone: ATENDENDO LIGACAO          |");
        System.out.println("|Iphone: ALO.........TCHAU          |");
        System.out.println("|Iphone: ENCERRANDO LIGACAO         |");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("|-----TRIM...TRIM...TRIM...TRIM-----|");
        System.out.println("|Iphone: RECEBENDO LIGACAO          |");
        System.out.println("|Iphone: REJEITANDO LIGACAO         |");
        System.out.println("|Iphone: INICIANDO CORREIO DE VOZ   |");
        System.out.println("|Iphone: GRAVANDO MENSAGEM DE VOZ   |");
        System.out.println("|Iphone: ENCERRANDO CORREIO DE VOZ  |");
        System.out.println("|-----------------------------------|");
    }
    @Override
    public void exibirPagina() {
        System.out.println("|-------ABRINDO NAVEGADOR WEB-------|");
        System.out.println("|-----------------------------------|");
        System.out.println("|Iphone: EXIBINDO PAGINA WEB        |");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("|Iphone: ADICIONANDO NOVA ABA WEB   |");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("|Iphone: ATUALIZANDO PAGINA WEB     |");
    }
    public void finalizarApresentacao(){
        System.out.println("|___________________________________|");
        System.out.println("|      DEMONSTRACAO FINALIZADA      |");
        System.out.println("|              OBRIGADO             |");
        System.out.println("|         IPHONE DESLIGANDO....     |");
        System.out.println("|___________________________________|");
    }
}
