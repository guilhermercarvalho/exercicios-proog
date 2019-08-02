import java.util.Scanner;

public class InverteOrdemVetor{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vet = new int [10];

		System.out.println("Preencha o vetor de 10 posições.");
		String msgOriginal = "", msgInvetida = "";
		for(int i = 0; i < vet.length; i++){
			vet[i] = i + 1;
			msgOriginal += vet[i] + " ";
		}

		// int aux;
		// for(int i = 0, j = (vet.length - 1); i < vet.length; i++){
		// 	while(i < j){
		// 		aux = vet[i];
		// 		vet[i] = vet[j];
		// 		vet[j] = aux;
		// 		j--;
		// 		msgInvetida += vet[i] + " ";
		// 	}
		// }
		// msgInvetida += vet[vet.length - 1];

		int aux;
		for(int i = 0, j = (vet.length - 1); i < vet.length / 2; i++, j--){
				aux = vet[i];
				vet[i] = vet[j];
				vet[j] = aux;
		}
		
		for(int i = 0; i < vet.length; i++)
			msgInvetida += vet[i] + " ";

		System.out.printf("Sequência Original: %s\nSequência Invertida: %s\n", msgOriginal, msgInvetida);
	}
}