public class RetanguloAsteriscos{
	
	private int numLinhas, numColunas;

	public RetanguloAsteriscos(int numLinhas, int numColunas){
		this.numLinhas = numLinhas;
		this.numColunas = numColunas;
	}

	//Método para criar uma linha de um retêngulo.
	public String criaLinha(){
		// linha já começa com 1 asterisco, por isso (this.linhas - 1).
		String linha = "*";
		for(int i = 0; i < (this.numLinhas - 1); i++){
			// espaço para separar asterisco e para tornar o código mais apresentável.
			linha += " *";
		}
		return linha;
	}

	// Método cria o retângulo.
	public String criaRetangulo(){
		String coluna = criaLinha() + "\n";
		// Como 1 linha será criada no começo e outro no final, (this.numColunas - 2)
		for(int i = 0; i < (this.numColunas - 2); i++){
			// Imprime um asterisco;
			coluna += "*";
			// Imprime os espaços. Como 1 arisco preenche o início da linha e outro o final (this.numLinhas - 2)
			for(int j = 0; j < (this.numLinhas - 2); j++){
				// Como a linha é impressa com um asterisco acompanhado de um espeço, dois espaços são neccessários.
				coluna += "  ";
			}
			// Um espaço para compensar um dos dois asteriscos que sempre são impressos no final da linha.
			coluna += " *\n";
		}
		coluna += criaLinha() + "\n";
		return coluna;
	}

	// Método retângulo matriz
	/*public String criaRetanguloMatriz(){
		String[][] matriz = new String[numLinhas][numColunas];
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				matriz[0][j] += "*";
			}
		}
	}*/
}