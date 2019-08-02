public class Ex1_3
{
	public static void main(String[] args) 
	{
		int cont=1, prod = 1;
		
		do 
		{
			prod *= cont;
			cont += 2;			
		} while (cont < 16);

		System.out.println(prod);
				
	}
}