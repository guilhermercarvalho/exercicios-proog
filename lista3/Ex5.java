import java.util.Scanner;

public class Ex5
{
	public static void main(String[] args)
	{
		int cont, num, soma = 0;

		Scanner teclado = new Scanner (System.in);
		num = teclado.nextInt();

		for (cont = 1; cont <= num; cont ++)
		{
			
			soma += cont * cont;
		}
		System.out.println(soma);
	}
}
