public class Ex1
{
	public static void main(String[] args)
	{

		int cont = 1, num=1, teste=0;

		for (cont = 1; cont < 16; cont++)
		{
			if (cont % 2 != 0)
			{
				num *= cont;
			}
		}
		System.out.println(num);
	}
}
