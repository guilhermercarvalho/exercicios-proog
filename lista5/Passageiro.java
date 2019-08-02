public class Passageiro 
{
	private String nome, cpf, telefone, endereco;

	public Passageiro(String nome, String cpf, String telefone, String endereco) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setTelefone(telefone);
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

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void imprimeInformacoesPassageiros() {
		System.out.println("Nome Passageiro: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Endereço: " + getEndereco());
	}
}