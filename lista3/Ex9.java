import java.util.Scanner;

public class Ex9
{
  public static void main(String[] args)
  {
    Scanner teclado = new Scanner (System.in);
    int numDigi;
    boolean ehPrimo = true;

    numDigi = teclado.nextInt();

    while (numDigi < 1)
    {
      numDigi = teclado.nextInt();
    }

    for(int numAtual = numDigi; numAtual > 1; numAtual--)
    {
      ehPrimo = true;
      for(int cont = numAtual - 1; cont > 1 && ehPrimo == true; cont--)
      {
        if (numAtual % cont == 0)
          ehPrimo = false;
      }
      if(ehPrimo)
      System.out.println(numAtual + " é PRIMO!");
    }
  }
}
