//Bạn hãy viết chương trình nhập vào một ký tự từ bàn phím và thực hiện hiển thị ký tự tiếp trong bảng bảng chữ cái của ký tự đó ra màn hình.

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = (char)(sc.next().charAt(0) + 1);
		System.out.println(c);
	}
}
