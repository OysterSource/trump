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
			System.out.println("Bの負け");
			return -1;
		} else if(this.number < cardB.number) {
			System.out.println("Bの勝ち");
			return 1;
		} else {
			System.out.println("引き分け");
			return 0;
		}
	}

	public String compareTo1(Card cardX) {
		if(this.mark == cardX.mark) {

		}
		return mark;
	}
}
