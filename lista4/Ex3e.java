public class Ex3e
{
	public static void main (String [] args)
	{
		String [] vetor = {"DOIS", "TRES", "UM"}, 
		vetor2 = {"QUATRO", "SEIS", "CINCO"};
		String [][] matriz = {vetor, vetor2};

		int tmn = matriz.length + matriz[1].length;
		System.out.print(tmn+"\n\n");
		for(int i = 0; i < matriz.length; i++){
			//System.out.println(matriz[i][0] + "\n");
			for(int j = 0; j < matriz[i].length; j++){
	//			System.out.print(matriz[0][j] + "\n");
				System.out.println(matriz[i][j]);
			}
			
		}
	}
}