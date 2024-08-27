package domain;

import java.util.Scanner;

public class Forca {
	public Scanner input = new Scanner(System.in);
	
	public Player[] players;
	private String word;
	
	
	public Forca (String word, int quantPlayers) {
		this.word = word;
		this.players = new Player[quantPlayers];
		
		setPlayers(quantPlayers);
	}
	
	public void setPlayers (int quantPlayers) {
		System.out.println("\n----===| Defina o nome dos jogadores |===----");
		int i;
		for(i = 0; i < quantPlayers; i ++) {
			System.out.println("\nJogador " + (i+1) + ": ");
			players[i].name = input.nextLine();
		}
		System.out.println("Nomes definidos!");
	}
}
