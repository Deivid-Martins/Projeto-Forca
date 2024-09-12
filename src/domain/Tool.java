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
}
