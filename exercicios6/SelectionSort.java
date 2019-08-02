package exercicios6;

public class SelectionSort {
	public static void selectionSort(int[] a) {
		int cont = 0;
		for (int i = 0; i < a.length-1; i++) {
			int menor = i;
			for (int j = menor + 1; j < a.length; j++) {
				if (a[j] < a[menor]) {
					menor = j;
				}
			}
				if (menor != i) {
					int aux = a[i];
					a[i] = a[menor];
					a[menor] = aux;
					cont+=1;
				}
		}
		
		for (int n : a)
			System.out.printf("[%d] ", n);
		System.out.println("\n"+ "Trocas realizadas: " + cont + ".");
	}
}
