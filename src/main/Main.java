// Projeto (Main)
// Classe responsável por iniciar o jogo da forca
package main;

import java.util.Scanner;
import domain.Forca; // A própria forca

public class Main {
	public static void main(String[] args) {
		// Mensagens de imersão
		System.out.println("-----===== Olá, bem vindo ao jogo da forca!!! =====-----\n\n");

		Scanner input = new Scanner(System.in);
		char opc;
		
		do {
			Forca forca = new Forca(); // Forca
			
			forca.chutarLetra();

			do
			{
				System.out.print("Você deseja continuar? [s/n]: ");
				opc = input.next().charAt(0);
			} while(opc != 's' && opc != 'n');
			
		}while(opc != 'n');
		
		System.out.println("Obrigado por usar nosso programa!");
		
		input.close();
	}
}
