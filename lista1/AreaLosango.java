import java.util.Scanner;
public class AreaLosango{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int diagonalMaior, diagonalMenor, area;

		System.out.printf("Informe as diagonais do losango\nDiagonal Maior: ");
		diagonalMaior = teclado.nextInt();
		System.out.print("Diagonal Menor: ");
		diagonalMenor = teclado.nextInt();
		area = (diagonalMaior * diagonalMenor) / 2;
		System.out.printf("Área do Losango: %d\n", area);
	}
}