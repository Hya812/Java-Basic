public class lab1 {
	public static int sumFirstLast(int[] array) {
    //Kiem traneu mang rong thì khong the tinh 
		if(array.length == 0) {
			System.out.println("Mang rong, khong the tinh tong");
		}
			return array[0] + array[array.length -1]; //Tong phan tu dau tien va cuoi 
	}

}
