public class ValidNumbers {
	public static void validNumbers(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0 && arr[i] <= 10) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
