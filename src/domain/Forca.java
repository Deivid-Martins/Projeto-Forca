// Classe que gerencia o jogo da forca em si
package domain;

import java.util.Random;
import java.util.Scanner;

public class Forca {
	private Random random = new Random();
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
	
	public void setOrdem () {
		boolean aux = false;
		for(int i = 0; i < players.length; i ++) {
			
			while(aux == false) {
				for(int j = 0; j < players.length; j ++) {
				
					
					players[i].ordem = random.nextInt(players.length) + 1;
					if (i != j) {
						if (players[i].ordem == players[j].ordem) {
							aux = true;
						}
					}
				}
			}
		}
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
