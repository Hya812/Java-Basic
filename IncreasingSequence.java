//Viết chương trình nhập từ bàn phím 3 số nguyên a, b, c. Sau đó hãy kiểm tra xem a, b, c có tạo thành một dãy số tăng dần hoặc giảm dần hay không

import java.util.Scanner;

public class Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    if (a <= b && b <= c) {
	        System.out.println("increasing");
	    } else if (a >= b && b >= c) {
	    	System.out.println("decreasing");
	    } else {
	    	System.out.println("neither increasing nor decreasing order");
	    }
	}
}
