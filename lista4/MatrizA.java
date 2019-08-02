public class MatrizA
{
	public static void main (String [] args)
	{
		String msg = "";

		// A
		int mat [][] = new int[10][20];
		for(int i = 0; i < mat.length; i++)
			for(int j = 0; j < mat[i].length; j++){
				mat[i][j] = i + j;
				msg += mat[i][j] + " ";
			}
		System.out.println(msg);
		msg = "";

		// B
		double[][] matDouble = new double[5][10];
		for(int i = 0; i < matDouble.length; i++)
			for(int j = 0; j < matDouble[i].length; j++){
				matDouble[i][j] = (i + j) / 2;
				msg += matDouble[i][j] + " ";
			}

		System.out.println("\n"+msg);
		msg = "";


		String[][] matString = new String [10][10];
		for(int i = 0; i < matString.length; i++)
			for(int j = 0; j < matString[i].length; j++){
				matString[i][j] = "Posição " + i + " " + j;
				msg += matString[i][j] + "--";
			}

		System.out.println("\n"+msg);
	}
}