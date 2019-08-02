package aula_EAD_Complexidade;

public class TesteComplexidade {
	public static void main(String[] args) {
		int[] v = {1,2,3},
			  s = {1,2,3},
			  soma = new int [3];
		for(int i = 0; i < soma.length; i++) {
			soma[i] = v[i] + s[i];
		}
	}
}
