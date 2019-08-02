// Lista 2 - Exercício 17.

import java.util.Scanner;

public class Exercicio17
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner (System.in);
		float lado1, lado2, lado3;

		System.out.println("Por favor, digite o tamanho dos lados do triângulo:");

		System.out.print("Lado 1: ");
		lado1 = teclado.nextFloat();

		System.out.print("Lado 2: ");
		lado2 = teclado.nextFloat();

		System.out.print("Lado 3: ");
		lado3 = teclado.nextFloat();

		if ((lado1 == 0) || (lado2 ==0) || (lado3 == 0))
			System.out.println("Por favor, digite um tamanho diferente de 0.");

		else
		{
			if ((lado1 == lado2) && (lado2 == lado3))
				System.out.println("Este é um Triângulo Equilátero!");

			else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))
				System.out.println("Este é um Triângulo Isósceles!");

			else if ((lado1 != lado2) || (lado1 != lado3) || (lado2 != lado3))
				System.out.println("Este é um Triângulo Escaleno!");
		}
	}
}
