package exercicios6;

public class OrdenaEstante {
	
	public static void mergesort(float[][] a, int ini, int fim, int pos) {
		if(ini < fim) {
			int meio = (ini+fim)/2;
			mergesort(a, ini, meio, pos);
			mergesort(a, meio+1, fim, pos);
			merge(a, ini, meio, fim, pos);
			pos = pos + 1;
			if(pos < a.length)
				mergesort(a, ini, fim, pos);	
			}
	}
	
	public static void merge(float[][] a, int ini, int meio, int fim, int pos) {
		float[] b = new float[a[pos].length];
		
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
	
	public static void mergesort(float[] a, int ini, int fim) {
		if(ini < fim){
            int meio = (ini+fim) / 2;
            mergesort(a, ini, meio);
            mergesort(a, meio+1, fim);
            merge(a, ini, meio, fim);  
        }
	}

	public static void merge(float[] a, int ini, int meio, int fim){
		float[] b = new float[a.length];
	
	    for(int i = 0; i < a.length; i++)
	        b[i] = a[i];
	
	    int i = ini;
	    int j = meio+1;
	    int k = ini;
	    
    	while(i <= meio && j <= fim){
        	if(b[i] >= b[j])
            	a[k++] = b[i++];
        	else
        		a[k++] = b[j++];
    	}

    	while(i <= meio)
    	a[k++] = b[i++];
	}
    
    public static float[][] organizaEstante(float[][] a){
        float[] soma = new float[a.length];

        for(int i = 0; i < a.length; i++){
        	for(int j = 0; j < a[i].length; j++) {
        		soma[i] += a[i][j];
        	}
        }
        
        for(int i = 0; i < a.length; i++) {
			System.out.print("[");
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%.2f",a[i][j]);
				if(j < a[i].length-1)
					System.out.print(", ");
			}
			System.out.print("]  \t-> ");
			System.out.printf("Preço: %.2fR$\n", soma[i]);
		}
        
        mergesort(soma, 0, soma.length-1);
        mergesort(a, 0, a[0].length-1, 0);
        
        float[][] c = new float[a.length][a[0].length];
               
        for(int i = 0; i < a.length; i++){
        	int aux = 0;
        	int p = i;
        	for(int j = 0; j < a[i].length; j++)
        		aux += a[i][j];
        		
        	for(int k = 0; k < soma.length; k++)
        		if(soma[k] == aux)
        			p = k;
       
        	for(int j = 0; j < a[i].length; j++) {
        		c[p][j] = a[i][j];
        	}
        }
        
        System.out.println();
        
        for(int i = 0; i < c.length; i++) {
			System.out.print("[");
			for(int j = 0; j < c[i].length; j++) {
				System.out.printf("%.2f",c[i][j]);
				if(j < c[i].length-1)
					System.out.print(", ");
			}
			System.out.print("]  \t-> ");
			System.out.printf("Preço: %.2fR$\n", soma[i]);
		}
        
        return c;
    }

	public static void main(String[] args) {
		float[][] estantePaul = {{19,17,100,20,100}, {14,12,15,11,13}, {22,25,23,24,21}, {2,4,1,3,5}, {8,6,10,7,9}};
		
		estantePaul = organizaEstante(estantePaul);

	}
}