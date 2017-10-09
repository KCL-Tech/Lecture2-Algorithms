public class TailRecursion {

	public static int recursiveFactorial(int n) {
		if (n <= 0) {
			return 1;
		}
		return n * recursiveFactorial(n - 1);
	}

	public static void main(String[] args) {
		int number = 10;
		int factorial = recursiveFactorial(number);

		System.out.println(String.valueOf(number) + " factorial is " + String.valueOf(factorial));
	}
}
