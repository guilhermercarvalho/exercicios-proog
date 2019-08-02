package exercicios6;

public class EstantePaulRingo {
	
	public static void mergesort(int[][] a, int ini, int fim, int pos) {
		if(ini < fim) {
			int meio = (ini+fim)/2;
			mergesort(a, ini, meio, pos);
			mergesort(a, meio+1, fim, pos);
			merge(a, ini, meio, fim, pos);
			if(pos+1 < a.length)
				mergesort(a, ini, fim, pos+1);	
			}
	}
	
	public static void merge(int[][] a, int ini, int meio, int fim, int pos) {
		int[] b = new int[a[pos].length];
		
		for(int i = ini; i <= fim; i++)
			b[i] = a[pos][i];
		
		int i = ini,
				j = meio + 1,
				k = ini;
		
		
		while(i <= meio && j <= fim ) {
			if(b[i] <= b[j])
				a[pos][k++] = b[i++];
			else
				a[pos][k++] = b[j++];
		}
		
		while(i <= meio) {
			a[pos][k++] = b[i++];
		}
	}
	
	public static void selectionsort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int menor = i;
			for(int j = menor+1; j < a.length; j++) {
				if(a[j] < a[menor])
					menor = j;
			}
			if(menor != i) {
				int aux = a[i];
				a[i] = a[menor];
				a[menor] = aux;
			}
		}
	}
	
	public static void organizaPrecoEstante(int[][] a) {		
		int[] soma = new int [a.length];
		
		mergesort(a, 0, a[0].length-1, 0);
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				soma[i] += a[i][j];
			}
		}

		selectionsort(soma);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("[");
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+", ");
			}
			System.out.print("]\n");
		}
		
	}
	
	public static void encontraColecao(int[][] a, int[] soma, int pos) {
		int[][] b = new int[a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++) {
			int temp = 0;
			for(int j = 0; j < a[i].length; j++) {
				temp = a[i][j];
				while(temp != soma[i]) {
					encontraColecao(a, soma, pos+1);
				}
			}
		}
	}
	
	public static void organizaEstante(int[][] a) {
		
	}
	
	public static void main(String[] args) {
		int[][] estantePaul = {{19,17,18,20,16}, {14,12,15,11,13}, {22,25,23,24,21}, {2,4,1,3,5}, {8,6,10,7,9}};
		
		organizaPrecoEstante(estantePaul);
	}
}
