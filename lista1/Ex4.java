
// 4. Faça um algoritmo que receba o salário de um funcionário, calcule e mostre seu novo salário,sabendo-se que este teve um aumento de 25%.

import java.util.Scanner;

public class Ex4 {
    public static final float AUMENTO = 1.25f; // porcentagem de aumento salarial
                        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome; // nome do funcionário

        float salarioAtual, // salário atual do funcionário
                novoSalario; // salário com aumento

        System.out.println("CALCULA AUMENTO SALARIAL DE 25%\n");

        System.out.println("DADOS FUNCIONÁRIO");

        System.out.print("Nome completo: ");
        nome = input.nextLine();

        System.out.print("Salário atual: ");
        salarioAtual = input.nextFloat();

        // Cálculo do novo salário
        novoSalario = salarioAtual * AUMENTO;

        System.out.println("\nDADOS FUNCIONÁRIO (ATUALIZADO)");

        System.out.printf("Funcionário: %s%n" +
                          "Salário antes do ajuste: R$%.2f%n" +
                          "Salário após ajuste de 25%%: R$%.2f%n%n", nome, salarioAtual, novoSalario);

    }
}