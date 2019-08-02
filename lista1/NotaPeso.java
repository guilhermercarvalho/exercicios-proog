import java.util.Scanner;
public class NotaPeso{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float[] prova = new float [4];
		float media = 0f;
		int peso, pesoTotal = 0;

		System.out.println("Digite a nota e, em seguida, o peso da mesma.");

		for(int i = 0; i < prova.length; i++){
			System.out.print("Nota Prova " + (i + 1) + ": ");
			prova[i] = teclado.nextFloat();
			System.out.print("Peso Prova " + (i+1) + ": ");
			peso = teclado.nextInt();
			prova[i] *= peso;
			pesoTotal += peso;
			media += prova[i];
		}
		
		media /= pesoTotal;
		System.out.printf("Média Ponderada Final: %.2f\n", media);

	}
}