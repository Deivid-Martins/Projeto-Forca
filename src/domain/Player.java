// Classe que gerencia o jogador da forca
package domain;

import java.util.Scanner;

public class Player 
{
	private Scanner input;
	
	public String name; // Nome do jogador
	public int attempts; // Tentativas
	public int pontos; // Pontuação do jogador
	
	
	/**
	 * Constrói a classe jogador com todos os atributos necessários
	 */
	public Player () 
	{
		this.input = new Scanner(System.in);
		this.attempts = 6; // Define a quantidade de chances máximas do jogador
		this.pontos = 0; // Pontos iniciais do jogador
		
		System.out.print("\nDefina o nome do jogador: "); // Prompt
		this.name = input.nextLine();
	}
}
