import java.util.Scanner;

public class Ex3_1
{
	public static void main(String[] args)
	{
    Scanner teclado = new Scanner (System.in);
		int ncoluna, mlinha;
    String retang = "";

		ncoluna = teclado.nextInt();
    mlinha = teclado.nextInt();

    int cont = 1;
    int cont2 = 1;
    while (cont <= ncoluna)
    {
      while (cont2 <= mlinha)
      {
        retang = retang + "*";
        cont2++;
      }
      retang = retang + "\n";
      cont2 = 1;
      cont++;
    }
    System.out.print(retang);
	}
}
