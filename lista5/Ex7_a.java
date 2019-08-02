public class Ex7_a{
	private int [] valores;
	
	public Ex7_a(){
		valores = new int [10];
		for(int i = 0; i < valores.length; i++)
		valores[i] = 2 * i + 5;
	}
	public void imprime(){
		for(int i = 0; i < valores.length; i++)
		System.out.println(valores[i]);
	}

	public static void main (String [] args){
		Ex7_a exemplo = new Ex7_a();
		exemplo.imprime();
	}
}