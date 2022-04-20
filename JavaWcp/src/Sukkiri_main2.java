
public class Sukkiri_main2 {
	public static void main(String[] args) {
		//2-1
		/*
		int a;
		int b;
		a = 20;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);
		*/

		//2-2,2-3
		/*
		System.out.println("私の好きな記号は二重引用符(\")です");
		*/

		//2-4
		/*
		int a;
		a = 100;
		a++;
		System.out.println(a);
		*/

		//2-5
		/*
		float f = 3;
		double d = f;
		System.out.println(f);
		System.out.println(d);
		*/

		//2-6
		/*
		//int a = 3.2;
		byte b = 3;
		System.out.println(b);
		*/

		//2-7
		/*
		int age = (int)3.2;
		System.out.println(age);
		*/

		//2-8
		/*
		double d = 8.5 / 2;
		long l = 5 + 2L;
		System.out.println(d);
		System.out.println(l);
		*/

		//2-9
		/*
		String msg = "私の年齢は" + 23;
		System.out.println(msg);
		*/

		//2-10
		/*
		String name = "すがわら";
		String message;
		message = name + "さん、こんにちは";
		System.out.println(message);
		*/

		//2-11
		/*
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.print("です");
		*/

		//2-12
		/*
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きい方は…" + m );
		*/

		//2-13
		/*
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n+1) + "歳になりますね");
		*/

		//2-14
		/*
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		*/

		//2-15
		/*
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
		*/

		//practice2-1
		/*
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		System.out.println(ans);
		*/

		//practice2-3
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune =new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name +"さん、あなたの運気番号は" + fortune +"です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");


	}

}
