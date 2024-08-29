// Classe que gerencia o jogo da forca em si
package domain;

import java.util.Scanner;

public class Forca {
	private Scanner input = new Scanner(System.in);
	public String word; // Palavra escolhida
	public Player[] players; // Array de jogadores indefinido
	
	
	public Forca () {
		int numPlayers; // Quantidade de jogadores
		
		System.out.print("Defina a quantidade de jogadores: "); // Prompt
		numPlayers = input.nextInt();
		this.players = new Player[numPlayers]; // Define a quantidade de jogadores
		
		for(int i = 0; i < numPlayers; i++) {
			players[i] = new Player(); // Cria um novo jogador para cada posição do array
		}
	}
	
	public void defPlayers (int quantPlayers) {
		System.out.println("\n----===| Defina o nome dos jogadores |===----");
		String auxName;
		int i;
		for(i = 0; i < quantPlayers; i ++) {
			System.out.println("\nJogador " + (i+1) + ": ");
			auxName = input.nextLine();
			//players[i] = new Player(auxName);
		}
		System.out.println("===| Nomes definidos! |===");
	}

	public String getWord() {
		return word;
	}
}
