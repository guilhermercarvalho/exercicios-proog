import java.util.Scanner;

public class Ex2_1
{
  public static void main (String [] args)
  {
    Scanner teclado = new Scanner (System.in);
    int numDigitado, numInicial, fat = 1;

    numDigitado = teclado.nextInt();
    numInicial = numDigitado;

    int cont = 1;
    while (cont <= numDigitado)
    {
      fat*=numInicial;
      numInicial--;
      cont++;
    }
    System.out.println(fat);
  }
}
