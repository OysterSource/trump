package trump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cardList = new ArrayList<>();

	public Deck() {
		System.out.println("デッキの初期化");

	}

	public void build() {
		//52枚のカードアレイリストに入れる
		System.out.println("ビルド" + "52枚のカードアレイリストに入れる");
		for(int i = 1; i < 14; i++) {
			Card card1 = new Card("スペード", i);
			Card card2 = new Card("ハート", i);
			Card card3 = new Card("ダイヤ", i);
			Card card4 = new Card("クラブ", i);
			this.add(card1);
			this.add(card2);
			this.add(card3);
			this.add(card4);

			System.out.println(card1.face());
			System.out.println(card2.face());
			System.out.println(card3.face());
			System.out.println(card4.face());
		}
	}

	public void shuffle() {
		System.out.println("ｼｬｯﾌﾙ");
		Collections.shuffle(cardList);
		System.out.println(cardList);

	}

	public void add(Card card) {
		//System.out.println("add");
		cardList.add(card);
	}

	public Card draw() {
		System.out.println("ドロー");
		Card card = cardList.get(0);
		cardList.remove(0);
		return card;

	}
}

// ここにコードを挿入
