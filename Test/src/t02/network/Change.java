package t02.network;

public class Change {

	public static void main(String[] args) {
		int money;
		int[] unit = { 50000, 10000, 5000, 1000 };
		money = 498000;
		for (int i = 0; i < unit.length; i++) {
			int count = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + "원권 " + count + "장");
		}
		if (!(money == 0))
		System.out.println("동전: " + money + "원");
	}
}

//int change;
//int fiftyThousand;
//int tenThousand;
//int fiveThousand;
//int aThousand;
//int coin;

//Change c = new Change();
//c.countChange(498000);
//System.out.println("오만원권:" + c.fiftyThousand + "장");
//System.out.println("만원권:" + c.tenThousand + "장");
//System.out.println("오천원권:" + c.fiveThousand + "장");
//System.out.println("천원:" + c.aThousand + "장");
//}
//
//public void countChange(int change) {
//fiftyThousand = change/50000;
//change = change%50000;
//tenThousand = change/10000;
//change = change%10000;
//fiveThousand = change/5000;
//change = change%5000;
//aThousand = change/1000;
//change =  change%1000;
//}
