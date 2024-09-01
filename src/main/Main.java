// Projeto (Main)
// Classe responsável por iniciar o jogo da forca
package main;

import domain.Forca; // A própria forca

public class Main {
	public static void main(String[] args) {
		// Mensagens de imersão
		System.out.println("-----===== Olá, bem vindo ao jogo da forca!!! =====-----\n\n");
		System.out.println("Jogue com seu \"amigo\" querido, não garantimos sua integridade fisica!\n");

		Forca forca = new Forca(); // Forca
		
		//Definir cada nome de cada jogador
		System.out.println("Palavra escolhida: " + forca.word);
		System.out.println("Nome: " + forca.player.name);
		
		forca.kickLetter(forca.player);
	}
}
