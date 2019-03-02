
// 7. Faça um programa que receba o valor de dois ângulos internos de um triângulo e mostre o valor do terceiro ângulo.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angulo1, // primeiro ângulo
                angulo2, // sugundo ângulo
                angulo3; // terceiro ângulo

        System.out.println("CALCULA TERCEIRO ÂNGULO INTERNO DE UM TRIÂNGULO\n");

        System.out.println("Digite os ângulos do triângulo.\nLembre-se: menor que 180°(graus).\n");

        System.out.print("Primeiro ângulo: ");
        angulo1 = input.nextInt();

        System.out.print("Segundo ângulo: ");
        angulo2 = input.nextInt();

        // Cálculo do terceiro ângulo
        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("\nA soma dos ângulos internos de um triângulo é igual 180, portanto...");
        System.out.println("Terceiro ângulo = " + angulo3 + "°");
    }
}