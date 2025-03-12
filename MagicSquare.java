//Một Ma Phuong bậc n là một sự sắp xếp n × n số, thường là các số nguyên khác nhau, trong một hình vuông, sao cho tổng các số n trong tất cả các hàng, tất cả các cột và cả hai đường chéo bằng cùng một hằng số

public class MagicSquare {
	public static boolean checkMagicSquare(int[][] matrix) {
		// Tinh hang so ma thuat
		int factor = matrix.length * (matrix.length * matrix.length + 1) / 2;
		// Kiem tra tren tung dong
		for (int i = 0; i < matrix.length; i++) {
			int sumRows = 0;
			for (int j = 0; j < matrix.length; j++) {
				sumRows += matrix[i][j];
			}
			if (sumRows != factor)
				return false;
		}
		// Kiem tra tren tung cot
		for (int j = 0; j < matrix.length; j++) {
			int sumCols = 0;
			for (int i = 0; i < matrix.length; i++) {
				sumCols += matrix[i][j];
			}
			if (sumCols != factor)
				return false;
		}
		// Kiem tren tung duong cheo
		int sumCheoPhu = 0;
		int sumCheoChinh = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumCheoChinh += matrix[i][i];
			sumCheoPhu += matrix[i][matrix.length - 1 - i];
		}
		if (sumCheoChinh != factor || sumCheoPhu != factor)
			return false;
		return true;
	}

}
