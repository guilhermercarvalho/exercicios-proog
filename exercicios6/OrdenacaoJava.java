package exercicios6;

public class OrdenacaoJava {
////// Bubble Sort
	public static int[] bubbleSort(int[] vet, char ordem) {
		boolean crescente;
		int ordenado = 0;

		if (ordem == 'c')
			crescente = true;
		else
			crescente = false;

		for (int i = 0; ordenado < vet.length - 1 && i < vet.length; i++) {
			ordenado = 0;
			for (int j = 0; j < vet.length - 1; j++) {
				if (crescente)
					if (vet[j] > vet[j + 1])
						ordena(vet, j);
					else
						ordenado++;
				else if (vet[j] < vet[j + 1])
					ordena(vet, j);
				else
					ordenado++;
			}
		}
		return vet;
	}
	public static int[] bubbleSort(int[] v) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < v.length - 1; i++)
				if (v[i] > v[i + 1]) {
					aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
					troca = true;
				}
		}
		return v;
	}
	private static void ordena(int[] vet, int j) {
		int aux = vet[j];
		vet[j] = vet[j - 1];
		vet[j - 1] = aux;
	}
	
////// Selection Sort
	public static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			int menor = i;
			for (int j = menor + 1; j < a.length; j++) {
				if (a[j] < a[menor])
					menor = j;
			}
				if (menor != i) {
					int aux = a[i];
					a[i] = a[menor];
					a[menor] = aux;
				}
		}
		return a;
	}

////// Insertion Sort
	public static int[] insertionSort(int[] a) {
		for(int i = 1; i < a.length; i++) {
			int j = i;
			while(j > 0 && a[j-1] > a[j]) {
				ordena(a, j);
				j = j-1;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int quantidade = 100;
		int[] vet = new int[quantidade],
			  vet2 = { 3,2,1,4,5,6,7,8,9 },
			  vet3 = {1,2,3,4,5};

		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 10000);
		}

		long tempoInicial = System.currentTimeMillis();
//		for(int n : ordenaVetorEstaOrdenado(vet))
		for (int n : insertionSort(vet2))
			System.out.printf("[%d] ", n);

		System.out.println();

//		for(int n : bubbleSort(vet))
//			System.out.printf("[%d] ", n);

		long tempoFinal = System.currentTimeMillis();

		System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");
	}
}
