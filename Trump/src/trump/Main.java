package trump;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		System.out.println("hellow word");
		Deck deck = new Deck();
		ArrayList<String> strList = new ArrayList<String>();
		String[] array = { "スペード", "ハート", "ダイヤ", "クラブ" };
		for(int i = 1; i < 14; i++) {
			Card card1 = new Card("スペード", i);
			Card card2 = new Card("ハート", i);
			Card card3 = new Card("ダイヤ", i);
			Card card4 = new Card("クラブ", i);
			//faceメソッドをよびだしてコンソールに表示する
			System.out.println(card1.face());
			System.out.println(card2.face());
			System.out.println(card3.face());
			System.out.println(card4.face());
			deck.build();
			deck.add(card1);

			deck.add(card2);

			deck.add(card3);

			deck.add(card4);

		}
	}
}
