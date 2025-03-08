//Xác định số chữ số của 1 số nguyên bắt kỳ

import java.util.Iterator;
public class CountDigit {
	public static int countDigit(int num) {
		// Khai bao bien count dung de dem cac ky so
		int count = 0;
		if (num == 0) {
			System.out.println("n phai la so nguyen duong");
			return 0;
		} else {
			int temp = num;
			for (; temp != 0;) {
				count++;
				temp = temp / 10;
			}
		}
		return count;

	}

}
