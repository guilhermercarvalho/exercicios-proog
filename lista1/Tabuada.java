import java.util.Scanner;
public class Tabuada{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int tamh, tabuada;

		System.out.print("Digite a tabuada que você gostaria de calcular: ");
		tabuada = teclado.nextInt();

		System.out.print("Até que número você gostaria calcular? (Deve ser maior que zero.)");
		tamh = teclado.nextInt();
		while(tamh <= 0){
			System.out.print("Tamanho inválido! Digite novamente: ");
			tamh = teclado.nextInt();
		}

		for(int i = 1; i <= tamh; i++){
			System.out.printf("%dx%d \t= %d\n", i, tabuada, (i * tabuada));
		}
	}
}