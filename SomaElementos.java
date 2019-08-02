package aula_EAD_Complexidade;

public class SomaElementos {
	//Melhor caso: Repetição Iterativa
	public static int somaElementos(int[] vetor) {
		int soma = 0;
		for(int i = 0; i < vetor.length; i++)
			soma += vetor[i];
		return soma;
	}
	
	//Pior caso: Repetição Recursiva
	public static int somaElementos(int[] vet, int i) {
		if (i == vet.length-1)
		      return vet[i];
		   else {
		      return vet[i] + somaElementos(vet, i+1);
		   }
	}
	
	public static void main(String[] args) {
		int[] vet = {3,1,45,6,24,43};
		
		System.out.println(somaElementos(vet));
		
		System.out.println(somaElementos(vet, 0));
	}
}
