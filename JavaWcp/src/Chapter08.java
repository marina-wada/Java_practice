
public class Chapter08 {
	public static void main(String[] args) {
		//1以上5未満の数の2乗を出力
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}

		int array[] = {1, 16, 24, 25 };
		for (int i = 0; i < array.length; i++ ) {
			System.out.println(array[i]);
		}

		for ( int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}


}
