import Telefone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        //TODO: Aparelho Telefonico
        iphone.ligar("236598745");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //TODO: Reprodutor Musical
        iphone.selecionarMusica("Coldplay - Viva La Vida");
        iphone.tocar();
        iphone.pausar();

        //TODO: Navegador Internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina("http://localhost");
        iphone.atualizar();
    }
}

