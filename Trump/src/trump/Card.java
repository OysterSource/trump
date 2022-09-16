package trump;

public class Card {
	//カードの要素を変数化
	String mark;
	int number;

	//カードのを構成する要素の宣言
	public Card(String mark, int number) {
		//どこのオブジェクトの変数かthis.で定義する
		this.mark = mark;
		this.number = number;
	}

	//値が格納されたカードの見た目
	public String face() { // カードを表す文字列を返す
		return this.mark + "/" + this.number;
	}

	public int compareTo(Card card) {
		if(this.number < card.number) {
			return -1;
		} else if(this.number > card.number) {
			return 1;
		} else {
			return 0;
		}
	}

	public boolean compareMark(Card card) {
		if(this.mark == card.mark) {
			return true;
		} else if(this.mark != card.mark) {
			return false;
		} else {
			return false;
		}
	}

	public int getNumber() {
		return this.number;
	}

	public int compareTo1(Card card) {
		if(this.number < card.number) {
			return -1;
		} else if(this.number > card.number) {
			return 1;
		} else {
			return 0;
		}
	}

	public static boolean hasOnePair(Card cardH, Card cardI, Card cardJ, Card cardK, Card cardL) {
		if(cardH.number == cardI.number) {
			return true;
		}
		if(cardH.number == cardJ.number) {
			return true;
		}
		if(cardH.number == cardK.number) {
			return true;
		}
		return false;

	}

	public static boolean hasTwoPair(Card card) {

		if(card.mark == card.mark) {
			return true;
		} else if(card.mark != card.mark) {
			return true;
		} else {
			return false;
		}
	}
}
