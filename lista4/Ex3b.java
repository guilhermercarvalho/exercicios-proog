public class Ex3b
{
	public static void main (String [] args)
	{
		String [] vetor = {"DOIS", "TRES", "UM"};
		for(int i = 0; i < vetor.length; i++)
			System.out.println(vetor[vetor.length - i - 1]);
	}
}