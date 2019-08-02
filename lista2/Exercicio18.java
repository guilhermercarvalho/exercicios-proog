// Lista 2 - Exercício 18.

import java.util.Scanner;

public class Exercicio18
{
  public static void main (String [] args)
  {
    Scanner teclado = new Scanner (System.in);
    int n1, n2, n3, x, y, z, temp;

    System.out.println("Por favor, digite três números quaisquer: ");
    n1 = teclado.nextInt();
    n2 = teclado.nextInt();
    n3 = teclado.nextInt();

    x = n1;
    y = n2;
    z = n3;

    if (x > y)
    {
      temp = x;
      x = y;
      y = temp;
    }
    if (x > z)
    {
      temp = x;
      x = z;
      z = temp;
    }
    if (y > z)
    {
      temp = y;
      y = z;
      z = temp;
    }
    System.out.printf("Organizados em ordem decrescente: \n%d\n%d\n%d\n", z, y, x);
  }
}
