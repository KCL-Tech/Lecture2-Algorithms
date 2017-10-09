import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] nums) {
		int first, temp;

		for (int i = 0; i < nums.length; i++) {
			first = i;

			for (int j = i; j < nums.length; j++) {
				if (nums[j] < nums[first])
					first = j;
			}
			
			temp = nums[first];
			nums[first] = nums[i];
			nums[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 10, 20, 59, 78, 16, 0, 51, 38, 7, 22 };

		sort(nums);

		System.out.println("The sorted array is " + Arrays.toString(nums));
	}
}
