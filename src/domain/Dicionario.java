package domain;

import java.util.Random;
import java.util.Scanner;

public class Dicionario {
	public Scanner input = new Scanner(System.in);
	
	public int tipo;
	public int size;
	public String[] palavras;
	private String palavra;
	Random random = new Random();
	
	public Dicionario (int tipo) {
		this.tipo = tipo;
		define_words();
	}
	
	private void define_words () {
		/*
		Switch para definir as palavras da categoria escolhida para o dicionario
		
	 	1 - Objetos | 2 - Alimentos | 3 = Paises | 4 - Animais | 5 - Marcas
		*/
		if (this.tipo >= 1 && this.tipo <= 5) {
			switch (this.tipo) {
				//  Objetos
				case 1:
					palavras = new String[20];
					palavras[0] = "Lapiseira";
					palavras[1] = "Navalhete";
					palavras[2] = "Caixote";
					palavras[3] = "Tornozeleira";
					palavras[4] = "Adaptador";
					palavras[5] = "Colchonete";
					palavras[6] = "Isopor";
					palavras[7] = "Skate";
					palavras[8] = "Bicicleta";
					palavras[9] = "Patinete";
					palavras[10] = "Bengala";
					palavras[11] = "Roteador";
					palavras[12] = "Remo";
					palavras[13] = "Gaiola";
					palavras[14] = "Frigideira";
					palavras[15] = "Notebook";
					palavras[16] = "Ventilador";
					palavras[17] = "Secador";
					palavras[18] = "Prancheta";
					palavras[19] = "Curriculo";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				// Alimentos
				case 2:
					palavras = new String[20];
					palavras[0] = "Sorvete";
					palavras[1] = "Guacamole";
					palavras[2] = "Panettone";
					palavras[3] = "Brigadeiro";
					palavras[4] = "Batatinha";
					palavras[5] = "Cuscuz";
					palavras[6] = "Amendoin";
					palavras[7] = "Castanha";
					palavras[8] = "Goiabada";
					palavras[9] = "Canjica";
					palavras[10] = "Pamonha";
					palavras[11] = "Empada";
					palavras[12] = "Umbuzada";
					palavras[13] = "Mousse";
					palavras[14] = "Suflair";
					palavras[15] = "Tapioca";
					palavras[16] = "Macaxeira";
					palavras[17] = "Costela";
					palavras[18] = "Buxada";
					palavras[19] = "Hamburguer";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				// Paises
				case 3:
					palavras = new String[20];
					palavras[0] = "Singapura";
					palavras[1] = "Dinamarca";
					palavras[2] = "Brasil";
					palavras[3] = "Belgica";
					palavras[4] = "Canada";
					palavras[5] = "China";
					palavras[6] = "Italia";
					palavras[7] = "Suecia";
					palavras[8] = "Mexico";
					palavras[9] = "Paraguai";
					palavras[10] = "Alemanha";
					palavras[11] = "Chile";
					palavras[12] = "Argentina";
					palavras[13] = "Egito";
					palavras[14] = "Madagascar";
					palavras[15] = "Portugal";
					palavras[16] = "Espanha";
					palavras[17] = "Marrocos";
					palavras[18] = "Catar";
					palavras[19] = "Monaco";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				// Animais
				case 4:
					palavras = new String[20];
					palavras[0] = "Javali";
					palavras[1] = "Lontra";
					palavras[2] = "Toupeira";
					palavras[3] = "Tucano";
					palavras[4] = "Tilapia";
					palavras[5] = "Jiboia";
					palavras[6] = "Guaxinim";
					palavras[7] = "Esquilo";
					palavras[8] = "Leopardo";
					palavras[9] = "Tigre";
					palavras[10] = "Jaguatirica";
					palavras[11] = "Orca";
					palavras[12] = "Zebra";
					palavras[13] = "Crocodilo";
					palavras[14] = "Rinoceronte";
					palavras[15] = "Gabiru";
					palavras[16] = "Corvo";
					palavras[17] = "Calopsita";
					palavras[18] = "Cacatua";
					palavras[19] = "Suricato";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				// Marcas
				case 5:
					palavras = new String[20];
					palavras[0] = "Razer";
					palavras[1] = "Nike";
					palavras[2] = "Adidas";
					palavras[3] = "Starbucks";
					palavras[4] = "Gucci";
					palavras[5] = "Lacoste";
					palavras[6] = "Subway";
					palavras[7] = "Bobs";
					palavras[8] = "Samsung";
					palavras[9] = "Apple";
					palavras[10] = "Xiaomi";
					palavras[11] = "Nokia";
					palavras[12] = "Windows";
					palavras[13] = "Microsoft";
					palavras[14] = "Xbox";
					palavras[15] = "Playstation";
					palavras[16] = "Nintendo";
					palavras[17] = "Google";
					palavras[18] = "Sega";
					palavras[19] = "Logitech";
					System.out.println("\nCategoria Escolhida com Sucesso!");
					break;
				default:
					System.out.println("|||Ocorreu um erro inesperado|||");
			}
		} else {
			System.out.println("\nTente um número válido!");
			this.tipo = input.nextInt();
			define_words();
		}
		
		one_word();
	}
	
	private void one_word () {
		int index = random.nextInt(palavras.length);
		this.palavra = palavras[index];
	}
	
	
	public String getPalavra () {
		return this.palavra;
	}
}
