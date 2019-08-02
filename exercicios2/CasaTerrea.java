package exercicios2;

/**
 *
 * @author guilherme
 */
public class CasaTerrea extends Casa{
	
	public CasaTerrea(boolean condominio, float metragemTotal, String endereco,
			Engenheiro responsavel) {
		super(condominio, metragemTotal, endereco, responsavel);
	}
	
	public String descricaoDoImovel() {
                String descricao = "Casa Térrea pertence a um Condomínio: ";
		if(super.isCondominio())
                    descricao += "SIM.\n";
		else
                    descricao += "NÃO.\n";
		
                descricao += "Situada à " + super.getEndereco() + ". \n";
		descricao += "Área total: " + super.getMetragemTotal() + " metros quadrados.\n";
		descricao += "Responsável: Eng. " + super.getResponsavel().getNome() + ". CREA " + super.responsavel.getCrea() + ".\n";

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

