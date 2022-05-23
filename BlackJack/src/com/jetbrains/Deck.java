package com.jetbrains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck extends Object{
    private List<Card> cards = new ArrayList<Card>();

    public Deck() {
        cards.addAll(createCardsFor("diamonds"));
        cards.addAll(createCardsFor("hearts"));
        cards.addAll(createCardsFor("clubs"));
        cards.addAll(createCardsFor("spades"));
    }

    private List<Card> createCardsFor(String suit) {
        List<Card> cardsForSuit = new ArrayList<Card>();
        cardsForSuit.add(new Card("king", suit, 10));
        cardsForSuit.add(new Card("queen", suit, 10));
        cardsForSuit.add(new Card("jack", suit, 10));
        cardsForSuit.add(new Card("ace", suit, 1));

        for (int i = 2; i <= 10; i++) {
            cardsForSuit.add(new Card(Integer.toString(i), suit, i));
        }

        return cardsForSuit;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getCard() {
        Card card = cards.remove(0);
        return card;
    }

}



