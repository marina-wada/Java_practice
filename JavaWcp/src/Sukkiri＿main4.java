
public class Sukkiri＿main4 {
	public static void main(String[] args) {
		//4-4
		/*
		int[] scores = new int[5];
		int num = scores.length;
		System.out.println("要素の数: " + num);
		*/

		//4-5
		/*
		int[] scores;
		scores = new int[5];
		scores[1] = 30;
		System.out.println(scores[1]);
		*/

		//4-7
		/*
		int[] scores = new int[5];
		System.out.println(scores[0]);
		*/

		//4-8
		/*
		int [] scores = {20, 30, 40, 50, 80};
		int sum = scores[0] + scores[1] +scores[2] + scores[3] +scores[4];
		int avg = sum / scores.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
		 */

		//4-9
		/*
		int [] scores = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		*/

		//4-10
		/*
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
		*/

		//4-11
		/*
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50 ) {
				count++;
			}
		}
		System.out.println("50点以上の科目数は：" + count);
		*/

		//4-12
		/*
		int[] seq = new int[10];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}

		for (int i = 0; i < seq.length; i++) {
			/*
			switch(seq[i]) {
			case 0:
				System.out.println("A ");
				break;
			case 1:
				System.out.println("T ");
				break;
			case 2:
				System.out.println("G ");
				break;
			case 3:
				System.out.println("C ");
				break;
			}

			char[] base = {'A', 'T', 'G', 'C'};
			System.out.print(base[seq[i]] + " ");
		}
		*/

		//4-14
		/*
		int[] scores = {20, 30, 40, 50, 80};
		for (int value : scores) {
			System.out.println(value);
		}
		*/

		//4-15
		/*
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		*/

		//4-16
		/*
		boolean judge = true;
		if (judge == true) {
			int[] array = {1, 2, 3};
		}
		*/

		//4-17
		/*
		int[] array = {1, 2, 3};
		array = null;
		array[0] = 10;
		*/

		/*
		String str = "Javaで開発";
		System.out.println(str.length())q;
		*/

		//4-18
		/*
		int [][] scores = new int [2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		System.out.println(scores[1][1]);
		*/
		//4-19
		/*
		int[][] scores = {{40, 50, 60,70,80}, {80, 60, 70, 90}};
		System.out.println(scores.length);
		System.out.println(scores[1].length);
		*/

		//practice4-1
		/*
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		*/

		//practice4-2
		/*
		int[] moneyList = {121902, 8302, 55100};
		for(int i = 0; i < moneyList.length; i++){
			System.out.println(moneyList[i]);
		}
		for(int v : moneyList) {
			System.out.println(v);
		}
		*/

		//practice4-4
		int [] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		for(int i: numbers ) {
			if(input == i) {
				System.out.println("アタリ！");
			}
		}
	}

}