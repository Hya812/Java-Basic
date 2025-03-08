//Cho biến x và y kiểu số nguyên được nhập vào từ bàn phím (cả x và y đều khác 0). Bạn hãy xác định điểm có tọa độ (x, y) đó nằm ở góc phần tư nào.

import java.util.Scanner;

public class SelectionStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x > 0 && y > 0) {
            System.out.println("This point lies in the First quadrant");
        } else if(x < 0 && y > 0) {
            System.out.println("This point lies in the Second quadrant");
        } else if(x < 0 && y < 0) {
            System.out.println("This point lies in the Third quadrant");
        } else if(x > 0 && y < 0) {
            System.out.println("This point lies in the Fourth quadrant");
        }
    }
}
