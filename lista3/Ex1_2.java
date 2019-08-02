public class Ex1_2
{
	public static void main(String[] args) 
	{
		int cont, prod = 1;
		for (cont = 1; cont < 16; cont += 2)
		{
			prod = prod * cont;
		}	
		System.out.println(prod);
	}
}