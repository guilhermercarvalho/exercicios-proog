package exercicios6;

public class OrdenacaoMetodos {
	public static int s = 0,
					  contTroca = 0;
	
	// Impressão
	public static void imprimeVet(int[] a) {
		System.out.print("[");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i < a.length-1)
				System.out.print(" ");
		}
		System.out.println("]");
	}
	
	private static void imprimeVet(int[] a, int troca) {
		imprimeVet(a);
		System.out.println("Número de trocas: " + troca + "\n");
	}
	
	// Teste Mesa
	public static void testeMesa(int[] a) {
		int[] b = new int[a.length],
			  c = new int[a.length],
			  d = new int[a.length],
			  e = new int[a.length];
		
		for(int i = 0; i < a.length; i++)
			b[i] = a[i];
		
		for(int i = 0; i < a.length; i++)
			c[i] = a[i];
		
		for(int i = 0; i < a.length; i++)
			d[i] = a[i];
		
		for(int i = 0; i < a.length; i++)
			e[i] = a[i];
		
		bubble(a);
		selection(b);
		insertion(c);
		merge(d);
		contTroca = 0;
	}
	
	// Método Troca
	public static void swap(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}
	
	// Bubble
	public static void bubble(int[] a) {
		s++;
		System.out.println("Bubble Sort " + "S" + s);
		
		boolean ordenado = false;
		int troca = 0;
		
		for(int i = 0; !ordenado && i < a.length; i++) {
			for(int j = 0; j < a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					imprimeVet(a);
					swap(a, j, j+1);
					troca++;
				}
				else
					ordenado = true;
			}
		}
		imprimeVet(a, troca);
	}
	
	// Selection
	public static void selection(int[] a) {
		System.out.println("Selection Sort "+"S"+s);
		int troca = 0;
		
		for(int i = 0; i < a.length-1; i++) {
			int menor = i;
			for(int j = menor + 1; j < a.length; j++) {
				if(a[j] < a[menor])
					menor = j;
			}
			if(menor != i) {
				imprimeVet(a);
				swap(a, i, menor);
				troca++;
			}
		}
		imprimeVet(a, troca);
	}
	
	// Insertion
	public static void insertion(int[] a) {
		System.out.println("Insertion Sort " + "S"+s);
		int troca = 0;
		
		for(int i = 1; i < a.length; i++) {
			int j = i;
			while(j > 0 && a[j-1] > a[j]) {
				imprimeVet(a);
				swap(a, j, j-1);
				troca++;
				j = j-1;				
			}
			
		}
		imprimeVet(a, troca);
	}
	
	// Merge
	public static void mergesort(int[] a, int ini, int fim) {
		if(ini < fim) {
			int meio = (ini+fim)/2;
			mergesort(a, ini, meio);
			mergesort(a, meio+1, fim);
			intercala(a, ini, meio, fim);
			imprimeVet(a);
			contTroca++;
		}
		
	}
	
	public static void merge(int[] a) {
		System.out.println("Merge Sort "+"S"+s);
		imprimeVet(a);
		mergesort(a, 0, a.length-1);
		imprimeVet(a, contTroca);
	}
	
	public static void intercala(int[] a, int ini, int meio, int fim) {
		int[] b = new int[a.length];
		
		for(int i = ini; i <= fim; i++)
			b[i] = a[i];
		
		int i = ini,
				j = meio + 1,
				k = ini;
		
		while(i <= meio && j <= fim ) {
			if(b[i] <= b[j])
				a[k++] = b[i++];
			else
				a[k++] = b[j++];
		}
		
		while(i <= meio) {
			a[k++] = b[i++];
		}
	}
	
	// Quick
	public static void quicksort(int[] a, int ini, int fim) {
		int i = particao(a, ini, fim);
		if(ini < i-1)
			quicksort(a, ini, i-1);
		if(i < fim)
			quicksort(a, i, fim);
	}
	
	public static int particao(int[] a, int ini, int fim) {
		int i = ini;
		int j = fim;
		
		int pivo = a[(ini+fim) / 2];
		
		while(i <= j) {
			while(a[i] < pivo)
				i++;
			while(a[j] > pivo)
				j--;
			if(i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}
		return i;
	}
	
	public static void quick(int[] a) {
		quicksort(a, 0, a.length-1);
		
		for(int p : a)
			System.out.println(p);
	}
}
