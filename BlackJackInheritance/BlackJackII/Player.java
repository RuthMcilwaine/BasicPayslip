package BlackJackInheritance.BlackJackII;

public class Player {
    private Deck deck;
    private int score = 0;

    public Player(Deck deck) {
        this.deck = deck;
    }


    public void play() {
        while (score < 17) {
            Card card = deck.getCard();
            score = score + card.getValue();
            System.out.println(card);
            // play {
            // take a card from the deck hit()
            // add its value to the score addScore()
            // if the score is 17 or higher, stop playing
            // }
        }
    }

    public int getScore() {
        return score;

    }

}





