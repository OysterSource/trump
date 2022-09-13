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
		System.out.println("元にするカード:" + cardB.face());
		System.out.println("比べられるカード:" + cardJ.face());

		System.out.println("カードBを元にする" + ":" + cardB.compareTo(cardJ));
		System.out.println("カードJを元にする" + ":" + cardJ.compareTo(cardB));
		System.out.println("カードBとカードBを比べる" + ":" + cardB.compareTo(cardB));

	}
}
