package aula_EAD_Complexidade;

public class ManipulaVetor {
	public static int somaElementos(int[] vet) {
		int soma = 0;
		for (int i = 0; i < vet.length; i++)
			soma += vet[i];
		return soma;
	}

	public static int[] somaVetores(int[] vetA, int[] vetB) {
		int[] soma = new int[vetA.length];
		for (int i = 0; i < soma.length; i++) {
			soma[i] = vetA[i] + vetB[i];
		}
		return soma;
	}

	public static int[] multiplicaConstante(int[] vet, int constante) {
		int[] res = new int[vet.length];
		for (int i = 0; i < res.length; i++)
			res[i] = constante * vet[i];
		return res;
	}

	public static boolean temPar(int[] vet) {
		boolean temPar = false;
		for (int i = 0; i < vet.length; i++)
			if (vet[i] % 2 == 0)
				temPar = true;
		return temPar;
	}
	
	public static boolean temParOtimizado(int[] vet) {
		for (int i = 0; i < vet.length; i++)
			if (vet[i] % 2 == 0)
				return true;
		return false;
	}
	
	public static boolean estaOrdenado(int[] vet) {
		for(int i = 0; i < vet.length-1; i++)
			if(vet[i] > vet[i+1])
				return false;
		return true;
	} 
	
	public static void main(String[] args) {
		int[] vet = {3,1,45,61,246},
			  vet2 = new int[5],
			  vet3 = {1,2,3,4,5,7,6},
			  vet4 = {11,22,33,44,55,67,78,82};
		
		System.out.println(somaElementos(vet));
		
		for(int v : somaVetores(vet, vet2))
			System.out.printf("[%d] ",v);
		
		System.out.println("\n");
		System.out.println(temPar(vet));
		System.out.print(temParOtimizado(vet));
		
		System.out.println("\n");
		System.out.println(estaOrdenado(vet3));
		System.out.println(estaOrdenado(vet4));
	}
}
