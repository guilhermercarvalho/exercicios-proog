public class ContaBancaria
{
	private String nome, cpf;
	private float saldo, limite;

	public ContaBancaria(String nome, String cpf, float saldo, float limite){
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
		this.limite = limite;
	}

	public String getNome(){
		return this.nome;
	}

	public String getCpf(){
		return this.cpf;
	}

	public float getSaldo(){
		return this.saldo;
	}

	public float getLimite(){
		return this.limite;
	}

	public void deposito(float deposito){
		this.saldo += deposito;
	}

	public void retirada(float retirada){
		if(retirada > this.saldo){
			if(retirada <= this.limite)
				this.saldo -= retirada;
		}
		else{
			System.out.printf("Não foi possível realizar impréstimo. Valor não pode exceder limite do cheque especial: RS%.2f\n" + getLimite())
		}
	}

	public void jurosMensais(int meses){
		float juros = meses * 0.2f;
		this.limite -= juros;
	}

	public void imprimeInformacoes(){
		System.out.println("Nome do Dono da Conta: " + getNome());
		System.out.println("CPF do Dono da Conta: " + getCpf());
		System.out.printf("Saldo Atual da Conta: R$%.2f\n" + getSaldo());
	}

}