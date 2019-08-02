public class PessoaComFome
{
	private String nome;

	public PessoaComFome(String nome){
		this.setNome(nome);
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void comer(String comendo, float preco){
		System.out.print(getNome() + " está comendo " + comendo);
		System.out.printf(" e pagou R$%.2f pelo prato.\n", preco);
	}

}