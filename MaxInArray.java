public class MaxInArray {
	public static int findMax(int[] array) {
		//Gan phan tu dau tien la phan tu lon nhat
		int max = array[0]; 
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
		
	}

}
