
public class Variable05 {
	public static void main(String[] args) {
		//整数型
		//long long1 = 9223372036854775807;　'L'がないのでコンパイルエラー
		long long2 = 9223372036854775807L;
		//System.out.println(long1);
		System.out.println(long2);
		short short1 = 32767;
		byte byte1 = 127;
		System.out.println(short1);
		System.out.println(byte1);

		//浮動小数型
		double double1 = 1234567.89;
		double double2 = 1234567.89d;
		//float float1 = 0.123; 'f'がないのでコンパイルエラー
		float float2 = 0.123f;
		System.out.println(double1);
		System.out.println(double2);
		//System.out.println(float1);
		System.out.println(float2);

		//論理型
		boolean boolean1 = true;
		boolean boolean2 = false;
		System.out.println(boolean1);
		System.out.println(boolean2);

		//文字型
		char char1 = 'あ';
		char char3 = 'A';
		//char char2 = 'AB' コンパイルエラー
		char char4 = 0x3042;
		//'あ';
		System.out.println(char1);
		System.out.println(char3);
		//System.out.println(char2);
		System.out.println(char4);

		//文字列クラス
		String string1 = "あいう";
		System.out.println(string1);

		//ボクシング
		Integer integer1 = 5;
		Integer integer2 = Integer.valueOf(5);
		int int1 = integer1;
		//int int2 = integer2.intValue();
		System.out.println(integer1);
		System.out.println(integer2);
		System.out.println(int1);
		//System.out.println(int2);

		//配列
		int[] array1 = new int[3];
		array1[0] = 60;
		array1[2] = 20;
		array1[1] = 20;
		int int2 = array1[2];
		int array2[] = null;
		System.out.println(array1);
		System.out.println(int2);
		System.out.println(array2);

		int[] array3 = new int[] { 10, 20, 50 };
		int[] array4 = { 10, 20, 50 };
		System.out.println(array3);
		System.out.println(array4);
	}

}