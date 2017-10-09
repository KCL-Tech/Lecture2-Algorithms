import java.util.Arrays;

public class Divide {

	public static int sum(int low, int high, int[] array) {
		if (low == high) {
			return array[low];
		}
		return sum(low, (low + high) / 2, array) + sum((low + high) / 2 + 1, high, array);
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 23, 41, 0, 123, 11, 7, 55, 92 };

		int daqSum = sum(0, nums.length - 1, nums);
		
		System.out.println("The sum of the numbers " + Arrays.toString(nums) + " is " + String.valueOf(daqSum));
	}
}
