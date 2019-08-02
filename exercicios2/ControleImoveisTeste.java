package exercicios2;
/**
 *
 * @author guilherme
 */
public class ControleImoveisTeste {

	public static void main(String[] args) {
		// Criando pessoas
		Pessoa	p1 = new Pessoa("Gilberto Macedo", "123456789-00"),
				p2 = new Pessoa("Bruna Ruas", "123456789-01"),
				p3 = new Pessoa("Viviam Bicalho", "123456789-10"),
				p4 = new Pessoa("Augusto Juliano", "123456789-02");
		
		// Criando engenheiro
		Engenheiro 	eng = new Engenheiro("Astolfo Pires", "123456789-11", 123456),
					eng2 = new Engenheiro("Alexandre Franco", "123456789-02", 123450),
					eng3 = new Engenheiro("Pedro Barbosa", "123456789-22", 12323);
		
		// Criando Predio
		UnidadeResidencial 	u1 = new UnidadeResidencial(80f, 3, 2, p1),
							u2 = new UnidadeResidencial(80f, 3, 2, p2),
							u3 = new UnidadeResidencial(80f, 3, 2, p3);
				
		Predio predio1 = new Predio("Dom Quixote", 3, 1, 542.8f, "Rua da Paz, 135. Campo Grande - MS", eng);
		
		predio1.cadastrarUnidade(u1);
		predio1.cadastrarUnidade(u2);
		predio1.cadastrarUnidade(u3);
		
		System.out.println(predio1.descricaoDoImovel());
		
		// Criando Casa
		UnidadeResidencial u4 = new UnidadeResidencial(60.5f, 4, 3, p2);

		Casa c1 = new Casa(true, 127f, "Travessa Felipe Duque, 95. Campo Grande - MS", eng3);
                
                c1.cadastrarUnidade(u4);
                
                System.out.println(c1.descricaoDoImovel());

		// Criando Casa Sobrado
		UnidadeResidencial	u5 = new UnidadeResidencial(25f, 1, 1, p4);
		
		CasaSobrado cs1 = new CasaSobrado(false, 30f, "Rua da Íris, 189. Campo Grande - MS", eng2, 1);
		
		cs1.cadastrarUnidade(u5);
		
		System.out.println(cs1.descricaoDoImovel());
		
		// Criando Casa Terrea
		UnidadeResidencial 	u6 = new UnidadeResidencial(32f, 3, 2, p1),
							u7 = new UnidadeResidencial(32f, 3, 2, p3),
							u8 = new UnidadeResidencial(32f, 3, 2, p4);
		
		CasaTerrea ct1 = new CasaTerrea(true, 35.67f, "Rua Não Sei, 002. Sei Menos Ainda - AC", eng3);
		
		ct1.cadastrarUnidade(u6);
		ct1.cadastrarUnidade(u7);
		ct1.cadastrarUnidade(u8);
		
		System.out.println(ct1.descricaoDoImovel());
	}
}

