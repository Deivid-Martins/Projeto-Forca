// Gerencia ferramentas diversas 
package domain;

import java.util.Scanner;

import java.util.Random; // Útil para randomizar uma palavra

public class Tool 
{
	private Scanner input;
	private Random random; // Classe para randomizar a escolha da palavra
	int n;
	char[] letrasCorretas = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	
	public Tool()
	{
		this.input = new Scanner(System.in);
		this.random = new Random();
	}
	
	// Imprime um array de caracteres
	public void imprimirCharArray(char[] array)
	{
		int i;
		for(i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	
	/* Essa função simplesmente verifica se é possivel ou não chutar essa letra, 
	   mas apenas verifica se aquela letra realmente é uma letra */
	public boolean chuteIsPossible (char letra) {
		for(int i = 0; i < this.letrasCorretas.length; i ++) {
			if(letra == letrasCorretas[i]) { // se qualquer letra der igual, retorna true, pois so precisa ser igual 1 vez
				return true;
			}
		}
		return false; // se nenhuma letra der true, significa que não existe aquele char em possibilidades, então retorna false;
	}
	
	
	// Substitui uma letra num char baseando-se numa string
	public char[] substituirLetra(String palavra, char[] arrayMomento, char letra)
	{
		for(int i = 0; i < palavra.length(); i++)
		{
			if(palavra.toUpperCase().charAt(i) == letra)
			{
				arrayMomento[i] = letra;
			}
		}
		return arrayMomento;
	}
	
	
	// Compara se dois arrays de char são iguais
	public boolean charArraysIguais(char[] array1, char[] array2)
	{
		if(array1.length != array2.length) 
		{
			return false;
		}
		
		for(int i = 0; i < array1.length; i++)
		{
			if(array1[i] != array2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	
	public boolean containsChar(char letra, String palavra)
	{
		for(int i = 0; i < palavra.length(); i++)
		{
			// Se alguma letra da palavra for igual a passada como parâmetro, retorna true
			if(palavra.charAt(i) == letra)
			{
				return true;
			}
		}
		return false; // Saindo do laço, significa que não há a letra dentro da palavra
	}
	
	
	// Imprime o menu
	public void imprimirMenu(String[] menu) {
		int i; // Iterador
		for(i = 0; i < menu.length; i++) {
			System.out.printf("[ %d ] - %s\n", i+1, menu[i]); // Exibe uma opção do array
		}
	}
	
	
	public int intInputLimitado(int limiteBaixo, int limiteAlto)
	{
		int categoria; // Opção escolhida pelo usuário
		
		do
		{
			System.out.print("Informe um número: "); // Prompt
			categoria = input.nextInt(); // Guarda a categoria
			
			// Caso seja um número inválido
			if(categoria < limiteBaixo || categoria > limiteAlto) 
			{ 
				System.out.printf("Digite um número válido! Só pode entre %d e %d!\n", limiteBaixo, limiteAlto);
			}
		} while(categoria < limiteBaixo || categoria > limiteAlto);
		
		return categoria;
	}
	
	
	/**
	 * Randomiza uma palavra dentro de um array de palavras
	 * @param words
	 * @return Uma única String dentro das várias opções disponíveis do array
	 */
	public String randomString (String[] words) 
	{
		int index = random.nextInt(words.length); // Escolhe um número baseado no tamanho do array
		return words[index]; // E pega a palavra naquela posição
	}
}
