package exercicios4;

public class Fibonacci {
	public static long fib(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}

	public static void seqFibonacci(int max) {
		if(max == 0)
			System.out.print(fib(0) + " ");
		else {
			seqFibonacci(max-1);
			System.out.print(fib(max) + " ");
		}
	}
	
	public static void main(String[] args) {
		seqFibonacci(11);
	}
}
