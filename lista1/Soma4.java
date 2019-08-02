import java.util.Scanner;
public class Soma4 {
	public static void main (String [] jose) {
		 Scanner teclado = new Scanner (System.in);
		int z,k,l,m, soma = 0;
		System.out.println("oi digita 4 numeros");
		// z = teclado.nextInt();
		// k = teclado.nextInt();
		// l = teclado.nextInt();
		// m = teclado.nextInt();
		// soma = z + k + l + m;

		 int[] vetSoma = new int[4];

		 for(int i = 0; i < vetSoma.length; i++){
		 	System.out.print("número " + (i + 1) + ": ");
		 	vetSoma[i] = teclado.nextInt();
		 	soma += vetSoma[i];
		 }
		System.out.println("oi olha sua soma " + soma);
	}
}