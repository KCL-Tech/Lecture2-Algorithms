import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					swap(i, j, nums);
				}
			}
		}
	}

	private static void swap(int pos1, int pos2, int[] elements) {
		int aux = elements[pos1];
		elements[pos1] = elements[pos2];
		elements[pos2] = aux;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 20, 55, 7, 0, 61, 18, 33 };
		
		sort(nums);

		System.out.println("The sorted array is " + Arrays.toString(nums));
	}
}
