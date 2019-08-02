package aula_EAD_Complexidade;

public class SomaVetores {
//	public static int[] somaVetores(int[] vet1, int[] vet2) {
//		int[] vetSoma, vetMaior, vetMenor;
//		
//		if(vet1.length > vet2.length) {
//			vetMaior = vet1;
//			vetMenor = vet2;
//			vetSoma = new int [vetMaior.length];
//		} else {
//			vetMaior = vet2;
//			vetMenor = vet1;
//			vetSoma = new int [vetMaior.length];
//		}
//		
//		for(int i = 0; i < vetSoma.length; i++) {
//			if(i > vetMenor.length-1)
//				vetSoma[i] = vetMaior[i];
//			else
//				vetSoma[i] = vetMaior[i] + vetMenor[i];
//		}
//		
//		return vetSoma;
//	}
	
	public static int[] somaVetores(int[] vet1, int[] vet2) {
		int[] vetSoma, vetMaior, vetMenor;
		
		if(vet1.length > vet2.length) {
			vetMaior = vet1;
			vetMenor = vet2;
			vetSoma = new int [vetMaior.length];
		} else {
			vetMaior = vet2;
			vetMenor = vet1;
			vetSoma = new int [vetMaior.length];
		}
		
		for(int i = 0; i < vetMenor.length; i++) {
			vetSoma[i] = vetMaior[i] + vetMenor[i];
		}
		
		for(int i = vetMenor.length; i < vetSoma.length; i++)
			vetSoma[i] = vetMaior[i];
			
		return vetSoma;
	}
	
	public static void main(String[] args) {
		int[] vet1 = {1,2,3},
			  vet2 = {1,2,3,4,5};
		
		for(int p : somaVetores(vet1, vet2)) {
			System.out.println(p);
		}
	}
	
	
}
