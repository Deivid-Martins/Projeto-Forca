package domain;

public class Highscore 
{
	Player jogadores[];
	
	
	public Highscore()
	{
		this.jogadores = new Player[0]; // Não há jogadores no inicio
	}
	
	
	public void exibirScore()
	{
		for(int i = 0; i < jogadores.length; i++)
		{
			System.out.printf("\t%s \t--- \t%d\n", jogadores[i].name, jogadores[i].pontos);
		}
	}
	
	
	public void addJogador(Player jogadorNovo, int tam)
	{
		Player newJogadores[] = new Player[tam+1];
		
		for(int i = 0; i < tam; i++)
		{
			newJogadores[i] = this.jogadores[i];
		}
		
		newJogadores[tam] = jogadorNovo;
		this.jogadores = newJogadores;
	}
}
