package exercicios4;

public class Palindromo {

	public static boolean palindromo(String palavra) {
		palavra = palavra.replaceAll(" ", "");
		palavra = palavra.replaceAll(",", "");
		return palindromo(palavra, 0, palavra.length() - 1);
	}

	public static boolean palindromo(String palavra, int i, int f) {
		if (palavra.length() < 3)
			return false;

		if (palavra.toLowerCase().charAt(i) != palavra.toLowerCase().charAt(f))
			return false;

		if (i > palavra.length() / 2)
			return true;

		return palindromo(palavra, i + 1, f - 1);
	}

	public static void main(String[] args) {
		System.out.println("PALÍNDROMOS");
		String[] palindromos = {"ama",
								"matam",
								"Mussum",
								"Ze de Lima, Rua Laura, Mil e Dez",
								"osso","A cara rajada da jararaca",
								"Rodador", 
								"SATOR AREPO TENET OPERA ROTAS"};
		
		for(String p : palindromos) {
			System.out.printf("\"%s\" é palíndromo? %B\n", p, palindromo(p));
		}

		System.out.println("\nNÃO PALÍNDROMOS");
		String[] naoPalindromos = {"ola",
								   "ao",
								   "m",
								   "aa",
								   "Caneta",
								   "aloha",
								   "Algodao",
								   "carro",
								   "Anaconda",
								   "oriundo"};
		
		for(String np : naoPalindromos) {
			System.out.printf("\"%s\" é palíndromo? %B\n", np, palindromo(np));
		}
	}
}
