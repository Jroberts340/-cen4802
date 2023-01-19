package assignment2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int nth = 10;
		
		System.out.println("The F" + nth + " term of the Fibonacci sequence is: " + nthPlace(nth));

	}
	
	static int n1 = 0, n2 = 1, n3 = 0, fib = 0;
	
//	public static int nthPlace (int n) {
//		
//		if (n == 0 || n == 1) {
//			return n;
//		}
//		else if (n > 0) {
//			fib = n1 + n2;
//			n1 = n2;
//			n2 = fib;
//			nthPlace(n - 1);
//		}
//		
//		return fib;
//	}
	
	public static int nthPlace(int n) 
	{
		if (n <= 1)
			return n;
		
		return nthPlace(n-1) + nthPlace(n-2);
	}

}
