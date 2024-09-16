// Gerencia ferramentas diversas, que não necessariamente servem só para a forca
package domain;

import java.util.Scanner;
import java.util.Random; // Útil para randomizar uma palavra

public class Tool 
{
	private Scanner input;
	private Random random; // Classe para randomizar a escolha da palavra
	
	public char[] letrasUsadas;
	int n;
	
	
	/**
	 * Constrói a classe Tool com os objetos e atributos que serão necessários
	 */
	public Tool()
	{
		this.input = new Scanner(System.in);
		this.random = new Random();
		this.letrasUsadas = new char[26]; // Quantidade de letras do alfabeto
	}
	
	
	/**
	 * Limpa o vetor de letras que já foram utilizadas pelo jogador
	 */
	public void clearLetrasUsadas () {
		for(int i = 0; i < this.letrasUsadas.length; i ++) {
			this.letrasUsadas[i] = ' '; // Reseta as letras usadas
		}
	}
	
	
	/**
	 * Imprime um array de caracteres
	 * @param array: Array que será impresso
	 */
	public void imprimirCharArray(char[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println(""); // Quebra de linha
	}
	
	
	/**
	 * Resumo: Verifica se a letra foi usada anteriormente, se não foi, adiciona a mesma no vetor
	 * @param letra: letra chutada pelo usuário
	 * */
	public boolean letraFoiUsada (char letra) {
		for(int i = 0; i < letrasUsadas.length; i ++) {
			if(letrasUsadas[i] == letra) { // Caso o caractere seja igual a alguma posição do array
				System.out.println("Letra ja foi usada!");
				return true; // A letra foi sim usada
			}
		}
		letrasUsadasAdd(letra); // Adiciona ao vetor de letras usadas
		return false; // A letra não foi usada
	}
	
	
	/**
	 * Resumo: Função que adiciona letra em um vetor, na primeira posição onde existir apenas ' '
	 * neste caso, será ultilizado após a função que verifica se aquela letra ja existe, e ainda antes disso
	 * deve ser verificado se esta letra é realmente uma letra do alfabeto
	 * @param letra: letra que o usuario deseja adicionar ao vetor, no caso de não existir
	 * 
	 * ['a', 'b', ' ', ' '...]
	 *   0    1    2    3
	 *    	
	 * letra = b
	 * index = 1
	 * */
	private void letrasUsadasAdd(char letra) {
		int index = 0; // Variável que salva qual posição será alterada
		do
		{ // Verifica se aquela posição tem um caractere vazio
			if(this.letrasUsadas[index] == ' ')
			{
				this.letrasUsadas[index] = letra; // Aquela posição recebe a letra
			}
			index++; // Soma uma posição
		}
		while(this.letrasUsadas[index - 1] != letra); // Enquanto não tiver tido uma substituição
	}
	
	
	/**
	 * Verifica se um caractere faz parte do alfabeto
	 * @param caractere: Caractere que será analisado
	 * @return Verdadeiro ou falso dependendo se faz parte ou não ddo alfabeto
	 */
	public boolean isCharInAlphabet (char caractere) 
	{
		// Todas as letras do alfabeto
		char[] letrasAlfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		for(int i = 0; i < letrasAlfabeto.length; i ++)
		{
			if(caractere == letrasAlfabeto[i]) 
			{ // Se qualquer letra der igual, retorna true, pois so precisa ser igual 1 vez
				return true;
			}
		}
		return false; // se nenhuma letra der true, significa que não existe aquele char em possibilidades, então retorna false
	}
	
	
	/**
	 * Substitui uma letra em um array com base numa String
	 * @param palavra: String que mostra as posições que serão substituidas
	 * @param array: Array que terá seus caracteres modificados
	 * @param letra: Letra que substituirá alguma outra
	 * @return Um array de caracteres com as letras substituidas
	 */
	public char[] substituirLetra(String palavra, char[] array, char letra)
	{
		for(int i = 0; i < palavra.length(); i++)
		{
			if(palavra.toUpperCase().charAt(i) == letra)
			{ // Se alguma letra da string for igual a letra passada como parâmetro
				array[i] = letra; // O array na posição correta vai receber a letra
			}
		}
		return array;
	}
	
	
	/**
	 * Função criada para aumentar as possibilidades do "contais()" (Método de String)
	 * @param letra: Caractere que será analisado se está dentro da string
	 * @param palavra: String que pode ou não conter a letra
	 * @return Verdadeiro caso contenha, do contrário, falso
	 */
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
	
	
	/**
	 * Imprime um menu e suas opções
	 * @param menu: Um array de strings que conterá as opções presentes no menu
	 */
	public void imprimirMenu(String[] menu) 
	{
		for(int i = 0; i < menu.length; i++) 
		{
			System.out.printf("[ %d ] - %s\n", i+1, menu[i]); // Exibe uma opção do array
		}
	}
	
	
	/**
	 * Recebe a entrada inteira do usuário com um tratamento de erro, limitando a opção que será digitada
	 * @param limiteBaixo: O menor número possível a ser digitado
	 * @param limiteAlto: O maior número possível que poderá ser digitado
	 * @return Um número entre os valores desejados
	 */
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
	 * @param words: O array contendo inúmeras strings
	 * @return Uma única String dentro das várias opções disponíveis do array
	 */
	public String randomString (String[] words) 
	{
		int index = random.nextInt(words.length); // Escolhe um número baseado no tamanho do array
		return words[index]; // E pega a palavra naquela posição
	}
}	