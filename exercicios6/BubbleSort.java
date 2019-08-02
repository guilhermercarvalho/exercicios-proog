package exercicios6;

public class BubbleSort {
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
						ordenaSucessor(vet, j);
					else
						ordenado++;
				else if (vet[j] < vet[j + 1])
					ordenaSucessor(vet, j);
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
	
	public static void ordenaSucessor(int[] vet, int j) {
		int aux = vet[j];
		vet[j] = vet[j+1];
		vet[j+1] = aux;
	}
	
	public static void ordenaAntecesor(int[] vet, int j) {
		int aux = vet[j];
		vet[j] = vet[j - 1];
		vet[j - 1] = aux;
	}
	
	public static void bubbleSortOtimizado(int[] a) {
		int cont = 0;
		for(int i = 0; i < a.length; i++) 
			for(int j = 0; j < a.length-i-1; j++) {				
				cont++;
				if(a[j] > a[j+1]) {
					ordenaSucessor(a, j);
				}
			}
		for (int n : a)
			System.out.printf("[%d] ", n);
		System.out.println("\n"+ "Repetições: " + cont + ".");		
	}
	
	public static void bubbleSortEx(int[] a) {
		int cont = 0, rpt = 0;
		boolean troca = true;
		for(int i = 0; troca && i < a.length; i++) {
			if(i == 1 && cont == 0)
				troca = false;
			else
				for(int j = 0; j < a.length-1; j++) {
					rpt++;
					if(a[j] > a[j+1]) {
						ordenaSucessor(a, j);
						cont++;
					}
				}
		}
		
		for (int n : a)
			System.out.printf("[%d] ", n);
		System.out.println("\n"+ "Trocas realizadas: " + cont + ". Repetições: " + rpt + ".");
	}
}
