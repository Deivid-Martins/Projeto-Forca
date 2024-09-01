// Classe que gerencia o jogador da forca
package domain;

import java.util.Scanner;

public class Player {
	private Scanner input = new Scanner(System.in);
	public String name; // Nome do jogador
	public int attempts; // Tentativas
	public int ordem; // Ordem pra jogar
	
	//Construtor da classe
	public Player () {
		System.out.print("\nDefina o nome do jogador: "); // Prompt
		this.name = input.nextLine();
		
		this.attempts = 6; // Define a quantidade de chances máximas do jogador
	}
}
