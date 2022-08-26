package card;

import java.awt.List;

class Card {

	//マーク
	int suit;
	// 数字
	int no;
}

//　山札クラス
public class Deck {
	// カードの総数
	final int TOTAL_CARD = 52;
	// 数字とマークを持ったカードを格納する変数を作る
	private List card_list;
	//次に引かれるカードの変数に初期値を入れる
	private int card_next = 0;
}
