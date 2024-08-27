package main;

import java.util.Scanner;
import domain.Dicionario;
import domain.Forca;
import domain.Player;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//variaveis para definir respectivamente, quantidade de jogares e categoria da forca
		int quantPlayers;
		int chooseCategory;
		
		
		//Escolha da categoria
		System.out.println("-----===== Olá, bem vindo ao jogo da forca!!! =====-----\n\nPara iniciar, primeiro escreva o numero da categoria que deseja\njogar/duelar com seu \"amigo\" querido, não garantimos sua integridade fisica!\n");
		System.out.println("[1] - Objetos\n[2] - Alimentos\n[3] - Paises\n[4] - Animais\n[5] - Marcas\n");
		chooseCategory = input.nextInt();
		
		//Criação do dicionario já com a categoria correta
		Dicionario dicionario = new Dicionario(chooseCategory);
		
		//Criação do array Jogadores com tamanho definido pelo usuário
		System.out.println("Defina a quantia dos jogadores: ");
		quantPlayers = input.nextInt();
		Player[] jogadores = new Player[quantPlayers];
		
		//Definir cada nome de cada jogador
		System.out.println("\n----===| Defina o nome dos jogadores |===----");
		String auxName;
		int i;
		for(i = 0; i < quantPlayers; i ++) {
			System.out.println("\nJogador " + (i+1) + ": ");
			auxName = input.nextLine();
			jogadores[i].name = auxName;
		}
		System.out.println("===| Nomes definidos! |===");
		
		Forca forca = new Forca(dicionario.randomWord());
		System.out.println("Palavra escolhida: " + forca.getWord());
		System.out.println("Nome: " + forca.players[0].name);
		System.out.println("Tentativas: " + forca.players[0].tries);
		
		input.close();
	}
}
