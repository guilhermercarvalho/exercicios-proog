public class Empregado{
	private String nome, sobrenome;
	private double salarioMensal;

	public Empregado(String nome, String sobrenome, double salarioMensal){
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setSalarioMensal(salarioMensal);
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getSobrenome(){
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal(){
		return this.salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal){
		if(salarioMensal > 0)
			this.salarioMensal = salarioMensal;
		else
			System.out.println("Salário mensal deve ser maior que zero!");
	}

	public void imprimeInformacoesEmpregado(){
		System.out.println("Nome do empregado: " + getNome() + " " + getSobrenome() + ".");
		System.out.printf("Salário mensal do funcionário: R$ %.2f.\n\n", getSalarioMensal());
	}

	public void aumentoSalario(float aumento){
		if(aumento > 0 && aumento <= 1){
			this.salarioMensal += getSalarioMensal() * aumento;
			System.out.printf("Novo salário mensal: R$ %.2f.\n", getSalarioMensal());
		}
		else
			System.out.println("Informe um valor válido! Entre 0 e 1.");
	}

	public static void main(String[] args) {
		Empregado emp1 = new Empregado("Guilherme", "Carvalho", 600);
		emp1.imprimeInformacoesEmpregado();
		emp1.aumentoSalario(0.89999999999999f);
	}
}