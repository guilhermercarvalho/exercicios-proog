public class Ex7_c{
	private boolean pode;
	private String nome;
	public void setNome(String nome){
		this.nome = nome;
	}
	public void imprime(){
		if(pode)
			System.out.println(nome);
	}
	public static void main (String [] args){
		Ex7_c novoExemplo = new Ex7_c();
		novoExemplo.setNome("Cristovão");
			System.out.print("Olá ");
			novoExemplo.imprime();
		}
	}