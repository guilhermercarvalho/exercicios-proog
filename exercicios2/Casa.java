package exercicios2;

/**
 *
 * @author guilherme
 */
public class Casa extends Edificacao{
	protected boolean condominio;
	
	public Casa(boolean condominio, float metragemTotal, String endereco, Engenheiro responsavel) {
		super(metragemTotal, endereco, responsavel);
		this.condominio = condominio;
	}

	public boolean isCondominio() {
		return condominio;
	}

	public void setCondominio(boolean condominio) {
		this.condominio = condominio;
	}

	@Override
	public String descricaoDoImovel() {
		String descricao = "Casa pertence a um Condomínio: ";
		if(condominio)
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

