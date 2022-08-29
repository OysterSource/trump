package trump;

public class Deck {
	public Deck() {
		System.out.println("デッキの初期化");
		Card card3 = new Card("ダイヤ", 7);
	}

	public void build() {
		System.out.println("ビルド");

	}

	public void add() {
		System.out.println("アド");
	}

	public void draw() {
		System.out.println("ドロー");

	}

}