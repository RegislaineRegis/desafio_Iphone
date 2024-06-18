package Telefone;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  @Override
  public void ligar(String numero) {

    System.out.println("lingando para o numero: " + numero);
  }

  @Override
  public void atender() {

    System.out.println("Atendendo ligação");
  }

  @Override
  public void iniciarCorreioVoz() {

    System.out.println("Reproduzindo correio de voz");
  }

  @Override
  public void exibirPagina(String url) {

    System.out.println("Exibindo pagina " + url);
  }

  @Override
  public void adicionarNovaAba() {

    System.out.println("Nova aba!");
  }

  @Override
  public void atualizar() {

    System.out.println("Página atualizada!");
  }

  @Override
  public void tocar() {

    System.out.println("Tocando musica");
  }

  @Override
  public void pausar() {

    System.out.println("Musica pausada");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Musica selecionada: " + musica);
  }
}
