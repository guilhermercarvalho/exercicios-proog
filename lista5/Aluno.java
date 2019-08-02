public class Aluno
{
	private String nome, rga;
	private String[] disciplinas;


	public Aluno(String nome, String rga){
		this.setNome(nome);
		this.setRga(rga);
		this.disciplinas = new String [10];
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getRga(){
		return this.rga;
	}

	public void setRga(String rga){
		this.rga = rga;
	}

	public String[] getDisciplinas(){
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas){
		if(disciplinas.length <= 10)
			this.disciplinas = disciplinas;
	}

	public boolean adicionaDisciplina(String disciplina){
		boolean temEspaco = false, temIgual = false;
		int cont = 0;
		for(int i = 0; i < this.disciplinas.length && !temEspaco && !temIgual; i++){
			if(disciplinas[i] == null){
				this.disciplinas[i] = disciplina;
				temEspaco = true;
			}
			else if(disciplinas != null)
				if(disciplinas[i].equals(disciplina))
					temIgual = true;
			else
				cont++;
		}

		if(temEspaco && !temIgual){	
			System.out.println("Disciplina adicionada com sucesso!");
			return true;
		}
		else{
			if(cont == this.disciplinas.length){
				System.out.println("Aluno " + getNome() + " atingiu o limite máximo de disciplinas permitidas!");
			}
			else if(temIgual){
				System.out.println("Disciplina \"" + disciplina + "\" já foi adicionada!");
			}
			return false;	
		} 
	}

	public boolean removeDisciplina(String disciplina){
		boolean temIgual = false;
		for(int i = 0; i < disciplinas.length && !temIgual; i++){
			if(disciplinas != null)
				if(disciplinas[i].equals(disciplina)){
					this.disciplinas[i] = null;
					temIgual = true;
				}
		}

		if(temIgual){
			System.out.println("Disciplina removida com sucesso!");
			return true;
		}
		else{
			System.out.println("Aluno " + getNome() + " não está cursando a disciplina " + disciplina + ".");
			return false;
		}
	}

	public void imprimeInformacoesAluno(){
		System.out.println("--------------------------------------------------");
		System.out.println("Nome do aluno: " + getNome());
		System.out.println("RGA do aluno: " + getRga());
		System.out.println("Disciplinas do aluno:");

		for(int i = 0; i < getDisciplinas().length; i++){
			if(getDisciplinas()[i] != null)
				System.out.println(getDisciplinas()[i]);
		}
	}

}