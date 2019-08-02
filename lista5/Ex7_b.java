public class Ex7_b{
	private int[][] valores;
	public Ex7_b(int l, int c){
		valores = new int[l][c];
		for(int i = 0; i < valores.length; i++)
			for(int j = 0; j < valores[i].length; j++)
				valores[i][j] = i + j;
		}
		public void imprime(int l){
			for(int i = 0; i < valores[l].length; i++)
				System.out.print(valores[l][i] + " ");
			System.out.println();
		}
		public static void main (String [] args){
			Ex7_b novoExemplo = new Ex7_b(3,4);
			novoExemplo.imprime(0);
			novoExemplo.imprime(1);
			novoExemplo.imprime(2);
		}
	}