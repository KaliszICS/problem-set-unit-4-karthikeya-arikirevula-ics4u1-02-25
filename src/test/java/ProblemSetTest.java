import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProblemSetTest {

    @Test
    public void bruh() {
        Card card = new Card("Hearts", "Ace");
        assertEquals("Ace of Hearts", card.toString());
    }

    @Test
    public void java() {
        Card card = new Card("Diamonds", "10");
        assertEquals("Diamonds", card.getSuit());
        assertEquals("10", card.getRank());
    }

    @Test
    public void is() {
        Deck deck = new Deck();
        assertEquals(52, deck.size());
    }

    @Test
    public void so() {
        Deck deck = new Deck();
        Card drawn = deck.drawCard();
        assertNotNull(drawn);
        assertEquals(51, deck.size());
    }

    @Test
    public void annoying() {
        Deck deck = new Deck();
        deck.shuffle();
        assertEquals(52, deck.size());
    }

    @Test
    public void to() {
        DiscardPile pile = new DiscardPile();
        Card card = new Card("Clubs", "Jack");
        pile.addCard(card);
        assertEquals(1, pile.size());
        assertEquals("Jack of Clubs", pile.topCard().toString());
    }

    @Test
    public void code() {
        Player player = new Player("Alex");
        Card card = new Card("Spades", "Queen");

        assertEquals(0, player.handSize());
        player.drawCard(card);
        assertEquals(1, player.handSize());

        Card played = player.playCard(0);
        assertEquals("Queen of Spades", played.toString());
        assertEquals(0, player.handSize());
    }

    @Test
    public void and() {
        Player player = new Player("Jamie");
        Card result = player.playCard(0);
        assertNull(result);
    }

    @Test
    public void program() {
        Player player = new Player("Sam");
        player.drawCard(new Card("Diamonds", "2"));
        List<Card> handCopy = player.getHand();
        assertEquals(1, handCopy.size());
        assertNotSame(handCopy, player.getHand()); 
    }
}
