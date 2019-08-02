package exercicios4;

public class Boom {
	public static void boom(int x) {
		if(x == 0)
			System.out.println("boom!");
		else {
			System.out.print(x-- + " ");
			boom(x);
		}
	}
	
	public static void main(String[] args) {
		boom(5);
		boom(3);
		boom(0);
	}
}

//	public void boom(int x) {
//		if (x == 0)
//			System.out.println("boom!");
//		else {
//			System.out.print(x-- + " ");
//			boom(x);
//		}
//	}
//
//	public static void main(String[] args) {
//		Boom c1 = new Boom();
//
//		c1.boom(5); c1.boom(3); c1.boom(0);
//	}
//}
