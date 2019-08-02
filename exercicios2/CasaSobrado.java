package exercicios2;

/**
 *
 * @author guilherme
 */
public class CasaSobrado extends Casa{
	private int numAndares;

	public CasaSobrado(boolean condominio, float metragemTotal, String endereco,
			Engenheiro responsavel, int numAndares) {
		super(condominio, metragemTotal, endereco, responsavel);
		this.numAndares = numAndares;
	}

	public int getNumAndares() {
		return numAndares;
	}
	
	public void setNumAndares(int numAndares) {
		this.numAndares = numAndares;
	}

	@Override
	public String descricaoDoImovel() {
                String descricao = "Casa Sobrado pertence a um Condomínio: ";
		if(super.isCondominio())
                    descricao += "SIM.\n";
		else
                    descricao += "NÃO.\n";
		
		descricao += "Situada à " + super.getEndereco() + ". \n";
		descricao += "Área total: " + super.getMetragemTotal() + " metros quadrados.\n";
		descricao += "Responsável: Eng. " + super.getResponsavel().getNome() + ". CREA " + super.responsavel.getCrea() + ".\n";
		descricao += "Número de Andares: " + getNumAndares() + ".\n";
		
		for(int i = 0; i < super.unidades.length; i++) {
			if(super.unidades[i] != null) {
				descricao += "Unidade " + (i+1) + "\n";
				descricao += "Propriedade de " + super.unidades[i].getProprietario().getNome() + ".\n";
				descricao += "Possui " + super.unidades[i].getMetragemUnidade() + " metros quadrados, " + super.unidades[i].getNumQuartos() + " quarto(s), " + super.unidades[i].getNumBanheiros() + " banheiro(s).\n";
			}
		}
		return descricao;
	}
}

