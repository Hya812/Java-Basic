public class CountOccurrences {
	public static int countOccurrences(int[] arr, int k) {
		int count = 0; //Gan gia tri cho bien dem bang 0
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				count ++; //Neu phan tu bang k tang bien dem len 1
			}
		}
		return count;
		
	}

}
