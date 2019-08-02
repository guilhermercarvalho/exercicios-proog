import java.util.Scanner;
public class Ex16
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner (System.in);
		int catOposto, catAdjacente;
		float area;

		System.out.println("Informe os valores para calcular a Área do Triângulo Retângulo.");

		System.out.print("Cateto Adjacente: ");
		catAdjacente = teclado.nextInt();
		if(catAdjacente <= 0)
			for(int i = 0; i < 2 && catAdjacente <= 0; i++)
			{
				System.out.print("Valor invlálido!\nDigite novamente: ");
				catAdjacente = teclado.nextInt();
			}

		System.out.print("Cateto Oposto: ");
		catOposto = teclado.nextInt();
		if(catOposto <= 0)
			for(int i = 0; i < 2 && catOposto <= 0; i++)
			{
				System.out.print("Valor invlálido!\nDigite novamente: ");
				catOposto = teclado.nextInt();
			}

		area = (float) (catAdjacente * catOposto) / 2;

		if(catAdjacente < 1 || catOposto < 1)
			System.out.println("Não foi possível calcular a Área do Triângulo Retângulo.");
		else
			System.out.printf("A Área do Triângulo Retângulo vale: %.2f\n", area);

	}
}