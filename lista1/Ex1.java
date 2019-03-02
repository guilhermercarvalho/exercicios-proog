
// 1. Faça um algoritmo que receba quatro números, calcule e mostre a soma destes números.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, // primeiro número
            n2, // segundo número
            n3, // terceiro número
            n4; // quarto número

        System.out.println("SOMA 4 NÚMEROS\n");

        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = input.nextInt();

        System.out.print("Digite o quarto número: ");
        n4 = input.nextInt();

        System.out.println("\nA soma é: " + (n1 + n2 + n3 + n4));
    }
}