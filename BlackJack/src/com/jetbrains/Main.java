package com.jetbrains;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        Player player = new Player(deck);
        Dealer dealer = new Dealer(deck);

        Game game = new Game(player, dealer);

        String result = game.play();
        System.out.println(result);
    }
}
