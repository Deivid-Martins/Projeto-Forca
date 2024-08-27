package main;

import java.util.Scanner;
import domain.Dicionario;
import domain.Forca;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantPlayers;
		int chooseCategory;
		
		System.out.println("-----===== Olá, bem vindo ao jogo da forca!!! =====-----\n\nPara iniciar, primeiro escreva o numero da categoria que deseja\njogar/duelar com seu \"amigo\" querido, não garantimos sua integridade fisica!\n");
		System.out.println("[1] - Objetos\n[2] - Alimentos\n[3] - Paises\n[4] - Animais\n[5] - Marcas\n");
		
		chooseCategory = input.nextInt();
		
		Dicionario dicionario = new Dicionario(chooseCategory);
		
		System.out.println("\n-=-=-=-\n\nPalavra Escolhida: " + dicionario.getWord());
		
		System.out.println("Defina a quantia dos jogadores: ");
		quantPlayers = input.nextInt();
		
		Forca forca = new Forca(dicionario.getWord(), quantPlayers);
		System.out.println("Nome: " + forca.players[0].name);
		System.out.println("Tentativas: " + forca.players[0].tries);
		
		input.close();
	}
}
