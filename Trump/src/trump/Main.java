package trump;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		System.out.println("hellow word");
		Deck deck = new Deck();
		Card card1 = new Card("スペード", 10);
		Card card2 = new Card("ハート", 5);
		Card card3 = new Card("ダイヤ", 7);
		//faceメソッドをよびだしてコンソールに表示する
		System.out.println(card1.face());
		System.out.println(card2.face());
		System.out.println(card3.face());
	}
}
