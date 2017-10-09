import java.util.Arrays;

public class BinaryRecursion {

	public static int binarySum(int[] array, int start, int count) {
		if (count <= 1) {
			return array[start];
		}

		return binarySum(array, start, count / 2) + binarySum(array, start + count / 2, count / 2);
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

		int sum = binarySum(nums, 0, nums.length);

		System.out.println("The sum of all the numbers in the array " + Arrays.toString(nums) + " is " + String.valueOf(sum));
	}
}
