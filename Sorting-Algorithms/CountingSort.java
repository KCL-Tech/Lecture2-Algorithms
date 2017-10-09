import java.util.Arrays;

public class CountingSort {

	public static int[] sort(int[] nums) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for (int num : nums) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}

		int[] count = new int[max - min + 1];

		for (int num : nums)
			count[num - min]++;

		int[] sortedArray = new int[nums.length];

		int index = 0;

		for (int i = 0; i < count.length; i++)
			for (int j = 0; j < count[i]; j++)
				sortedArray[index++] = i + min;

		return sortedArray;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 75, 12, 13, 84, 22, 61, 15, 39 };

		int[] sortedNums = sort(nums);

		System.out.println("The sorted array of numbers is " + Arrays.toString(sortedNums));
	}
}
