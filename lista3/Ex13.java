import java.util.Scanner;
public class Ex13
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner (System.in);
		int n, fat;
		float soma = 1f;
		boolean zero = false;

		n = teclado.nextInt();

		while(n < 0)
		{
			System.out.print("Valor inválido!\nPor favor, digite novamente: ");
			n = teclado.nextInt();
		}

		for(int i = n; i > 0; i--)	
		{
			fat = 1;
			for(int j = i; j >= 1; j--)
				fat *= j;

			soma += 1f / fat;
		}

		System.out.print("E = 1 + ");
		for(int cont = 1; cont <= n; cont++)
		{
			if(cont < n)
				System.out.printf("1/%d! + ", cont);
			else if(cont == n)
				System.out.printf("1/%d!", cont);
		}	
		System.out.printf(" = %f\n", soma);
	
	}
}