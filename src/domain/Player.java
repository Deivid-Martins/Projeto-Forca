// Classe que gerencia o jogador da forca
package domain;

import java.util.Scanner;

public class Player {
	private Scanner input = new Scanner(System.in);
	public String name; // Nome do jogador
	public int attempts = 6; // Tentativas
	
	//Construtor da classe
	public Player () {
		System.out.print("Defina o nome do jogador: "); // Prompt
		this.name = input.nextLine();
	}
}
