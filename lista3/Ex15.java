import java.util.Scanner;
public class Ex15
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num;
		boolean ehPrimo;

		System.out.print("Digite uma sequência de valores e verifique se eles são pares ou não.\n(Digite um valor menor ou igual a zero para interromper o programa.)\n");
		num = teclado.nextInt();

		while(num > 0)
		{
			ehPrimo = true;
			for(int i = 2; i < num && ehPrimo; i++)
				if(num % i == 0)
					ehPrimo = false;

			if(ehPrimo)
				System.out.printf("%d é primo!\n", num);
			else
				System.out.printf("%d não é primo!\n", num);

			num = teclado.nextInt();
		}
	}
}