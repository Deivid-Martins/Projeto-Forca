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

	public String getWord() {
		return word;
	}
	
	
	
	public void changePlayerPos (Player p1, Player p2) {
		Player aux;
		int indexP1 = 0;
		int indexP2 = 0;
		for(int i = 0; i < players.length; i ++) {
			if(p1 == players[i]) {
				indexP1 = i;
			}
			if(p2 == players[i]) {
				indexP2 = i;
			}
		}
		
		aux = players[indexP1];
		players[indexP1] = players[indexP2];
		players[indexP2] = aux;
	}
}
