import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] nums) {
		int temp;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j > 0; j--) {
				if (nums[j] < nums[j - 1]) {
					temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 75, 22, 16, 84, 19, 33, 55, 20, 10, 8 };

		insertionSort(nums);

		System.out.println("The sorted array is " + Arrays.toString(nums));
	}
}
