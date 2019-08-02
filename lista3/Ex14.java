import java.util.Scanner;
public class Ex14
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner (System.in);
		int idade, menorIdade = 0, peso80kg = 0, mediaIdade = 0, mediaIdadeTotal = 0; 
		float altura, peso, mediaAltura = 0f, porcentagemPeso80kg = 0f;

		for(int cont = 1; cont < 6; cont++)
		{
			for(int i = 1; i < 3; i++)
			{
				if(cont > 1 || i > 1)
					System.out.println("====================================");
				System.out.printf("Idade JOGADOR %d, TIME %d: ", i, cont);
				idade = teclado.nextInt();
				System.out.printf("Peso JOGADOR %d, TIME %d: ", i, cont);
				peso = teclado. nextFloat();
				System.out.printf("Altura (em metros) JOGADOR %d, TIME %d: ", i, cont);
				altura = teclado.nextFloat();

				mediaIdade += idade;
				mediaAltura += altura;
				mediaIdadeTotal += idade;

				if(idade < 18)
					menorIdade++;
				if(peso > 80)
					peso80kg++;
			}
				mediaIdade /= 2;
				System.out.print("============================");
				System.out.printf("\nMédia idade TIME %d: %d anos.\n", cont, mediaIdade);
				mediaIdade = 0;
		}	
		mediaIdadeTotal /= 10;
		mediaAltura /= 10;
		porcentagemPeso80kg = (float) (peso80kg * 100) / 10;

		System.out.printf("\nJogadores com idade inferior a 18 anos: %d jogador(es).\n", menorIdade);
		System.out.printf("Media idade todos jogadores: %d\n", mediaIdadeTotal);
		System.out.printf("Média altura (em metros) de todos os jogadores: %.2f m.\n",mediaAltura);
		System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f%%\n", porcentagemPeso80kg);

	}
}