package algorithm.common;

public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		
		System.out.println(fibo.fibo(5));	// 1, 1, 2, 3, "5"
		System.out.println(fibo.fibo(6));	// 1, 1, 2, 3, 5, "8"
		System.out.println(fibo.fiboFor(3));	// 1, 1, "2"
	}
	public int fibo(int n) {
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return fibo(n - 2) + fibo(n - 1);
		}
	}
	public int fiboFor(int n) {
		int s1 = 1, s2 = 1, temp = s1 + s2;
		
		for (int i = 2; i < n; i++)
		{
			s1 = s2;
			s2 = temp;
			temp = s1 + s2;
		}
		
		return s2;
	}
}
