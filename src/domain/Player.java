package domain;

public class Player {
	public String name;
	public int tries = 3;
	
	public Player (String name) {
		this.name = name;
	}
	
	public void getName (int quantPlayers) {
			System.out.println("Jogador: " + this.name);
	}
}
