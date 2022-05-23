package com.jetbrains.ch8;

import java.util.ArrayList;
import java.util.List;

public class DeckTest {
    public static void main(String[] args) {

        List<Card> listOfCards = new ArrayList<>();

        Card kingOfDiamonds = new Card("diamond", "king", 10);
        Card queenOfDiamonds = new Card("diamond", "queen", 10);
        listOfCards.add(kingOfDiamonds);
        listOfCards.add(queenOfDiamonds);
        for (Card card : listOfCards) {
            System.out.println(card.getValue());
        }


        System.out.println(kingOfDiamonds);
        System.out.println(queenOfDiamonds);
    }
}
