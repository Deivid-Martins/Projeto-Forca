// Classe que gerencia o jogo da forca em si
package domain;

import java.util.Scanner;

public class Forca {
	private Scanner input = new Scanner(System.in);
	
	public String word; // Palavra escolhida
	public char[] letters; // Letras que ele já adivinhou
	public Player player; // Array de jogadores indefinido
	public Dicionario dict; // Dicionário de palavras
	public Tool tool; // Ferramentas
	
	// Construtor da forca com jogadores e palavra definidos
	public Forca () {
		this.dict = new Dicionario();
		this.player = new Player();
		this.tool = new Tool();
		
		// Definição da palavra
		this.word = dict.randomWord();
		this.letters = new char[this.word.length()]; // Define o tamanho do array com a quantidade certa de letras
		
		for(int i = 0; i < letters.length; i++) {
			this.letters[i] = '_'; // Define "_" para todas as letras da palavras  
		}
	}
	
	
	public void chutarLetra()
	{
		char[] palavraMomentoArray = this.letters; // Como está o usuário e sua tentativa no momento
		char letraChute; // Letra de chute
		String palavraMomento; // Como está a adivinhação do usuário, só que string
		
		do 
		{
			System.out.println("\n" + player.name); // Imprime o nome do jogador
			writeForca(); // Imprime a forca
			tool.imprimirCharArray(this.letters); // Imprime o estado das letras
			
			System.out.print("Digite uma letra: "); // Prompt
			letraChute = input.next().toUpperCase().charAt(0); // Pega a letra que o usuário digitar
			
			// Caso a letra que ele chutou esteja presente				
			if(tool.containsChar(letraChute, this.word.toUpperCase()))
			{
				palavraMomentoArray = tool.substituirLetra(this.word, palavraMomentoArray, letraChute); // Substitui o tracinho pela letra certa
				player.pontos += 100; // Ganha 100 pontas
			} else
			{
				this.player.attempts--; // Diminui uma vida do jogador
			}

			palavraMomento = new String(palavraMomentoArray); // As tentativas viram uma string
					
		} while(this.player.attempts > 0 && !(this.word.equalsIgnoreCase(palavraMomento))); // Caso ele nem tenha acertado nem morrido
		
		
		if(player.attempts <= 0) 
		{ // Caso ele perca
			System.out.println(player.name);
			writeForca(); // Exibe a forca
			System.out.println("Que pena... Você perdeu...");
			System.out.printf("Palavra Correta: %s\n", this.word.toUpperCase()); // Exibe a palavra correta
		} else
		{ // Caso ele vença
			System.out.println("\nParabéns!! Você adivinhou a palavra!");
			System.out.printf("Palavra Correta: %s\n", this.word.toUpperCase()); // Exibe a palavra correta
			player.pontos += 500; // Ganha 500 pontos
		}
	}
	
	
	// Escreve a forca
	public void writeForca () {
		switch(this.player.attempts) {
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
}
