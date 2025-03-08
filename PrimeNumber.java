//Viết CT nhận 1 số nguyên bất kỳ và cho biết số có phải là số nguyên tố hay không

import java.util.Iterator;
public class PrimeNumber {
	public static boolean checkSoNguyenTo(int number) {
		// Khai bao bien count dung de dem cac uoc so cua nuber
		int count = 0;
		// Vong lap dem cac uoc so
		for (int i = 1; i <= number; i++) {
			// Kiem tra uoc so
			if (number % i == 0) {
				count++;
			}

		}
		// Neu uoc so bang 2 thi la so nguyen to
		return count == 2 ? true : false;
	}
