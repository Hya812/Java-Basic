//Cho 2 biến kiểu số nguyên a và b được nhập từ bàn phím, bạn hãy viết chương trình hoán đổi giá trị của biến a và biến b. 

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a; a = b; b = c;
		System.out.println("After swapping, a = " + a + ", b = " + b);
	}
}
