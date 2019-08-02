package exercicios2;

/**
 *
 * @author guilherme
 */
public abstract class Edificacao {
	protected float metragemTotal;
	protected String endereco;
	protected Engenheiro responsavel;
	protected UnidadeResidencial [] unidades;
	
	public Edificacao(float metragemTotal, String endereco, Engenheiro responsavel) {
		this.metragemTotal = metragemTotal;
		this.endereco = endereco;
		this.responsavel = responsavel;
		this.unidades = new UnidadeResidencial[UnidadeResidencial.getCont()];
	}
	
	public float getMetragemTotal() {
		return metragemTotal;
	}
	public void setMetragemTotal(float metragemTotal) {
		this.metragemTotal = metragemTotal;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Engenheiro getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Engenheiro responsavel) {
		this.responsavel = responsavel;
	}
	public UnidadeResidencial[] getUnidades() {
		return unidades;
	}
	public void setUnidades(UnidadeResidencial[] unidades) {
			this.unidades = unidades;
	}
	
	public boolean cadastrarUnidade(UnidadeResidencial novaUnidadeResidencial) {
		boolean unidadeCadastrada = false;
		int posicao = 0;
		
		for(int i = 0; i < unidades.length && !unidadeCadastrada; i++) {
			if(unidades[i] == null) {
				posicao = i;
				unidadeCadastrada = true;
			}
		}
		
		if(unidadeCadastrada) {
			unidades[posicao] = novaUnidadeResidencial;
			System.out.println("Unidade cadastrada com sucesso!");
			return true;
		}
		else {
			System.out.println("Unidade NÃO foi cadastrada com sucesso!");
			return false;
		}
	}
	
	public abstract String descricaoDoImovel();
}

