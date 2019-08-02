import java.util.Scanner;
public class LeitorTemperaturaTeste
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);

		System.out.println("Informe quantas leituras serão realizadas: ");
		int n = teclado.nextInt();
		
		LeitorTemperatura[] leitura = new LeitorTemperatura[n];

	for(int i = 0; i < leitura.length; i++)
		{
			String cidade = teclado.nextLine();
			teclado.nextLine();
			leitura[i] = new LeitorTemperatura(cidade, teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
			
			leitura[i].lerTemperatura(0);
			leitura[i].lerTemperatura(1);
			leitura[i].lerTemperatura(2);
		}

		for(int j = 0; j < leitura.length; j++)
		{
			leitura[j].imprimeTemperatura();
			leitura[j].mediaTemperatura();
		}
	}
}