// Classe que gerencia as pontuações máximas de cada jogador

package domain;

public class Highscore 
{
	Player jogadores[]; // Array contendo todos os jogadores
	int tamMaiorNome; // Armazena o tamanho do maior nome (Só servirá para o print)
	
	
	/**
	 * Construtor do placar. Ele só faz inicializar o array de jogadores
	 */
	public Highscore()
	{
		this.jogadores = new Player[0]; // Não há jogadores no início
		tamMaiorNome = 0; // O maior nome não existe ainda
	}
	
	
	/**
	 * Analiza se dois jogadores têm o mesmo nome, tendo, suas pontuações são somadas
	 * @param newPlayer: O jogador que será comparado para saber se temos um com o mesmo nome do dele
	 * @return Verdadeiro ou falso dependendo se a substituição foi feita
	 */
	private boolean substituirIgual(Player newPlayer)
	{
		for(int i = 0; i < this.jogadores.length; i++)
		{ // Percorre todo o array de jogadores
			if(this.jogadores[i].name.equalsIgnoreCase(newPlayer.name))
			{ // Caso tenham o mesmo nome
				this.jogadores[i].pontos += newPlayer.pontos;
				return true; // Substituição feita
			}
		}
		return false; // Substituição não efetuada
	}
	
	
	/**
	 * Adiciona um novo jogador ao vetor, criando um novo vetor que substituirá o atributo
	 * @param newPlayer: Novo jogador que será adicionado
	 * 
	 * ["Mikaelle"]
	 *     
	 * ["Mikaelle"]
	 * 
	 * newPlayer = "Mikaelle"
	 * tam = 0
	 * maiorNome = 8 
	 */
	public void addPlayer(Player newPlayer)
	{
		if(!substituirIgual(newPlayer))
		{ // Caso a substituição não tenha ocorrido (Caso não tenha um jogador com o mesmo nome do parâmetro)
			
			int tam = this.jogadores.length; // Tamanho atual do array
			Player players[] = new Player[tam+1]; // Array novo com 1 espaço a mais
			
			// Copiando os dados para o novo vetor...
			for(int i = 0; i < tam; i++)
			{ 
				players[i] = this.jogadores[i]; // Copia dado
			}
			
			if(newPlayer.name.length() > this.tamMaiorNome)
			{
				tamMaiorNome = newPlayer.name.length();
			}
			
			players[tam] = newPlayer; // Adiciona novo jogador
			this.jogadores = players; // Substitui o atributo pelo novo vetor
		}
	}
	
	
	/**
	 * Ordena o vetor de jogadores de trás para frente.
	 * Não há necessidade de dois laços, já que os valores são inseridos um a um.
	 * 
	 * ["Deivid - 500", "Kayke - 300", "Patricio - 100"]
	 *         0               1               2
	 * 
	 * aux = "Deivid - 500"
	 * i = 1
	 */
	public void ordenar()
	{
		Player array[] = this.jogadores; // Vetor que copia o atributo momentaneamente
		Player aux; // Variável auxiliar de troca
		
		for(int i = array.length - 1; i > 0; i--)
		{ // Percorre o array de trás para frente
			if(array[i-1].pontos < array[i].pontos)
			{ // Analisa se o próximo tem menos pontos
				
				aux = array[i]; // Armazena o valor da posição atual 
				array[i] = array[i-1]; // A posição atual recebe o valor da próxima posição
				array[i-1] = aux; // A próxima posição recebe o valor que estava na atual
			} // Percorre os elementos de um por um até chegar em alguma posição na qual o próximo elemento é maior que o atual
		}
		this.jogadores = array; // O atributo é substituído
	}
	
	
	/**
	 * Imprime um placar simples com as posições
	 */
	public void imprimirPlacar()
	{
		ordenar();
		System.out.println("");
		for(int i = 0; i < this.jogadores.length; i++)
		{
			// Saída do nome do jogador adaptado ao nome de maior tamanho presente dentro do array
			// O "output" recebe uma string formatada pelo método ".format" com os argumentos indicados
			// Nesse caso, há a necessidade de uma inserção de um número entre a "%" e o "s".
			String output = String.format("%" + -(this.tamMaiorNome) + "s", this.jogadores[i].name);
			System.out.printf("[ %d ] - %s --- %d\n", i+1, output, this.jogadores[i].pontos);
		}
	}
}