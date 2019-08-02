import java.util.Scanner;
public class Notas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		float[] nota = new float [3];
		float media = 0;

		for(int i = 0; i < nota.length; i++){
			System.out.print("Digite a " + (i + 1) + " nota: ");
			nota[i] = teclado.nextFloat();
			while(nota[i] < 0 || nota[i] > 10){
				System.out.println("Nota é inválida!");
				nota[i] = teclado.nextFloat();
			}
			media += nota[i];
		}

		media /= nota.length;
		System.out.printf("A média aritimética do aluno é igual a: %.2f\n", media);
	}
}