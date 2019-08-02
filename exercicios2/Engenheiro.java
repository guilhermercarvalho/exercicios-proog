package exercicios2;

/**
 *
 * @author guilherme
 */
public class Engenheiro extends Pessoa{
	private int crea;

	public Engenheiro(String nome, String cpf, int crea) {
		super(nome, cpf);
		this.crea = crea;
	}
	
	public int getCrea() {
		return crea;
	}

	public void setCrea(int crea) {
		this.crea = crea;
	}
}

