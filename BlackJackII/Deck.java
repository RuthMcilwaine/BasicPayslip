package BlackJackII;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import static java.util.Collections.shuffle;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        addSuits();
    }

    private List addSuits() {
        for (int suitIndex = 0; suitIndex < 4; suitIndex++) {
            Suit suitValue = Suit.values()[suitIndex];

            for (int faceIndex = 0; faceIndex < 10; faceIndex++) {
                Face faceValue = Face.values()[faceIndex];
                Card card = new Card(faceValue, faceIndex + 1, suitValue);
                this.cards.add(card);
            }

            Card jack = new Card(Face.JACK, 10, suitValue);
            this.cards.add(jack);

            Card queen = new Card(Face.QUEEN, 10, suitValue);
            this.cards.add(queen);

            Card king = new Card(Face.KING, 10, suitValue);
            this.cards.add(king);
        }
        return this.cards;
    }


    public Card getCard() {
        if (cards.size() != 0) {
            Card card = cards.get(0);
            cards.remove(0);
            return card;
        }
        // make sure there is at least one card left in the card list
        //  remove a card from the cards list
        // return that card
        // }

        return null;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public String toString() {
        String output = "";
        for (Card card : cards) {
            output += card + "\n";
        }
        return output;
    }
}



