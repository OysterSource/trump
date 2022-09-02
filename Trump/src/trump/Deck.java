package trump;

public class Deck {
	public Deck() {
		System.out.println("デッキの初期化");
		Card card = new Card("ダイヤ", 7);
	}

	public void build() {
		System.out.println("ビルド");

	}
	private Card c1;

	public void add(Card card) {
		System.out.println("add");
		this.c1 = card;

	}

	public Card draw() {
		System.out.println("ドロー");

		return this.c1;

	}
}