// Classe que gerencia o jogador da forca
package domain;

import java.util.Scanner;

public class Player {
	private Scanner input = new Scanner(System.in);
	public String name; // Nome do jogador
	public int attempts = 6; // Tentativas
	public int ordem; // Ordem pra jogar
	
	//Construtor da classe
	public Player () {
		System.out.print("Defina o nome do jogador: "); // Prompt
		this.name = input.nextLine();
	}
	
	public void writeForca () {
		switch(attempts) {
			case 6:
				System.out.println("  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========");
				break;
			case 5:
				System.out.println("  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========");
				break;
			case 4:
				System.out.println("  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========");
				break;
			case 3:
				System.out.println("  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========");
				break;
			case 2:
				System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========");
				break;
			case 1:
				System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========");
				break;
			case 0:
				System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========");
				break;
			default:
				System.out.println("||| ERRO INESPERADO |||");
		}
	}
}
