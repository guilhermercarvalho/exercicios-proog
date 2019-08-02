import java.util.Scanner;
public class Exmulti
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    //System.out.print("Digite qual(is) tabuada(s) você gostaria de ver: ");
    //int n = input.nextInt();

    int multi = 0;
    for(int cont = 1; cont <= 10; cont++)
    {
      if(cont > 1)
        System.out.println("");
      System.out.print("TABUADA DO " + cont + "\n");
      for (int cont2 = 0; cont2 <= 10; cont2++)
      {
        multi = cont * cont2;
        System.out.print(cont + " x " + cont2 +" = " + multi + "\n");
      }
    }
  }
}
