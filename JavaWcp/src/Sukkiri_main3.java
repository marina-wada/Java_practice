
public class Sukkiri_main3 {
	public static void main(String[] args) {
		//3-1
		/*
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
		}
		*/

		//3-2
		/*
		boolean doorClose = false;
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
		*/

		//3-5
		/*
		System.out.println("あなたの運勢を占います");
		int fortune = 1;
		switch(fortune) {
			case 1:
				System.out.println("大吉");
			case 2:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
		*/

		//3-6
		/*
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch(fortune) {
			case 1:
			case 2:
				System.out.println("いいね！");
				break;
			case 3:
				System.out.println("普通です");
				break;
			case 4:
			case 5:
				System.out.println("うーん...");
		}
		*/

		//3-7
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println("こんにちわ");
		}
		*/

		//3-8
		/*
		for (int i = 0; i < 10;) {
			System.out.print("現在" + (i + 1) + "周目→");
		}
		*/

		//3-9
		/*
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
		*/

		//p3-1
		/*
		weight == 60
		(age1 + age2) * 2 > 60
		age % 2 == 1
		name.equals("湊")
		*/

		//p3-3
		/*
		int isHungry = 0;
		String food = "おにぎり";

		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		*/

		//p3-4
		/*
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}
		*/

		//3-5
		/*
		System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		case 1:
			System.out.print("検索します");
			break;

		case 2:
			System.out.print("登録します");
			break;

		case 3:
			System.out.print("削除します");
			break;

		case 4:
			System.out.print("変更します");
			break;
		}
		*/

		//3-6
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0〜9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System .out.println("ゲームを終了します");
	}



}
