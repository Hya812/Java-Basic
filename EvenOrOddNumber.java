//Viết CT nhận 1 số nguyên bất kỳ và cho biết số đó là chẵn hay lẻ

import java.util.Iterator;
public class CheckEvenNumber{
	public static String checkChanLe(int number) {
		/*
		 * Lap dieu kieu Neu chia het cho la so chan, nguoc lai la so le
		 */
		if (number % 2 == 0) {
			return "So chan";
		}
		return "So le";
	}
