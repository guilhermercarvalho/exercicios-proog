package exercicios2;

/**
 *
 * @author guilherme
 */
public class Predio extends Edificacao{
	private String nome;
	private int numAndares;
	private int apPorAndar;
	
	public Predio(String nome, int numAndares, int apPorAndar, float metragemTotal, String endereco, Engenheiro responsavel) {
		super(metragemTotal, endereco, responsavel);
		this.nome = nome;
		this.numAndares = numAndares;
		this.apPorAndar = apPorAndar;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumAndares() {
		return numAndares;
	}
	public void setNumAndares(int numAndares) {
		this.numAndares = numAndares;
	}
	public int getApPorAndar() {
		return apPorAndar;
	}
	public void setApPorAndar(int apPorAndar) {
		this.apPorAndar = apPorAndar;
	}

	@Override
	public String descricaoDoImovel() {
		String descricao = "";
		// Verificar unidades instânciadas.
		for(int i = 0; i < super.unidades.length; i++) {
			if(super.unidades[i] != null) {
				descricao += "Unidade " + (i+1) + "\n";
				descricao += "Propriedade de " + super.unidades[i].getProprietario().getNome() + ".\n";
				descricao += String.format("Possui %.0f  metros quadrados, %d quarto(s), %d banheiro(s).\n",super.unidades[i].getMetragemUnidade(), super.unidades[i].getNumQuartos(), super.unidades[i].getNumBanheiros());
			}
		}
		return String.format("Prédio %s.\n"
                + "Situado à %s.\n"
                + "Área total: %.0f metros quadrados.\n"
                + "Responsável: Eng. %s. CREA: %d.\n"
                + "Número de Andares: %d.\n"
                + "Número de Apartamentos por Andar: %d.\n"
                + "%s", getNome(), super.getEndereco(), super.getMetragemTotal(), super.getResponsavel().getNome(), super.responsavel.getCrea(), super.unidades.length, getApPorAndar(), descricao);
//                descricao = "Prédio " + getNome() + ".\n";
//		descricao += "Situado à " + super.getEndereco() + ". \n";
//		descricao += "Áreea total: " + super.getMetragemTotal() + " metros quadrados.\n";
//		descricao += "Responsável: Eng. " + super.getResponsavel().getNome() + ". CREA " + super.responsavel.getCrea() + ".\n";
//		descricao += "Número de Andares: " + super.unidades.length + ".\n";
//		descricao += "Número de Apartamentos por Andar: " + getApPorAndar() + ".\n";
//		
	}
}
