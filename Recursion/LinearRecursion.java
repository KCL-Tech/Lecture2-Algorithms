import java.util.Arrays;

public class LinearRecursion {

	public static int linearSum(int[] array, int n) {
		if (n == 0) {
			return array[0];
		}
		return linearSum(array, n - 1) + array[n];
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // summed we should get 55
		
		int sum = linearSum(nums, nums.length - 1);

		System.out.println("The sum of the numbers in the array " + Arrays.toString(nums) + " is " + String.valueOf(sum));
	}
}
