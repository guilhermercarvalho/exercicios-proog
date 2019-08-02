package aula_EAD_Complexidade;

public class Primo {
	public static boolean ehPrimo(int n) {
		if(n <= 1)			// Caso específico n menor ou igual a 1, n não é primo.
			return false;
		
		for (int i = 2; i < n; i++) {	// Verifica n mod i (2 até n-1), incrementando  i em uma unidade.
			
			if (n % i == 0)		// Caso n mod i igual a 0 para qualquer i, n não é primo.
				return false;
		}
		return true;	// Caso nenhum if seja executado, n é primo.
	}

	// Versão otmizada encontrada usa método de divisão por tentativa (Trial Division).
	public static boolean ehPrimoOtimizado(int n) {
		if(n <= 1)
			return false;
	
		if(n == 2)				// Caso específico n igual a 2, n é primo.
			return true;
		
		if(n % 2 == 0)			// Caso n mod 2 igual a 0, n não pode ser primo.
			return false;
		 		 
		for(int d = 3; d * d <= n; d+=2) {		// Verifica se composição de d (d*d) é menor ou igual a n. Incrementando d 
												// em 2 unidades (procurando um múltiplo de algum ímpar entre 3 e raíz de n).
			
			if(n % d == 0) {	// Caso n mod d igual a 0, n não pode ser primo.
				return false;
			}
		}
		return true;
	}
	
	public static boolean ehPrimoTeste(int n) {
		if(n <= 1)
			return false;
		if(n == 2)
			return true;
		if(n % 2 == 0)
			return false;
	
		for(int i = 3; i <= (int)Math.sqrt(n); i++)
			if(n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		int contPrimo = 0;
		for(int i = 0; i <= 10000000; i++) {
//			if(ehPrimo(i)) {
//			if(ehPrimoTeste(i)) {
			if(ehPrimoOtimizado(i)) {
				System.out.println(i + " eh primo!");
				contPrimo++;
			}
//			else
//				System.out.println(i + " não eh primo!");
		}
		
		System.out.println("De 0 a 10000000 temos " + contPrimo + " números primos.");

	}
}
