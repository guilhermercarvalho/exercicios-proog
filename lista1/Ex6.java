
// 6. Faça um programa que calcule e mostre a tabuada de um determinado número inteiro digitado pelo usuário.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // recebe dados externos

        int n; // inteiro recebido;

        System.out.println("EXIBE TABUADA DE UM INTEIRO\n");

        System.out.print("Digite um número inteiro: ");
        n = input.nextInt();

        System.out.println("\nTABUADA\tDO " + n);

        for(int i = 1; i <= 10; i++) { // loop iterativo exibe e calcula tabuada do 'n' do 1 ao 10
            System.out.printf("%d x %d\t = \t%d%n", n, i, (n * i));
        }
    }
}