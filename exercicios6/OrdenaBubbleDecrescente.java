package exercicios6;

public class OrdenaBubbleDecrescente {
	
	public static void bubblesort(int[] a) {
		int cont = 0;
		
		for(int i = 0; cont < a.length-1 && i < a.length; i++) {
			cont = 0;
			for(int j = 0 ; j < a.length-i-1; j++) {
				if(a[j] < a[j+1]) {
					int aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
				else
					cont++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] v = {4,21,5,25,1245,453};
		
		bubblesort(v);
		
		for(int p : v)
			System.out.println(p);
	}
}
