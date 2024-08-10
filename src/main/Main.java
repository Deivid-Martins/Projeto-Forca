package main;

import java.util.Scanner;
import domain.Dicionario;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int escolhaCategoria;
		
		System.out.println("-----===== Olá, bem vindo ao jogo da forca!!! =====-----\n\nPara iniciar, primeiro escreva o numero da categoria que deseja\njogar/duelar com seu \"amigo\" querido, não garantimos sua integridade fisica!\n");
		System.out.println("1 - Objetos\n2 - Alimentos\n3 - Paises\n4 - Animais\n5 - Marcas\n");
		
		escolhaCategoria = input.nextInt();
		
		Dicionario dicionario = new Dicionario(escolhaCategoria);
		
		System.out.println("\n-=-=-=-\n\nPalavra Escolhida: " + dicionario.getPalavra());
		
		
		
		input.close();
	}
}
