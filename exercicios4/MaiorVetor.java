package exercicios4;

public class MaiorVetor {
	
	public static int maiorVetor(int [] vetor, int i) {
		int maior;
		
		if(i == 1)
			return vetor[0];
		else {
			maior = maiorVetor(vetor, i-1);
			
			if(vetor[i-1] < maior)
				return maior;
			else
				return vetor[i-1];
		}
	}
	
	public static void main(String[] args) {
		int[] vet = {15},
			  vet2 = {1,9,3},
			  vet3 = {1,2, 3, 8000, 4, 5, 6, 7, 9};
		
		System.out.println(maiorVetor(vet, vet.length));
		System.out.println(maiorVetor(vet2, vet2.length));
		System.out.println(maiorVetor(vet3, vet3.length));
	}
}
