package BlackJackInheritance.BlackJackII;


import BlackJackII.Suit;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        addSuits();
    }

    private List addSuits() {

        for (int faceIndex = 0; faceIndex < 10; faceIndex++) {
            Face faceValue = Face.values()[faceIndex];

            Heart heart = new Heart(faceValue, faceIndex + 1);
            Spade spade = new Spade(faceValue, faceIndex + 1);
            Diamond diamond = new Diamond(faceValue, faceIndex + 1);
            Club club = new Club(faceValue, faceIndex + 1);

            this.cards.add(heart);
            this.cards.add(spade);
            this.cards.add(diamond);
            this.cards.add(club);

        }
        addFaceCards(Face.JACK);
        addFaceCards(Face.QUEEN);
        addFaceCards(Face.KING);

        Card queen = new Card(Face.QUEEN, 10);
        this.cards.add(queen);

        Card king = new Card(Face.KING, 10);
        this.cards.add(king);

        return this.cards;
    }

    private void addFaceCards(Face face) {
        Heart heart = new Heart(face, 10);
        this.cards.add(heart);
        Spade spade = new Spade(face, 10);
        this.cards.add(spade);
        Diamond diamond = new Diamond(face, 10);
        this.cards.add(diamond);
        Club club = new Club(face, 10);
        this.cards.add(club);
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



