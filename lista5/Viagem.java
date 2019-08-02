public class Viagem
{
	private Passageiro passageiro;
	private Motorista motorista;
	private String origem, destino;
	private double precoCorrida;

	public String getNomePassageiro(){
		return this.passageiro.getNome();
	}

	public String getNomeMotorista(){
		return this.motorista.getNome();
	}

	public String getPlacaCarro(){
		return this.motorista.getPlacaCarro();
	}

	public String getOrigemCorrida(){
		return this.origem;
	}

	public String getDestinoCorrida(){
		return this.destino;
	}

	public void setOrigemCorrida(String origem){
		this.origem = origem;
	}

	public void setDestinoCorrida(String destino){
		this.destino = destino;
	}

	public double getPrecoCorrida(){
		return this.precoCorrida;
	}

	public void setPrecoCorrida(double precoCorrida){
		this.precoCorrida = precoCorrida;
	}

	public Viagem(Passageiro passageiro, Motorista motorista){
		this.passageiro = new Passageiro(getNome());
		this.motorista = new Motorista();

	}

	public void imprimeInformacoesCorrida(){
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Informações Passageiro:");
		passageiro.imprimeInformacoesPassageiros();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Informações Motorista:");
		motorista.imprimeInformacoesMotoristas();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Informações Corrida:");
		System.out.println(getOrigemCorrida());
		System.out.println(getDestinoCorrida());
		System.out.println(getPrecoCorrida());
	}
}