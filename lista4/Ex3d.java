public class Ex3d 
{
	public static void main(String [] args) 
	{
		int [] array;
		int cont;
		String msg;
		
		array = new int[10];
		
		for (cont = 0; cont < 10; cont++)
			array[cont] = cont * cont + 1;
		
		msg = "" + array[9];
		
		for (cont = 8; cont >= 0; cont--)
			msg += "," + array[cont];
		
		System.out.println(msg);
	}
}