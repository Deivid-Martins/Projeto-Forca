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
	
	// Função para definir quem vai por ultimo, realizada após a função, zero ou um, AINDA NÂO IMPLEMENTADA
	private void pedraPapelTesoura (Player p1, Player p2) { // N se preocupe com esse erro, fará sentido
		int e1; // Escolha do player 1
		int e2; // Escolha do player 2
		boolean aux = false;
		System.out.println("--==| Jogo de pedra, papel e tesoura |==--\nAqui vocês definirão a ordem de jogadas, vulgo quem começa\n[1] - Pedra\n[2] - Papel\n[3] - Tesoura");
		while(aux == false) {
			System.out.println(p1.name + ", Escolha: ");
			e1 = input.nextInt(); 
			System.out.println(p2.name + ", Escolha: ");
			e2 = input.nextInt();
		}
	}
}
