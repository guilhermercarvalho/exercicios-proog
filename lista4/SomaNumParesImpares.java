import java.util.Scanner;

public class SomaNumParesImpares{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		System.out.print("Digite o tamanho da lista de números inteiros positivos: ");
		int tamanhoLista = teclado.nextInt();

		int[] vetorNum = new int [tamanhoLista];

		for(int i = 0; i < vetorNum.length; i++){
			System.out.print("Digite o número " + (i + 1) + " : ");
			vetorNum[i] = teclado.nextInt();
		}

		int[] somaNum = new int [2];
		// somaNum[0] = soma números pares;
		// somaNum[1] = soma números ímpares;

		for(int i = 0; i < vetorNum.length; i++){
			if(vetorNum[i] % 2 == 0){
				somaNum[0] += vetorNum[i];
			}
			else if(vetorNum[i] % 2 != 0){
				somaNum[1] += vetorNum[i];
			}
		}

		System.out.println("\nSoma dos números pares: " + somaNum[0]);
		System.out.println("Soma dos números ímpares: " + somaNum[1]);
	}
}