public class Ex7_d{
	public static void main (String [] args){
		String [] vetor = {"DOIS", "TRES", "UM", "SETE"},
		vetor2 = {"QUATRO", "SEIS", "CINCO", "OITO"};
		String [][] matriz = {vetor, vetor2};
		for(int i = 0; i < matriz.length; i++)
			for(int j = 0; j < matriz[i].length; j++)
				System.out.println(i + " " + j + " (" + matriz[i][j] + ").");
		}
	}