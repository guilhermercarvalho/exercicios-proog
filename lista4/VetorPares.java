import java.util.Scanner; 
public class VetorPares { 
	public static void main(String [] args) { 
		Scanner teclado = new Scanner (System.in); 
		int [] pares; 
		int cont, valmax; 
		String msg = "";
		
		System.out.println("Qual eh o número de elementos?");
		valmax = teclado.nextInt();

		/* Alocação do vetor com o número de elementos fornecidos */
		pares = new int [valmax];

		for (cont = 0; cont < valmax; cont++){ 
			if((cont + 1) % 2 == 0){	
			/* Atribui o número par esperado */
				pares[cont] = (cont + 1);
				msg += pares[cont] + " ";
			}
		}
		/* Atribua a msg os elementos no vetor*/ 
		System.out.println(msg); 
	} 
}