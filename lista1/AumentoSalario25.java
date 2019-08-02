import java.util.Scanner;
public class AumentoSalario25{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float salarioAtual, salarioAumento;

		System.out.print("Digite, em reais, seu salário atual: R$");
		salarioAtual = teclado.nextFloat();
		salarioAumento = salarioAtual * 1.25f;
		System.out.printf("Com um aumento de 25 porcento seu novo salário é igual a: R$%.2f", salarioAumento);
	}
}