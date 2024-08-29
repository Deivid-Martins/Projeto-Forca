// Projeto (Main)
// Classe responsável por iniciar o jogo da forca
package main;

import java.util.Scanner; // Para entrada de dados
import domain.Player;
import domain.Dicionario; // Dicionário da forca
import domain.Forca; // A própria forca

public class Main {
	public static void main(String[] args) {
		//2 Scanners para não dar erro no buffer, utilize o "inputNum" para números, e o "input" para String e char
		Scanner input = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		
		//variaveis para definir respectivamente, quantidade de jogares e categoria da forca
		int quantPlayers;
		int chooseCategory;
		
		
		//Escolha da categoria
		System.out.println("-----===== Olá, bem vindo ao jogo da forca!!! =====-----\n\nPara iniciar, primeiro escreva o numero da categoria que deseja\njogar/duelar com seu \"amigo\" querido, não garantimos sua integridade fisica!\n");
		System.out.println("[1] - Objetos\n[2] - Alimentos\n[3] - Paises\n[4] - Animais\n[5] - Marcas\n");
		chooseCategory = inputNum.nextInt();
		
		//Criação do dicionario já com a categoria correta
		Dicionario dicionario = new Dicionario(chooseCategory);
		
		//Criação da forca ultilizando a função que retorna uma palavra aleatoria
		Forca forca = new Forca(dicionario.randomWord());
		
		//Criação do array Jogadores com tamanho definido pelo usuário
		System.out.println("Defina a quantia dos jogadores: ");
		quantPlayers = inputNum.nextInt();
		
		//Definir cada nome de cada jogador
		forca.defPlayers(quantPlayers);
		
		System.out.println("Palavra escolhida: " + forca.getWord());
		System.out.println("Nome: " + forca.players[0].name);
		System.out.println("Tentativas: " + forca.players[0].tries);
		
		
		inputNum.close();
		input.close();
	}
}
