package exercicios4;

public class MaiorMatriz {

//	public static int maiorMatriz(int[][] matriz, int i) {
//		return maiorMatriz(matriz, i, matriz[0].length);
//	}
//
//	public static int maiorMatriz(int[][] matriz, int i, int j) {
//		int maior,
//			maiorLinha;
//		
//		if (i == 1 && j == 1)
//			return matriz[0][0];
//		
//		else if (i == 1 && j > 1) {
//			return maiorMatrizLinha(matriz, i-1, j);
//		} 
//		
//		else {
//			maiorLinha = maiorMatrizLinha(matriz, i-1, j);
//			maior = maiorMatriz(matriz, i-1, j);
//			
//			if(maior < maiorLinha)
//				maior = maiorLinha;
//			
//			if (matriz[i-1][j-1] < maior)
//				return maior;
//			else
//				return matriz[i-1][j-1];
//		}
//	}
//
//	public static int maiorMatrizLinha(int[][] matriz, int i, int j) {
//		int maior;
//		
//		if (j == 1)
//			return matriz[i][0];
//		else {
//			maior = maiorMatrizLinha(matriz, i, j-1);
//			
//			if (maior > matriz[i][j - 1])
//				return maior;
//			else
//				return matriz[i][j - 1];
//		}
//	}
			public static int maiorMatriz(int [][] matriz, int i, int j) 
			{
							
				if (i == matriz.length-1)
					return matriz[i][i];
				
				else 
				{
					int temp = maiorLinha(matriz, i, j);
					int temp2 = maiorMatriz(matriz, i+1,j);
					
					if (temp < temp2) 
						return temp = temp2 ;
					
					if(temp > matriz[i+1][j]) { 
						return temp;
					}
					else	
						return matriz[i+1][j];
				}
			}
			
			public static int maiorLinha(int [][] matriz,int i, int j) {
									
				if(j == matriz.length-1)
						return matriz [i][j];
					
				else 
				{
						
					int tempLinha = maiorMatriz(matriz, i, j+1);
						
					if(tempLinha > matriz[i][j]) 
						return tempLinha;
					
					else	
						return matriz[i][j];
				}
				
			}
			
			public static int maiorMatriz(int [][] matriz, int i)
			{
				return maiorMatriz(matriz, i, 0);		
			}
				
	public static void main(String[] args) {
		int[][] matriz = { { 673 } }, 
				matriz2 = { { 9, 7, 8 } }, 
				matriz3 = { { 10, 30, 60 }, {70, 50, 20 } },
				matriz4 = { { 61, 50, 73 }, { 84, 45, 96 }, { 107, 318, 19 } };

//		System.out.println(maiorMatriz(matriz, matriz.length));
//		System.out.println(maiorMatriz(matriz2, matriz2.length));
//		System.out.println(maiorMatriz(matriz3, matriz3.length));
		System.out.println(maiorMatriz(matriz4, 0));
	}
}
