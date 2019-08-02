package exercicios2;

/**
 *
 * @author guilherme
 */
public class UnidadeResidencial {
	protected float metragemUnidade;
	protected int numQuartos;
	protected int numBanheiros;
	protected Pessoa proprietario;
	
	// Atributo criado para determinar tamanho do vetor de unidades
	private static int cont = 0;
	
	public UnidadeResidencial(float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario) {
		this.metragemUnidade = metragemUnidade;
		this.numQuartos = numQuartos;
		this.numBanheiros = numBanheiros;
		this.proprietario = proprietario;
		++cont;
	}
	
	public float getMetragemUnidade() {
		return metragemUnidade;
	}
	
	public void setMetragemUnidade(float metragemUnidade) {
		this.metragemUnidade = metragemUnidade;
	}
	
	public int getNumQuartos() {
		return numQuartos;
	}
	
	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}
	
	public int getNumBanheiros() {
		return numBanheiros;
	}
	
	public void setNumBanheiros(int numBanheiros) {
		this.numBanheiros = numBanheiros;
	}
	
	public Pessoa getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	
	public static int getCont() {
		return cont;
	}
}

