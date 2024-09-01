// Classe que gerencia o jogo da forca em si
package domain;

import java.util.Scanner;

public class Forca {
	private Scanner input = new Scanner(System.in);
	
	public String word; // Palavra escolhida
	public char[] letters; // Letras que ele já adivinhou
	public Player[] players; // Array de jogadores indefinido
	public Dicionario dict = new Dicionario(); // Dicionário de palavras
	
	
	// Construtor da forca com jogadores e palavra definidos
	public Forca () {
		// Criação dos jogadores
		int numPlayers; // Quantidade de jogadores
		
		System.out.print("Defina a quantidade de jogadores: "); // Prompt
		numPlayers = input.nextInt();
		this.players = new Player[numPlayers]; // Define a quantidade de jogadores
		
		for(int i = 0; i < numPlayers; i++) {
			players[i] = new Player(); // Cria um novo jogador para cada posição do array
		}
		
		
		// Definição da palavra
		this.word = dict.randomWord();
		this.letters = new char[this.word.length()]; // Define o tamanho do array com a quantidade certa de letras
		
		for(int i = 0; i < letters.length; i++) {
			this.letters[i] = '_'; // Define "_" para todas as letras da palavras  
		}
	}
	
		
	//Chuta uma letra
	public void kickLetter(Player jogador) 
	{
		String palavraMomento = new String(this.letters); // Como está a palavra no momento
		char[] palavraCertaArray = this.word.toCharArray(); // Palavra certa em array
		char letra; // Letra chutada
		int verificador = 0; // Verificador auxiliar
		
		do 
		{
			System.out.println(""); // Apenas uma quebra de linha 
			
			System.out.println(jogador.name);
			writeForca(jogador.attempts); // Imprime a forca
			for(int i = 0; i < this.letters.length; i++) 
			{ // Imprime as letrinhas
				System.out.printf(" %s", this.letters[i]);
			}
			
			palavraMomento = new String(this.letters); // A palavra é o próprio array de string
			
			if(!(palavraMomento.equalsIgnoreCase(this.word)) && jogador.attempts > 0) {
				System.out.print("\nChute uma letra: "); // prompt
				letra = input.next().charAt(0); // Pega só a primeira letra digitada
				
				verificador = 0; // Reinicia a verificação
				
				for(int i = 0; i < this.letters.length; i++) 
				{ // Se o caractere for o certo, ele fica lá
					if(letra == palavraCertaArray[i]) 
					{
						letters[i] = letra;
						verificador++;
					}
				}
				if(verificador == 0) 
				{
					jogador.attempts--; // Se for errado, diminui uma chance
				}
			}
		} while(!(palavraMomento.equalsIgnoreCase(this.word)) && jogador.attempts > 0);
		
		if(jogador.attempts <= 0) 
		{ // Caso ele perca
			System.out.println(jogador.name);
			writeForca(jogador.attempts); // Exibe a forca
			System.out.println("Que pena... Você perdeu...");
		} else 
		{ // Caso ele vença
			System.out.println("\nParabéns!! Você adivinhou a palavra!");
		}
	}

	
	public void writeForca (int tents) {
		switch(tents) {
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
				break;
		}
	}
	
	
	public String getWord() {
		return word;
	}
}
