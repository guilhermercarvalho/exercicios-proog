import java.util.Scanner;
public class AngulosInternosTriangulo{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] angulos = new int [2];

		System.out.println("Digite os valores dos ângulos do triângulo (Menor que 180°):");
		for(int i = 0; i < angulos.length; i++){
			System.out.printf("Ângulo %d: ", (i+1));
			angulos[i] = teclado.nextInt();
		}

		System.out.println("Ângulo 3: " + (180 - (angulos[0] + angulos[1])));
	}
}