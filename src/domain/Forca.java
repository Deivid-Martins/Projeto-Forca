package domain;

import java.util.Scanner;

public class Forca {
	public Scanner input = new Scanner(System.in);
	
	public Player[] players;
	private String word;
	
	
	public Forca (String word) {
		this.word = word;
	}
	
	public void defPlayers (int quantPlayers) {
		System.out.println("\n----===| Defina o nome dos jogadores |===----");
		String auxName;
		this.players = new Player[quantPlayers];
		for(int i = 0; i < quantPlayers; i ++) {
			System.out.println("\nJogador " + (i+1) + ": ");
			auxName = input.nextLine();
			players[i] = new Player(auxName);
		}
		System.out.println("===| Nomes definidos! |===");
	}

	public String getWord() {
		return word;
	}
}
