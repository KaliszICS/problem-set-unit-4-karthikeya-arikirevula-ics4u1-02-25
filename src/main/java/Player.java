import java.util.ArrayList;
import java.util.List;


public class Player {
    private String name;
    private List<Card> hand;


    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }


    public void drawCard(Card card) {
        if (card != null) {
            hand.add(card);
        }
    }


    public Card playCard(int index) {
        if (index >= 0 && index < hand.size()) {
            return hand.remove(index);
        }
        return null; //what
    }


    public String getName() {
        return name;
    }

    public int handSize() {
        return hand.size();
    }


    public List<Card> getHand() {
        return new ArrayList<>(hand);
    }
}