package com.jetbrains;

public class Game {

    public Player player;
    public Dealer dealer;


    Integer playerScore = 0;
    Integer dealerScore = 0;

    public Game(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    public String play() {

        playerScore = player.play();
        if (playerScore > 21) {
            return ( "\nYou've gone Bust" );
        }

        dealerScore = dealer.play();
        if (dealerScore > 21) {
            return ( "\nYou beat the dealer!" );
        }
        if (playerScore < 21 && dealerScore == 21) {
            return ( "\nDealer wins!" );
        }

        if (dealerScore < 21 && playerScore == 21) {
            return ( "\nYou beat the dealer!" );
        }

        if (playerScore > dealerScore) {
            return ( "\nYou beat the dealer!" );
        }

        if (playerScore < dealerScore) {
            return ( "\nDealer wins!" );
        }
        return ( "\nYou tied with the dealer, nobody wins" );
    }
}

