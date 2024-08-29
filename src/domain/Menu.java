package domain;

public class Menu {
	String[] menu; // As opções presentes no menu
	
	
	//Construtor do menu
	public Menu(String[] menu){
		this.menu = menu;
	}
	
	
	// Imprime o menu
	public void imprimirMenu() {
		int i; // Iterador
		for(i = 0; i < menu.length; i++) {
			System.out.printf("[ %d ] - %s\n", i+1, menu[i]); // Exibe uma opção do array
		}
	}
}