package trump;

public class Card {
	//カードの要素を変数化
	String mark;
	static int number;

	//カードのを構成する要素の宣言
	public Card(String mark, int number) {
		//どこのオブジェクトの変数かthis.で定義する
		this.mark = mark;
		this.number = number;
	}

	public Card(int i) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//値が格納されたカードの見た目
	public String face() { // カードを表す文字列を返す
		return mark + "/" + number;

	}

	public int compareTo(Card card) {
		return number;
	}

	public static int compareTo(Card card1, Card card2) {
		return number;
	}

}