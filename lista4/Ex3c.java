public class Ex3c
{
	public static void main (String [] args)
	{
		String [] vetor = {"DOIS", "TRES", "UM"}, vetor2 = vetor;
		int cont = 0;
		for(int i = 0; i < vetor.length; i++){
			System.out.println(vetor2[vetor2.length - i - 1]);
		}
		vetor2 = new String [3];
		for(int i = 0; i < vetor2.length; i++){
			System.out.println(vetor2[vetor2.length - i - 1] + " " + vetor[vetor.length - i - 1]);
		}
		while(cont < vetor2.length && vetor2[cont] != null && vetor2[cont].equals(vetor[cont])){
			System.out.println(vetor2[cont]);
			cont++;
		}
	}
}