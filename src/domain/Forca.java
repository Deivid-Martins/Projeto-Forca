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
	
	// Função para definir quem deve começar
	public void inicialPlayer () {
		
	}
}
