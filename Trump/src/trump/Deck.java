package trump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//空のリスト宣言
	private List<Card> cardList = new ArrayList<>();

	public Deck() {
		System.out.println("デッキの初期化");

	}

	public void build() {
		//52枚のカードアレイリストに入れる
		System.out.println("ビルド" + "54枚のカードアレイリストに入れる");
		for(int i = 1; i <= 13; i++) {
			Card card1 = new Card("スペード", i);
			Card card2 = new Card("ハート", i);
			Card card3 = new Card("ダイヤ", i);
			Card card4 = new Card("クラブ", i);
			this.add(card1);
			this.add(card2);
			this.add(card3);
			this.add(card4);

		}
		Card card14 = new Card("ジョーカー", 14);
		Card card15 = new Card("ジョーカー", 15);
		this.add(card14);
		this.add(card15);
	}

	//シャッフルメソッド
	public void shuffle() {
		System.out.println("ｼｬｯﾌﾙ");
		Collections.shuffle(cardList);
		System.out.println(cardList);

	}

	//addメソッド
	public void add(Card card) {
		//System.out.println("add");
		cardList.add(card);
	}

	//ドローメソッド
	public Card draw() {
		System.out.println("ドロー");
		Card card = cardList.get(cardList.size() - 1);
		cardList.remove(cardList.size() - 1);
		return card;
	}
}
