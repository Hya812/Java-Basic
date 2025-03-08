//Viết chương trình nhập từ bàn phím 3 số nguyên. Sau đó hiển thị lên màn hình số lớn nhất trong 3 số này.

import java.util.Scanner;

public class Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}
}
