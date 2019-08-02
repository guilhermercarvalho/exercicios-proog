package exercicios6;

public class OrdenaStrings {
	public static void mergesort(String[] a, int ini, int fim) {
		if(ini < fim) {
			int meio = (ini+fim) / 2;
			mergesort(a, ini, meio);
			mergesort(a, meio+1, fim);
			merge(a, ini, meio, fim);
		}
	}
	
	public static void merge(String[] a, int ini, int meio, int fim) {
		String[] b = new String [a.length];
		
		for(int i = ini; i <= fim; i++) {
			b[i] = a[i];
		}
		
		int i = ini,
			j = meio + 1,
			k = ini;
		
		while(i <= meio && j <= fim) {
			if(b[i].length() <= b[j].length())
				a[k++] = b[i++];
			else
				a[k++] = b[j++];
		}
		
		while(i <= meio) {
			a[k++] = b[i++];
		}
	}
	
	public static void ordenaString(String[] a) {
		mergesort(a, 0, a.length-1);
		
		for(String p: a) {
			System.out.println("\"" + p + "\"");
		}
	}
	
	public static void main(String[] args) {
		String [] v = {"um", "quatro", "cinco", "dez", "dois", "três"}; 
		int[] vet = {5,15,10,8,1};
		
		OrdenacaoMetodos.quick(vet);
		
//		ordenaString(v);
		
		
	}
}
