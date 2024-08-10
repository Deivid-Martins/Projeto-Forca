package domain;

import java.util.Random;
import java.util.Scanner;

public class Dicionario {
	public Scanner input = new Scanner(System.in);
	
	public int category;
	public int size;
	public String[] words;
	private String word;
	Random random = new Random();
	
	public Dicionario (int category) {
		this.category = category;
		define_words();
	}
	
	private void define_words () {
		/*
		Switch para definir as palavras da categoria escolhida para o dicionario
		
	 	1 - Objetos | 2 - Alimentos | 3 = Paises | 4 - Animais | 5 - Marcas
		*/
		if (this.category >= 1 && this.category <= 5) {
			switch (this.category) {
				//  Objetos
				case 1:
					words = new String[20];
					words[0] = "lapiseira";
					words[1] = "navalhete";
					words[2] = "caixote";
					words[3] = "tornozeleira";
					words[4] = "adaptador";
					words[5] = "colchonete";
					words[6] = "isopor";
					words[7] = "skate";
					words[8] = "bicicleta";
					words[9] = "patinete";
					words[10] = "bengala";
					words[11] = "roteador";
					words[12] = "remo";
					words[13] = "gaiola";
					words[14] = "frigideira";
					words[15] = "notebook";
					words[16] = "ventilador";
					words[17] = "secador";
					words[18] = "prancheta";
					words[19] = "curriculo";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				// Alimentos
				case 2:
					words = new String[20];
					words[0] = "sorvete";
					words[1] = "guacamole";
					words[2] = "panettone";
					words[3] = "brigadeiro";
					words[4] = "batatinha";
					words[5] = "cuscuz";
					words[6] = "amendoin";
					words[7] = "castanha";
					words[8] = "goiabada";
					words[9] = "canjica";
					words[10] = "pamonha";
					words[11] = "empada";
					words[12] = "umbuzada";
					words[13] = "mousse";
					words[14] = "suflair";
					words[15] = "tapioca";
					words[16] = "macaxeira";
					words[17] = "costela";
					words[18] = "buxada";
					words[19] = "hamburguer";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				// Paises
				case 3:
					words = new String[20];
					words[0] = "singapura";
					words[1] = "dinamarca";
					words[2] = "brasil";
					words[3] = "belgica";
					words[4] = "canada";
					words[5] = "china";
					words[6] = "italia";
					words[7] = "suecia";
					words[8] = "mexico";
					words[9] = "paraguai";
					words[10] = "alemanha";
					words[11] = "chile";
					words[12] = "argentina";
					words[13] = "egito";
					words[14] = "madagascar";
					words[15] = "portugal";
					words[16] = "espanha";
					words[17] = "marrocos";
					words[18] = "catar";
					words[19] = "monaco";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				// Animais
				case 4:
					words = new String[20];
					words[0] = "javali";
					words[1] = "lontra";
					words[2] = "toupeira";
					words[3] = "tucano";
					words[4] = "tilapia";
					words[5] = "jiboia";
					words[6] = "guaxinim";
					words[7] = "esquilo";
					words[8] = "leopardo";
					words[9] = "tigre";
					words[10] = "jaguatirica";
					words[11] = "orca";
					words[12] = "zebra";
					words[13] = "crocodilo";
					words[14] = "rinoceronte";
					words[15] = "gabiru";
					words[16] = "corvo";
					words[17] = "calopsita";
					words[18] = "cacatua";
					words[19] = "suricato";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				// Marcas
				case 5:
					words = new String[20];
					words[0] = "razer";
					words[1] = "nike";
					words[2] = "adidas";
					words[3] = "starbucks";
					words[4] = "gucci";
					words[5] = "lacoste";
					words[6] = "subway";
					words[7] = "bobs";
					words[8] = "samsung";
					words[9] = "apple";
					words[10] = "xiaomi";
					words[11] = "nokia";
					words[12] = "windows";
					words[13] = "microsoft";
					words[14] = "xbox";
					words[15] = "playstation";
					words[16] = "nintendo";
					words[17] = "google";
					words[18] = "sega";
					words[19] = "logitech";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				default:
					System.out.println("|||Ocorreu um erro inesperado|||");
			}
		} else {
			System.out.println("\nTente um número válido!");
			this.category = input.nextInt();
			define_words();
		}
		
		one_word();
	}
	
	private void one_word () {
		int index = random.nextInt(words.length);
		this.word = words[index];
	}
	
	
	public String getWord () {
		return this.word;
	}
}
