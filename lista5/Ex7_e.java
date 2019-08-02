public class Ex7_e {
	private String nome;
	private int idade;
	public Ex7_e(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String getNome(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}
	public static void main(String [] args) {
		Ex7_e novoExemplo = new Ex7_e("Fulano", 30);
		System.out.println(novoExemplo.getNome() + " tem "
			+ novoExemplo.getIdade());
		novoExemplo.setIdade(31);
		System.out.println(novoExemplo.getNome() + " tem "
			+ novoExemplo.getIdade());
		novoExemplo.setNome("Beltrano");
		System.out.println(novoExemplo.getNome() + " tem "
			+ novoExemplo.getIdade());
	}
}