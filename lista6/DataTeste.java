import java.util.Scanner;
public class DataTeste
{
  public static void main(String[] args)
  {
      Scanner teclado = new Scanner(System.in);
      Data d1 = new Data(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());

      System.out.println(d1.dataHoje() + d1.dataOntem() + d1.dataAmanha());
  }
}
