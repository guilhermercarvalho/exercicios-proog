// 5. Escreva um algoritmo que receba o salário de um funcionário e o seu percentual de aumento. Calcule e mostre seu novo salário.

import java.util.Scanner;

public class Ex5 {
                        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome; // nome do funcionário

        float salarioAtual, // salário atual do funcionário
                novoSalario; // salário com aumento

        int percentual; // percentual de aumento do salário

        System.out.println("CALCULA AUMENTO SALARIAL\n");

        System.out.println("DADOS FUNCIONÁRIO");

        System.out.print("Nome completo: ");
        nome = input.nextLine();

        System.out.print("Salário atual: ");
        salarioAtual = input.nextFloat();

        System.out.print("Percentual de aumento (1 à 100): ");
        percentual = input.nextInt();

        // Cálculo do novo salário
        novoSalario = (float) salarioAtual * (1f + (percentual / 100f));

        System.out.println("\nDADOS FUNCIONÁRIO (ATUALIZADO)");

        System.out.printf("Funcionário: %s%n" +
                          "Salário anterior ao aumento: R$%.2f%n" +
                          "Procentagem de aumento: %d%%%n" +
                          "Salário após aumento: R$%.2f%n%n", nome, salarioAtual, percentual, novoSalario);

    }
}