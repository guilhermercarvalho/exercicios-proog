import java.util.Scanner;

public class Ex6
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);

		String palavra;
		palavra = teclado.next();
		
		for (int cont = palavra.length()-1; cont >= 0; cont--)
		{
			System.out.print(palavra.charAt(cont));
		}
		System.out.println("");
	}
}
