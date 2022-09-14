package trump;

public class Main {

	public static void main2(String[] args) {
		// デッキのインスタンス化
		System.out.println("hellow word");
		Deck deck = new Deck();

		//デッキクラスでビルドしたものを呼び出す
		deck.build();

		//山札の後ろから1枚引いてシャッフルしてもう2枚引く
		deck.shuffle();
		Card card5 = deck.draw();
		Card card6 = deck.draw();
		Card card7 = deck.draw();

		//引いたカードを表示する
		System.out.println(card5.face());
		System.out.println(card6.face());
		System.out.println(card7.face());

		//デッキから最初に引いたカードを戻して再度引く
		deck.add(card5);
		deck.add(card6);
		Card card8 = deck.draw();
		Card card9 = deck.draw();
		System.out.println(card8.face());
		System.out.println(card9.face());
		for(int i = 0; i < 51; i++) {
			Card cardx = deck.draw();
			System.out.println(cardx.face());
		}
	}

	public static void main(String[] args) {
		Card cardB = new Card("スペード", 10);
		Card cardJ = new Card("ハート", 2);
		System.out.println("カードB:" + cardB.face());
		System.out.println("カードJ:" + cardJ.face());

		int v = cardB.compareTo(cardJ);
		System.out.println("カードBを元にする");
		if(v == -1) {
			System.out.println(v + ":" + "負け");
		} else if(v == 1) {
			System.out.println(v + ":" + "勝ち");
		} else if(v == 0) {
			System.out.println(v + ":" + "引き分け");
		} else {
		}

		Card cardK = new Card("ハート", 12);
		System.out.println("カードK:" + cardK.face());
		int r = cardB.compareTo(cardK);
		System.out.println("カードBを元にする");
		if(r == -1) {
			System.out.println(r + ":" + "負け");
		} else if(r == 1) {
			System.out.println(r + ":" + "勝ち");
		} else if(r == 0) {
			System.out.println(r + ":" + "引き分け");
		} else {
		}
	}

	public static void main3(String[] args) {
		Card cardX = new Card("ハート", 6);
		Card cardY = new Card("ハート", 4);
		System.out.println(cardX.face());
		System.out.println(cardY.face());
		System.out.println(cardX.compareTo(cardY));

	}
}
