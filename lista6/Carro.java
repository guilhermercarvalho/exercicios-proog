
public class Carro{
	// Atributos
	private String marca, modelo, codigoChassi;
	private boolean estadoAtual;
	private float velocidadeAtual;

	// Método constrotor
	public Carro(String marca, String modelo, String codigoChassi){
		this.marca = marca;
		this.modelo = modelo;
		this.codigoChassi = codigoChassi;
		this.setEstadoAtual(false);
		this.setVelocidadeAtual(0f);
	}

	public String getMarca(){
		return this.marca;
	}

	public String getModelo(){
		return this.modelo;
	}

	public String getCodigoChassi(){
		return this.codigoChassi;
	}

	public boolean getEstadoAtual(){
		return this.estadoAtual;
	}

	public float getVelocidadeAtual(){
		return this.velocidadeAtual;
	}

	public void setEstadoAtual(boolean estado){
		this.estadoAtual = estado;
	}

	public void setVelocidadeAtual(float velocidade){
		this.velocidadeAtual = velocidade;
	}

	public void acelerar(float velocidade){
		if(getEstadoAtual()){
			if(velocidade > getVelocidadeAtual() && velocidade <= 150f)
				this.velocidadeAtual = velocidade;
			else
				System.out.println("Velocidade Máxima Permitida: 150 Km/h.");
		}
		else
			System.out.println("Carro Desligado!");
	}

	public void frear(float velocidade){
		if(getEstadoAtual())
			if(velocidade < getVelocidadeAtual() && velocidade > 0f)
				this.velocidadeAtual = velocidade;
			else
				System.out.println("Velocidade Inválida!");
		else
			System.out.println("Carro Desligado!");
	}

	public void imprimeInformacoes(){
		System.out.println("Marca do Carro: " + getMarca());
		System.out.println("Modelo do Carro: " + getModelo());
		System.out.println("Código Chassi do Carro: " + getCodigoChassi());
		System.out.print("Estado Atual do Carro: ");
		if(getEstadoAtual())
			System.out.println("Ligado.");
		else
			System.out.println("Desligado.");
		System.out.println("Velocidade Atual do Carro: " + getVelocidadeAtual() + " Km/h");
	}

	public static void main(String[] args) {
		Carro c1 = new Carro("Gol", "Focus", "1234");
		c1.imprimeInformacoes();
		c1.acelerar(150.1f);
		c1.setEstadoAtual(true);
		c1.acelerar(150.1f);
		c1.imprimeInformacoes();
		c1.frear(50f);
		c1.imprimeInformacoes();
	}
}