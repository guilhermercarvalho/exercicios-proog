package exercicios6;

public class OrdenacaoTeste extends OrdenacaoMetodos {
	public static void main(String[] args) {
		int[] s1 = {5,3,1,9,7,5},
				  s2 = {2, 4, 6, 8, 10, 12},
				  s3 = {11, 9, 7, 5, 3, 1},
				  s4 = {5, 7, 2, 8, 1, 6},
				  s5 = {2, 4, 6, 8, 10, 12, 11, 9, 7, 5, 3, 1},
				  s6 = {2, 4, 6, 8, 10, 12, 1, 3, 5, 7, 9, 11},
				  s7 = {8, 9, 7, 9, 3, 2, 3, 8, 4, 6},
				  s8 = {89, 79, 32, 38, 46, 26, 43, 38, 32, 79},
				  s9 = {7,2,3,5,8,4,6},
				  s10 = {5,3,1,9,7,5};	
		
		//Chamar método para organizar vetor
		long tempoInicial = System.currentTimeMillis();
		testeMesa(s1);
		testeMesa(s2);
		testeMesa(s3);
		testeMesa(s4);
		testeMesa(s5);
		testeMesa(s6);
		testeMesa(s7);
		testeMesa(s8);
		testeMesa(s10);
		long tempoFinal = System.currentTimeMillis();
		
		imprimeVet(s9);
		mergesort(s9, 0, s9.length-1);
		imprimeVet(s9);

		System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");
	}
}
