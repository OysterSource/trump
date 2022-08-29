package trump;

public class Card {
	String mark;
	int number;

	public Card(String mark, int number) {
		//どこのオブジェクトの変数かthis.で定義する
		this.mark = mark;
		this.number = number;
	}

	public String face() { // カードを表す文字列を返す
		return mark + "/" + number;
	}
}