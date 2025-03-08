//Viết CT nhận 1 số nguyên bất kỳ và cho biết so co phai la so hoan hao khong

import java.util.Iterator;
public class PerfectNumber {
	public static boolean checkSoHoanHao(int number) {
		// Khai bao bien sum de tinh tong cac uoc so cua number
		int sum = 0;
		// Vong lap tinh tong cac uoc so
		for (int i = 1; i < number; i++) {
			// Kiem tra uoc so va tinh tong cac uoc so thoa man dieu kien
			if (number % i == 0) {
				sum += i;
			}
		}
		// Neu tong cac uoc so bang so nguyen thi la so hoan hao
		return sum == number ? true : false;
	}

