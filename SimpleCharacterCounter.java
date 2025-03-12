//Viet chuong trinh Java de dem cac chu so, chu cai, khoang trang va ki tu trong mot chuoi dau vao

public class SimpleCharacterCounter {
	public static void countCharacters(String str) {
		// Khai bao bien dung de dem
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // Lấy ký tự tại vị trí i trong chuỗi

			// Kiểm tra ký tự có phải là chữ cái không (A-Z hoặc a-z)
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				letter++; // Nếu đúng, tăng biến đếm chữ cái
			}
			// Kiểm tra ký tự có phải là chữ số không (0-9)
			else if (ch >= '0' && ch <= '9') {
				number++; // Nếu đúng, tăng biến đếm số
			}
			// Kiểm tra ký tự có phải là khoảng trắng không
			else if (ch == ' ') {
				space++; // Nếu đúng, tăng biến đếm khoảng trắng
			}
			// Nếu không thuộc các loại trên, tức là ký tự đặc biệt (.,!?@#$...)
			else {
				other++; // Tăng biến đếm ký tự khác
			}
		}

		// In kết quả ra màn hình
		System.out.println("Letter: " + letter);
		System.out.println("Number: " + number);
		System.out.println("Space: " + space);
		System.out.println("Other: " + other);
	}
}
