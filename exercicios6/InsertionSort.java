package exercicios6;

public class InsertionSort {
	public static void insertionSort(int[] a) {
		int cont = 0;
		for(int i = 1; i < a.length; i++) {
			int j = i;
			while(j > 0 && a[j-1] > a[j]) {
				cont++;
				BubbleSort.ordenaAntecesor(a, j);
				j = j-1;
			}
		}
		
		for (int n : a)
			System.out.printf("[%d] ", n);
		System.out.println("\n"+ "Trocas realizadas: " + cont + ".");
	}
}
