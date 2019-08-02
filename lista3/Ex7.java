public class Ex7
{
	public static void main(String[] args)
	{
		String msg = "";
		for (int i = 1; i <= 5; i++){
			for(int j = 1; j <= 3; j++){
				for(int k = 1; k <= 4; k++)
					msg = msg + "*";
					msg = msg + "\n";
				}
				msg = msg + "\n";
		}
		System.out.println(msg);
	}
}
