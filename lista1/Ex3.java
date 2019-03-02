
// 3. Escreva um algoritmo que receba três notas e os seus respectivos pesos. Em seguida, calcule a média ponderada das mesmas, exibindo-a.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // lê dados fornecidos pelo usuário

        float n1, // nota da primeira prova
                n2, // nota da segunda prova
                n3; // nota da terceira prova

        float pesoN1, // peso da primeira nota
                pesoN2, // peso da segunda nota
                pesoN3; // peso da terceira nota

        float mediaFinal; // media ponderada final

        String situacao; // situação final do aluno

        System.out.println("CALCULA MÉDIA PONDERADA\n");

        System.out.printf("P1: ");
        n1 = input.nextFloat();

        System.out.printf("Peso: ");
        pesoN1 = input.nextFloat();

        System.out.printf("%nP2: ");
        n2 = input.nextFloat();

        System.out.printf("Peso: ");
        pesoN2 = input.nextFloat();

        System.out.printf("%nP3: ");
        n3 = input.nextFloat();

        System.out.printf("Peso: ");
        pesoN3 = input.nextFloat();

        mediaFinal = (n1 * pesoN1 + n2 * pesoN2 + n3 * pesoN3) / (pesoN1 + pesoN2 + pesoN3);

        System.out.printf("%nMédia final: %.2f%n", mediaFinal);

        if (mediaFinal > 6f)
            situacao = "Aprovado";
        else
            situacao = "Reprovado";

        System.out.printf("Situação final do aluno: %s%n%n", situacao);

    }
}