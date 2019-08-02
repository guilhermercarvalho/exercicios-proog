import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args)
	{
    Scanner teclado = new Scanner (System.in);
		int ncoluna, mlinha, soma = 0;
    String retang = "";

		ncoluna = teclado.nextInt();
    mlinha = teclado.nextInt();

    for(int cont = 0; cont <= ncoluna; cont++)
    {
      for(int cont2 = 0; cont2 <= mlinha; cont2++)
      {
        retang = retang + "*";
      }
      retang = retang + "\n";
    }
    System.out.print(retang);
	}
}
