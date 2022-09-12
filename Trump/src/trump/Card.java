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

	public int compareTo(Card cardB) {
		if(this.number > cardB.number) {
			return -1;
		} else if(this.number < cardB.number) {
			return 1;
		} else {
			return 0;
		}

	}
}
