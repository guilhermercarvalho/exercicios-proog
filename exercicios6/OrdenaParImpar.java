package exercicios6;

public class OrdenaParImpar {
	
	public static void insertionImparPar(int[] a) {
		int j = 0;
		for(int i = 1; i < a.length; i++) {
			j = i;
			while(j > 0 && a[j-1] % 2 == 0) {
				swap(a, j, j-1);
				j = j -1;
			}
		}
//		ordena par
		insertion(a, 0,j);
//		orden impar
		insertion(a, j+1, a.length-1);
		
		imprime(a);
	}
	
	public static void insertion(int[] a, int ini, int fim) {
		for(int i = ini + 1; i <= fim; i++) {
			int j = i;
			while(j > ini && a[j-1] > a[j]) {
				swap(a, j, j-1);
				j = j -1;
			}
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}
	
	public static void imprime(int[] a) {
		System.out.print("[");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i < a.length-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int[] v = {2,1,3,6,4,7,9,8,5,11,10,16,18,13,15};
		
		insertionImparPar(v);
	}
	
}
