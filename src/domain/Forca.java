package domain;

import java.util.Scanner;

public class Forca {
	public Scanner input = new Scanner(System.in);
	
	public Player[] players;
	private String word;
	
	
	public Forca (String word) {
		this.word = word;
	}
	
	public void setPlayers (Player[] players) {
		this.players = players;
	}

	public String getWord() {
		return word;
	}
}
