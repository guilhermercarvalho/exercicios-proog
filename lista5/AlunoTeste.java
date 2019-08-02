import java.util.Scanner;

public class AlunoTeste
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = teclado.nextLine();

		System.out.print("Digite o RGA do aluno: ");
		String rgaAluno = teclado.next();

		Aluno al1 = new Aluno(nomeAluno, rgaAluno);
		
		System.out.println("Quantas disciplinas deseja adcionar?");
		int numDisciplina = teclado.nextInt();
		teclado.nextLine();

		String disciplina;
		for(int i = 0; i < numDisciplina; i++){
			System.out.println("Digite a " + (i + 1) + " disciplina: ");
			disciplina = teclado.nextLine();
			al1.adicionaDisciplina(disciplina);
		}

		al1.imprimeInformacoesAluno(); 
	}
}