public class Ex3a
{
	public static void main (String[] args)
	{
		int [] vet = new int [5];
		double [] vet2 = new double [5];

		for(int i = 0; i < 5; i++)
		{
			vet[i] = i + 5;
			vet2[i] = vet[i];
			System.out.println("Valor "+i+" : "+vet2[i]);
		}
	}
}