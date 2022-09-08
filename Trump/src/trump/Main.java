package trump;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		System.out.println("hellow word");
		Deck deck = new Deck();

		deck.build();

		Card card5 = deck.draw();
		deck.shuffle();
		Card card6 = deck.draw();
		Card card7 = deck.draw();

		System.out.println(card5.face());
		System.out.println(card6.face());
		System.out.println(card7.face());

		deck.add(card5);
		Card card8 = deck.draw();
		System.out.println(card8.face());
	}
}
