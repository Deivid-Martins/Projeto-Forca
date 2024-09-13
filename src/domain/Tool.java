// Gerencia ferramentas diversas 
package domain;

public class Tool 
{
	int n;
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
}
