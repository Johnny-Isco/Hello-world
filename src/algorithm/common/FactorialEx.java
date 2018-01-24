package algorithm.common;

public class FactorialEx {

	public static void main(String[] args) {
		FactorialEx fx = new FactorialEx();

		System.out.println(fx.factorial(3));
		System.out.println(fx.factorialFor(3));
		System.out.println(fx.factorial(7));
		System.out.println(fx.factorialFor(7));
	}
	
	public int factorial(int n) {
		if (n <= 1)
		{
			return 1;
		}
		else
		{
			return n * factorial(n - 1);
		}
	}
	
	public int factorialFor(int n) {
		int sum = 1;
		for (int i = n; i > 0; i--) 
		{
			sum *= i;
		}
		return sum;
	}

}
