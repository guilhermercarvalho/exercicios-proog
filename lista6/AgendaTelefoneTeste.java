import java.util.Scanner;

public class AgendaTelefoneTeste{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		AgendaTelefone[] pessoas = new AgendaTelefone[10];

		System.out.println("Quantas pessoas deseja adicionar na agenda? Capacidade max para " + pessoas.length + " pessoas.");
		int tamanho = teclado.nextInt();
		while(tamanho > pessoas.length){
			System.out.printf("Digite um tamanho válido!\nEspaço disponível %d: ", pessoas.length);
			tamanho = teclado.nextInt();
		}

		String nome, telefone;
		int ddd;

		// Adicionar Pessoas.
		for(int i = 0; i < tamanho; i++){
			System.out.println("Digite o nome:");
			// teclado.nextLine();
			nome = teclado.next();
			System.out.println("Digite o DDD:");
			ddd = teclado.nextInt();
			System.out.println("Digite o telefone:");
			telefone = teclado.next();
			// teclado.nextLine();

			pessoas[i] = new AgendaTelefone(nome, ddd, telefone);
			System.out.printf("%s adicionado com sucesso!", pessoas[i].getNome());
		}
		
		// Imprime Informações
		for(int i = 0; i < pessoas.length; i++){
			if(pessoas[i] != null)
				pessoas[i].imprimeInformacaoPessoa();
		}

		
	}
}