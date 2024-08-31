// Classe que gerencia o jogo da forca em si
package domain;

import java.util.Scanner;

public class Forca {
	private Scanner input = new Scanner(System.in);
	
	public String word; // Palavra escolhida
	public Player[] players; // Array de jogadores indefinido
	public Dicionario dict = new Dicionario(); // Dicionário de palavras
	
	
	// Construtor da forca com jogadores e palavra definidos
	public Forca () {
		// Criação dos jogadores
		int numPlayers; // Quantidade de jogadores
		
		System.out.print("Defina a quantidade de jogadores: "); // Prompt
		numPlayers = input.nextInt();
		this.players = new Player[numPlayers]; // Define a quantidade de jogadores
		
		for(int i = 0; i < numPlayers; i++) {
			players[i] = new Player(); // Cria um novo jogador para cada posição do array
		}
		
		
		// Definição da palavra
		this.word = dict.randomWord();
	}

	public String getWord() {
		return word;
	}
}
