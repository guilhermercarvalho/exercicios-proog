public class Motorista
{
	private String nome, cpf, placaCarro, endereco;
	private int anoValidadeHabilitacao;

	public Motorista(String nome, String cpf, String placaCarro, int anoValidadeHabilitacao, String endereco) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setPlacaCarro(placaCarro);
		this.setAnoValidadeHabilitacao(anoValidadeHabilitacao);
		this.setEndereco(endereco);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPlacaCarro() {
		return this.placaCarro;
	}

	public void setPlacaCarro(String placa) {
		this.placaCarro = placa;
	}

	public int getAnoValidadeHabilitacao() {
		return this.anoValidadeHabilitacao;
	}

	public void setAnoValidadeHabilitacao(int ano) {
		this.anoValidadeHabilitacao = ano;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void imprimeInformacoesMotoristas() {
		System.out.println("Nome Motorista: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Placa do Carro: " + getPlacaCarro());
		System.out.printf("Ano da Validade da Habilitação: %d\n", getAnoValidadeHabilitacao());
		System.out.println("Endereço: " + getEndereco());
	}

}
