import java.util.Scanner;
public class SalarioLiquido{
	public static final float GRATIFICACAO = 0.05f;
	public static final float IMPOSTO = 0.07f;
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float salarioBruto, salarioLiquido;

		System.out.printf("Informe o salário bruto do funcionário (em reais): R$");
		salarioBruto = teclado.nextFloat();
		
		salarioLiquido = (salarioBruto * (1f + GRATIFICACAO) - (salarioBruto * IMPOSTO));
		System.out.printf("O salário líquido calculado é de: R$%.2f\n", salarioLiquido);
	}
}