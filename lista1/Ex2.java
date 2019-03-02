
// 2. Mostre um algoritmo que receba três notas, calcule e exiba a média aritmética das mesmas.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1, // nota primeira prova
                n2, // nota segunda prova
                n3; // nota terceira prova

        float mediaFinal; // média aritmética

        System.out.println("CALCULA MÉDIA ARITMÉTICA\n");

        System.out.printf("P1: ");
        n1 = input.nextFloat();

        System.out.printf("P2: ");
        n2 = input.nextFloat();

        System.out.printf("P3: ");
        n3 = input.nextFloat();

        mediaFinal = (n1 + n2 + n3) / 3;
        System.out.printf("\nMédia: %.2f%n%n", mediaFinal);

    }
}