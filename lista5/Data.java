import java.util.Scanner;
public class Data
{
    private static final int[] DIASMESSES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int dia, mes, ano;

    public Data(int dia, int mes, int ano)
    {
      if(validaDia(dia, mes, ano) && validaMes(mes))
      {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
      }
      else
      {
        System.out.println("Data inválida!");
        System.exit(1);
      }
    }

    private boolean validaDia(int dia, int mes, int ano)
    {
      if (dia == 29 && mes == 2 && validaAnoBi(ano))
        return true;
      if(validaMes(mes) && (dia < 1 || dia > DIASMESSES[mes - 1]))
        return false;
      else
        return true;
    }

    private boolean validaMes(int mes)
    {
      if(mes < 1 || mes > 12)
        return false;
      else
        return true;
    }

    private boolean validaAnoBi(int ano)
    {
      if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))
        return true;
      else
        return false;
    }

    private String eraData(int ano)
    {
      String era = "";
      if(ano > 0)
        return era += " EC.";
      else if (ano < 0)
        return era += " AEC.";
      else
        return era += ".";
    }

    public void dataHoje()
    {
      String msg = "Hoje:   " + dia + "/" + mes + "/" + ano + eraData(ano);
      System.out.printf("Hoje é: \t%02d/%02d/%04d%s\n", dia, mes, ano, eraData(ano));
      //return msg;
    }

    public void dataOntem()
    {
      String msg = "Ontem:  ";
      int diaOntem = 0, mesOntem = 0, anoOntem = 0;

      if(dia == 1)
      {
        if(mes == 1)
        {
          diaOntem = DIASMESSES[11];
          mesOntem = 12;
          anoOntem = ano - 1;
        }
        else if(mes == 3 && validaAnoBi(ano))
        {
          diaOntem = DIASMESSES[1] + 1;
          mesOntem = 2;
          anoOntem = ano;
        }
        else
        {
          diaOntem = DIASMESSES[mes - 2];
          mesOntem = mes - 1;
          anoOntem = ano;
        }
      }
      else
      {
        diaOntem = dia - 1;
        mesOntem = mes;
        anoOntem = ano;
      }
      msg += diaOntem + "/" + mesOntem + "/" + anoOntem + eraData(anoOntem);
      System.out.printf("Ontem foi: \t%02d/%02d/%04d%s\n", diaOntem, mesOntem, anoOntem, eraData(anoOntem));
      //return msg;
    }

    public void dataAmanha()
    {
      String msg = "Amanhã: ";
      int diaAmanha = 0, mesAmanha = 0, anoAmanha = 0;
      boolean validaAnoBi = true;
      if(dia == 28 && mes == 2 && validaAnoBi(ano))
        validaAnoBi = false;
      if(dia == DIASMESSES[mes - 1] && validaAnoBi)
      {
        if(mes == 12)
        {
          diaAmanha = 1;
          mesAmanha = 1;
          anoAmanha = ano + 1;
        }
        else
        {
          diaAmanha = 1;
          mesAmanha = mes + 1;
          anoAmanha = ano;
        }
      }
      else if(validaAnoBi(ano) && mes == 2)
      {
        if(dia == DIASMESSES[1] + 1)
        {
          diaAmanha = 1;
          mesAmanha = mes + 1;
          anoAmanha = ano;
        }
        else
        {
          diaAmanha = DIASMESSES[1] + 1;
          mesAmanha = mes;
          anoAmanha = ano;
        }
      }
      else
      {
        diaAmanha = dia + 1;
        mesAmanha = mes;
        anoAmanha = ano;
      }
      msg += diaAmanha + "/" + mesAmanha + "/" + anoAmanha + eraData(ano);
      System.out.printf("Amanhã será: \t%02d/%02d/%04d%s\n", diaAmanha, mesAmanha, anoAmanha, eraData(ano));
      //return msg;
    }

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt(), mes = teclado.nextInt(), ano = teclado.nextInt();
        Data d1 = new Data(dia, mes, ano);

        d1.dataOntem();
        d1.dataHoje();
        d1.dataAmanha();
        //System.out.println(d1.dataHoje() + "\n" + d1.dataAmanha());
    }
}
