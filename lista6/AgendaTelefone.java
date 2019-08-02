public class AgendaTelefone{
	private String nome, telefone;
	private int ddd;

	public AgendaTelefone(String nome, int ddd, String telefone){
		this.setNome(nome);
		this.setDDD(ddd);
		this.setTelefone(telefone);
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getTelefone(){
		return this.telefone;
	}

	public void setTelefone(String telefone){
		if(telefone.length() == 9)
			this.telefone = telefone;
	}

	public int getDDD(){
		return this.ddd;
	}

	public void setDDD(int ddd){
		if(ddd  >= 2)
			this.ddd = ddd;
	}

	public void imprimeInformacaoPessoa(){
		System.out.println("Nome: " + getNome());
		System.out.printf("Telefone: (%03d) %s\n", getDDD(), getTelefone());
	}

	public boolean equals(String nome){
		for(int i = 0; i < )
	}
}