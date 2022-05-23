package com.jetbrains;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    List<Card> cards = new ArrayList<>();

    private Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
    }

    public Integer play() {
        cards.add(deck.getCard());
        cards.add(deck.getCard());
        int score = getScore();
        do {
            System.out.println("\n Dealer is at " + score);
            System.out.println(" with the hand ");
            printCards();
            Card drawncard = deck.getCard();
            cards.add(drawncard);
            System.out.println("\n Dealer draws ");
            System.out.println(drawncard);
            score = getScore();
        } while (score <= 17);
        return score;
    }

    private Integer getScore() {
        int score = 0;
        for (Card card : cards) {
            score += card.value;
        }
        return score;
    }

    public void printCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
