package main;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Main {

	public static void main(String[] args) {

		NavegadorInternet navegadorInternet = new NavegadorInternet();

		System.out.println("-----------------Navegador Internet-----------------");

		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
		navegadorInternet.exibirPagina();

		System.out.println("-----------------Reprodutor Musical-----------------");

		ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

		reprodutorMusical.selecionarMusica();
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();

		System.out.println("-----------------Telefone-----------------");

		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
		
		aparelhoTelefonico.ligar();
		aparelhoTelefonico.iniciarCorreioVoz();
		aparelhoTelefonico.atender();
	}
}
