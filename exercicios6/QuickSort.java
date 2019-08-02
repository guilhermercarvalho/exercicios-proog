package exercicios6;

public class QuickSort {
	public static void quicksort(int[] a, int inicio, int fim) {
		int i = particao(a, inicio, fim);
		if(inicio < i - 1)
			quicksort(a, inicio, i - 1);
		if(i < fim)
			quicksort(a, i, fim);
	}
	
	public static int particao(int[] a, int inicio, int fim) {
		int i = inicio,
			j = fim;
		
		int pivo = a[(inicio+fim) / 2];
		
		while (i <= j){
			while(a[i] < pivo)
				i++;
			while(a[j] > pivo)
				j--;
			if(i <= j) {
				int aux = a[i];
				a[i] = a[j];
				a[j] = aux;
				i++;
				j--;
			}		
		}
		return i;
	}
	
	public static void main(String[] args) {
		int[] v = {5,15,10,8,1};
		
		quicksort(v, 0, v.length-1);
		
		for(int p : v)
			System.out.println(p);
	}
}
