package com.jetbrains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    List<Card> cards = new ArrayList<>();

    private Deck deck;

    public Player(Deck deck) {
        this.deck = deck;
    }

    public Player() {
    }

    public void printCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public Integer play() {
        cards.add(deck.getCard());
        cards.add(deck.getCard());
        boolean hit = true;
        int score = getScore();
        do {
            System.out.println("\nYou are at currently at " + score);
            System.out.println("with the hand ");
            printCards();
            System.out.println("\nHit or stay? (Hit = 1, Stay = 0)");
            String reply = scanner.nextLine();
            if (reply.equals("1")) {
                Card drawncard = deck.getCard();
                cards.add(drawncard);
                System.out.println("\nYou draw ");
                System.out.println(drawncard);
            } else {
                hit = false;
            }

            score = getScore();

        } while (hit && score <= 21);
        return score;
    }

    private Integer getScore() {
        int score = 0;
        int aces = 0;

        for (Card card : cards) {
            if (card.type.equals("ace")) {
                aces += 1;
            } else {
                score += card.value;
            }
        }

        for (int i = 0; i < aces; i++) {
            if (score > 10) {
                score += 1;
            } else {
                score += 11;
            }
        }

        return score;
    }
}

