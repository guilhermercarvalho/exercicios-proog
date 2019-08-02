public class Ex1_1
{
	public static void main(String[] args) 
	{
		int cont=1, prod = 1;
		while (cont <= 15)
		{
			prod *= cont;
			cont +=2;

		}
		System.out.println(prod);
	}
}