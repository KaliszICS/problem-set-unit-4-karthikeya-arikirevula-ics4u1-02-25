import java.util.ArrayList;
import java.util.List;


public class DiscardPile {
    private List<Card> pile;


    public DiscardPile() {
        pile = new ArrayList<>();
    }

    public void addCard(Card card) {
        pile.add(card);
    }


    public Card topCard() {
        if (!pile.isEmpty()) {
            return pile.get(pile.size() - 1);
        }
        return null;
    }

    public int size() {
        return pile.size();
    }
}