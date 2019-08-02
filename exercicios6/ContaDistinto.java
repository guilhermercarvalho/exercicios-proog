package exercicios6;

public class ContaDistinto {
	public static void ordenaDistritosBubble(int[] a) {
		int cont=0;
		for(int i = 0; cont != a.length-1 && i < a.length; i++) {
			cont= 0;
			for(int j = 0; j < a.length-i-1; j++) {
				if(a[j] > a[j+1])
					swap(a, j, j+1);
			}
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}
	
	public static void ordenaDistritosInsertion(int[] a) {
		for(int i = 1; i < a.length-1;i++) {
			int j = i;
			
			while(j > 0 && a[j-1] > a[j]) {
				swap(a, j, j-1);
				j=j-1;
			}
		}
	}
	
	public static void contaDistristos(int[] a) {
		int cont = 0;
		
		if(a.length == 1) {
			cont++;
			imprimeVet(a);
		}
		else if(a.length > 1) {
//			ordenaDistritosBubble(a);
			ordenaDistritosInsertion(a);
			cont++;
			for(int i = 0; i < a.length-1; i++) {
				if(a[i] != a[i+1])
					cont++;
			}
			imprimeVet(a);
		}
		
		System.out.println("Existe(m) " + cont + " valor(es) distinto(s)!\n");
	}
	
	public static void imprimeVet(int[] a) {
		System.out.print("[");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i < a.length-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int[] v = {1,1,7,2,1,5,8,5,8,3,2,9},
			  v1 = {},
			  v2 = {1,1,1,1},
			  v3 = {41},
			  v4 = {4,1};
		
		contaDistristos(v);
		contaDistristos(v1);
		contaDistristos(v2);
		contaDistristos(v3);
		contaDistristos(v4);
	}
}
