package domain;

public class Player {
	public String name;
	public int tries = 3;
	
	public void getName (int quantPlayers) {
			System.out.println("Jogador: " + this.name);
	}
}
