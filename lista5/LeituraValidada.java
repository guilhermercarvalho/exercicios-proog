import java.util.Scanner;
public class LeituraValidada{
	private Scanner teclado;

	public LeituraValidada(){
		teclado = new Scanner(System.in);
	}

	public int leIntIntervalo(String msg, int minimo, int maximo){
		int valor; 

		System.out.println(msg);
		valor = teclado.nextInt();
		while(valor < minimo || valor > maximo){
			System.out.printf("Valor inválido! Deve estar dentro do intervalo [%d, %d]! \n", minimo, maximo);
			System.out.println(msg);
			valor = teclado.nextInt();
		}
		return valor;
	}

	public double leDoubleIntervalo(String msg, double minimo, double maximo){
		double valor; 

		System.out.println(msg);
		valor = teclado.nextDouble();
		while(valor < minimo || valor > maximo){
			System.out.printf("Valor inválido! Deve estar dentro do intervalo [%f, %f]! \n", minimo, maximo);
			System.out.println(msg);
			valor = teclado.nextDouble();
		}
		return valor;
	}
}