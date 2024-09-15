// Projeto (Main)
// Classe responsável por iniciar o jogo da forca
package main;

import domain.Forca; // A própria forca

public class Main {
	public static void main(String[] args) {
		Forca forca = new Forca();
		forca.jogar();
	}
}
