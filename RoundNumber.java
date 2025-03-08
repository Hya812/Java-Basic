//Viết chương trình nhận vào số thực từ bàn phím và làm tròn một số thực x thành số nguyên (Nếu phần lẻ <5 thì làm tròn xuống, ngược lại làm tròn lên. VD: 3.4 thành 3; 3.6 thành 4)

import java.util.Iterator;
public class JavaBasic_1 {
	public static int roundNumber(float number) {
		// Ep kieu lay so nguyen
		int soNguyen = (int) number;
		// Tru lay phan le va chuyen so le thanh he co so 10
		float soLe = (number - soNguyen) * 10;
		// Lap dieu kien
		if (soLe < 5) {
			return soNguyen;
		}
		return soNguyen + 1;
	}
