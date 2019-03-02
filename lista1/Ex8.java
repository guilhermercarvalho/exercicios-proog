// 8. Faça um programa que calcule a área de um losango.

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diagonalMaior,
            diagonalMenor;

        int areaTotal;

        System.out.println("CALCULA ÁREA DE UM LOSANGO\n");

        System.out.print("Diagonal maior: ");
        diagonalMaior = input.nextInt();
        
        System.out.print("Diagonal menor: ");
        diagonalMenor = input.nextInt();

        // Calcula área total
        areaTotal = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("Área total do losango: " + areaTotal);
    }
}