package domain;

public class Forca {
	public char[] letters	= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private String word;
	public int tries;
	
	public Forca (String word) {
		this.word = word;
		tries = 7;
	}
	
	public void test () {
		art();
		firstWordArt();
	}
	
	private void art () {
		switch (tries) {
			case 0:
				System.out.println("O <-<\n\n---=== Fim de jogo! ===---");
				break;
			case 1:
				System.out.println(" O\n/|\\\n /\\");
				break;
			case 2:
				System.out.println(" O\n/|\\\n /");
				break;
			case 3:
				System.out.println(" O\n/|\\");
				break;
			case 4:
				System.out.println(" O\n/|");
				break;
			case 5:
				System.out.println(" O\n/");
				break;
			case 6:
				System.out.println(" O");
				break;
			case 7:
				System.out.println(" ");
				break;
			default:
				System.out.println("|||Ocorreu um erro inesperado|||");
		}
	}
	
	public void firstWordArt () {
		String word = getWord();
		System.out.print("\\\\  ");
		for(int i = 0; i < word.length(); i++) {
			System.out.print("_ ");
		}
		System.out.print("  //");
	}
	
	public void writeLetter(char letter, String word) {
		System.out.print("\\\\  ");
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				System.out.print(letter + " ");
			} else {
				System.out.print("_ ");
			}
		}
		System.out.print("  //");
	}
	
	public void Try (char letter) {
		String word = getWord();
		boolean haveChoise = false;
		boolean haveLetter = false;
		for (int i = 0; i < letters.length; i ++) {
			if (letters[i] == letter) {
				haveChoise = true;
			}
		}
		if(haveChoise) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
					haveLetter = true;
				}
			}
			if (haveLetter) {
				writeLetter(letter, word);
			}
		}
	}
	
	public String getWord () {
		return this.word;
	}
}

