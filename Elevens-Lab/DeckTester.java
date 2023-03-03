/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    /**
     * The main method in this class checks the Deck operations for consistency.
     * 
     * @param args is not used.
     */
    public static void main(String[] args) {
        // FIRST DECK
        String[] ranks = { "A", "B", "C" };
        String[] suits = { "Giraffes", "Lions" };
        int[] values = { 2, 1, 6 };
        Deck newDeck = new Deck(ranks, suits, values);
        newDeck.deal();
        System.out.println(newDeck.toString());

        newDeck.shuffle();
        System.out.println(newDeck.toString());
        newDeck.shuffle();
        System.out.println(newDeck.toString());

        // String[] suits1 = {"Hearts","Diamonds","Spades","Clubs"};
        // int[] values1= {1,2,3,4,5,6,7,8,9,10,11,12,13};
        // String[] ranks1 =
        // {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        // Deck cards = new Deck(ranks1,suits1,values1);
        // cards.shuffle();
        // System.out.println(cards.toString());
    }
}


