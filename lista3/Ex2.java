import java.util.Scanner;

public class Ex2
{
  public static void main (String [] args)
  {
    Scanner teclado = new Scanner (System.in);
    int numDigitado, fat = 1;

    numDigitado = teclado.nextInt();

    int cont;
    for (cont = numDigitado; cont >= 1; cont--)
    {
      fat *= cont;
    }
    System.out.println(fat);
  }
}
