import java.util.Scanner;

public class ViagemTeste
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, cpf, telefone, endereco, placaCarro, origem, destino;
		double precoCorrida;
		int anoValidadeHabilitacao;
		Passageiro passageiro;
		Motorista motorista;
		Viagem viagem;

		System.out.println("Digite as Informações do Passageiro:");
		System.out.print("Nome: "); nome = teclado.nextLine();
		System.out.print("CPF: "); cpf = teclado.next(); teclado.nextLine();
		System.out.print("Telefone: "); telefone = teclado.nextLine();
		System.out.print("Endereço: "); endereco = teclado.nextLine();

		passageiro = new Passageiro(nome, cpf, telefone, endereco);

		System.out.println("Digite as Informações do Motorista:");
		System.out.print("Nome: "); nome = teclado.nextLine();
		System.out.print("CPF: "); cpf = teclado.next(); teclado.nextLine();
		System.out.print("Plado do Carro: "); placaCarro = teclado.next(); //teclado.nextLine();
		System.out.print("Ano da Validade da Habilitação: "); anoValidadeHabilitacao = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Endereço: "); endereco = teclado.nextLine();

		motorista = new Motorista(nome, cpf, placaCarro, anoValidadeHabilitacao, endereco);

		System.out.println("Digite as Informações da Viagem:");
		System.out.print("Origem: "); origem = teclado.nextLine();
		System.out.print("Destino: "); destino = teclado.nextLine();
		System.out.print("Valor Viagem. Em R$: "); precoCorrida = teclado.nextDouble();

		viagem = new Viagem(passageiro, motorista);
		viagem.setOrigemCorrida(origem);
		viagem.setDestinoCorrida(destino);
		viagem.setPrecoCorrida(precoCorrida); 

		viagem.imprimeInformacoesCorrida();


	}
}