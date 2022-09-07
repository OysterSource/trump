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
			
			Deck.add(card1);
		}
		System.out.println();

	}
	/* String[] array =
	 * 
	 * /* System.out.println("add");
	 * 
	 * cardList.add(card1);
	 * 
	 * cardList.add(card2);
	 * 
	 * cardList.add(card3);
	 * 
	 * cardList.add(card4); */
	/* String[] array = { "スペード", "ハート", "ダイヤ", "クラブ" };
	 * for(int i = 1; i < 14; i++) {
	 * Card card1 = new Card("スペード", i);
	 * Card card2 = new Card("ハート", i);
	 * Card card3 = new Card("ダイヤ", i);
	 * Card card4 = new Card("クラブ", i);
	 * //faceメソッドをよびだしてコンソールに表示する
	 * System.out.println(card1.face());
	 * System.out.println(card2.face());
	 * System.out.println(card3.face());
	 * System.out.println(card4.face());
	 * } */

	private static void add(Card card1) {
		// ここにコードを挿入

	}
 public void shuffle() {
	  System.out.println("ｼｬｯﾌﾙ");
	  Collections.shuffle(cardList);
	  }
	  
	 
	/* public void add(Card card) {
	 * System.out.println("add");
	 * this.cardList.add(card);
	 * }
	 * 
	 * public Card draw() {
	 * System.out.println("ドロー");
	 * return cardList.get(0); */
}

// ここにコードを挿入
