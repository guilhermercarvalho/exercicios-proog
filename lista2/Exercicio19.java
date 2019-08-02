import java.util.Scanner;

public class Exercicio19
{
  public static void main (String [] args)
  {
    Scanner teclado = new Scanner (System.in);
    byte dia, mes;
    int ano;
    boolean anoBissexto;

    System.out.println("Por favor, digite uma data");
    System.out.print("Dia: ");
    dia = teclado.nextByte();
    System.out.print("Mês: ");
    mes = teclado.nextByte();
    System.out.print("Ano: ");
    ano = teclado.nextInt();

    anoBissexto = (dia <= 29 && mes == 2 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));

    if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && ano > 0 && (dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) || (dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || (mes == 2 && anoBissexto || dia <= 28)))
    {
      System.out.printf("\n%d/%d/%d\n", dia, mes, ano);
      System.out.println("Data Válida!");
    }
    else
    {
      System.out.printf("\n%d/%d/%d\n", dia, mes, ano);
      System.out.println("Data Inválida!");
    }
  }
}
