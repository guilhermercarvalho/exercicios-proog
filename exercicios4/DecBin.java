package exercicios4;

public class DecBin {
	public static int cont = 0;
	public static void decBin(int n) {
		if (n > 0) {
			cont++;
			decBin(n / 2);
			System.out.print(n % 2);
		}
		if(cont < 1)
			System.out.print("0");
	}

	public static void main(String[] args) {
		System.out.println("Decimal \tBinário");
		for (int i = 0; i < 31; i++) {
			System.out.print(i + "\t\t");
			decBin(i);
			System.out.println();
		}
	}
}
