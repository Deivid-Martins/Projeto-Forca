// Classe que gerencia o jogo da forca em si
package domain;

import java.util.Scanner;

public class Forca {
	private Scanner input; // Para entrada de dados
	private Tool tool; // Nossa "caixa de ferramentas". Guarda funções diversas
	
	public char[] letters; // Armazena a palavra conforme o jogador adivinha suas letras
	public Dicionario dict; // Dicionário de palavras
	public Player player; // Objeto Jogador
	public String word; // Palavra escolhida
	
	
	/**
	 * Construtor que inicia objetos e variáveis do jogo da forca.
	 */
	public Forca () {
		System.out.println("-----===== Olá, bem vindo ao jogo da forca!!! =====-----\n");
		
		this.input = new Scanner(System.in);
		this.dict = new Dicionario();
		this.tool = new Tool();
	}
	
	
	/**
	 * Este método define a palavra que deverá ser adivinhada pelo jogador.
	 * String word = Armazena uma palavra do dicionário no formato de string.
	 * char[] letters = É preenchido por tracinhos ('_').
	 */
	public void definirPalavra()
	{
		this.word = dict.escolherPalavra().toUpperCase(); // Armazena em caixa alta para facilitar a execução dos comandos
		this.letters = new char[this.word.length()]; // Define o tamanho de letters com base na palavra
		for(int i = 0; i < letters.length; i++)
		{
			this.letters[i] = '_'; // letters é preenchido com tracinhos
		}
	}
	
	
	/**
	 * Este método imprime a forca com base na quantidade de tentativas do jogador.
	 */
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
				// Mensagem de erro para sabermos o que tratar
				System.out.println("||| ERRO AO IMPRIMIR A FORCA |||");
				break;
		}
	}
	
	
	/**
	 * Este método imprime um cabeçalho do jogo da forca.
	 * Saída: O nome do jogador, seu boneco e as letras que já adivinhou.
	 */
	public void imprimirCabecalho()
	{
		System.out.println("\n" + this.player.name); // Imprime o nome do jogador
		writeForca(); // Imprime a forca
		tool.imprimirCharArray(this.letters); // Imprime o estado das letras
	}
	
	
	/**
	 * Este método faz o jogador realizar o chute de uma letra isoladamente.
	 * Além disso, realiza as ações necessárias com base no erro/acerto.
	 * char letraChute = Letra que o usuário chuta.
	 */
	public void chutarLetra()
	{
		char letraChute; // Letra de chute
		
		System.out.print("Digite uma letra: "); // Prompt
		letraChute = input.next().toUpperCase().charAt(0); // Pega a letra que o usuário digitar
		
		//Verifica se a letra do chute, realmente é uma letra no alfabeto, essa função não tem ligação com a palavra
		if(tool.chuteIsPossible(letraChute)) 
		{
			// Caso a letra que ele chutou esteja presente			
			if(tool.containsChar(letraChute, this.word.toUpperCase()))
			{
				// Substitui o tracinho pela letra certa
				this.letters = tool.substituirLetra(this.word, this.letters, letraChute); 
				player.pontos += 100; // Ganha 100 pontos
			} else
			{ // Caso a letra não esteja presente na palavra
				this.player.attempts--; // Diminui uma vida do jogador
			}
		} else 
		{ // Caso ele não tenha digitado uma letra do alfabeto
			System.out.println("Letra inválida, tente novamente!");
		}
	}
	
	
	/**
	 * Realiza uma ação de término do jogo dependendo das vidas do jogador e soma a pontuação.
	 * Saída: Uma mensagem boa ou ruim.
	 */
	public void fimDeJogo()
	{
		imprimirCabecalho(); // Imprime o cabeçalho da forca
		
		if(player.attempts <= 0) // Caso tenha perdido todas as vidas
		{
			System.out.println("Parabéns!! Você perdeu...");
			System.out.printf("Palavra Correta: %s\n", this.word); // Exibe a palavra correta
		}else
		{ // Caso ele tenha adivinhado a palavra
			System.out.println("\nQue pena... Você adivinhou a palavra!");
			player.pontos += 500; // Ganha 500 pontos
		}
	}
	
	
	/**
	 * Este método faz o jogador chutar várias letras até acertar a palavra ou morrer
	 * String palavraMomento: Necessária para o critério de parada ser atendido
	 */
	public void adivinharPalavra()
	{
		String palavraMomento = new String(this.letters); // Como está o usuário tentando acertar as letras
		
		do
		{
			imprimirCabecalho(); // Imprime o cabeçalho da forca
			chutarLetra(); // Chuta uma letra
			palavraMomento = new String(this.letters); // As letras acertadas viram uma string
			
		// Enquanto ele não adivinhar nem morrer
		}while(this.player.attempts > 0 && !(this.word.equalsIgnoreCase(palavraMomento)));
		
		fimDeJogo(); // Exibe uma mensagem ao finalizar o jogo
	}
	
	
	/**
	 * Este método faz o jogo continuar até o jogador digitar 'n' ao fim de uma palavra
	 * char opc: Verificador de continuidade da função
	 */
	public void jogar()
	{
		char opc; // Opção do usuário
		
		do
		{
			this.player = new Player(); // Um novo jogador começa
			definirPalavra(); // Inicia uma palavra nova
			adivinharPalavra(); // Joga com essa palavra
			
			do
			{
				System.out.print("Você deseja continuar jogando? [S/N]: "); // Prompt
				opc = this.input.next().toUpperCase().charAt(0); // Pucha o caractere de uma forma conveniente
				
			} while(opc != 'N' && opc != 'S'); // Continua enquanto ele não digitar uma letra válida
			
		}while(opc != 'N'); // Continua caso ele tenha digitado 's'
		
		System.out.println("Obrigado por usar nosso programa!"); // Obrigado :D
	}
}
