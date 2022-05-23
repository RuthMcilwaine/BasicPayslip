package BlackJackInheritance.BlackJackII;


public class Game {
    private Deck deck = new Deck();
    private Player player = new Player(deck);
    private Player dealer = new Player(deck);


    public Game() {
        deck.shuffle();
    }

    public void run() {
        player.play();
        dealer.play();
        System.out.println("player score is " + player.getScore() + "\n");
        System.out.println("dealer score is " + dealer.getScore() + "\n");
    }

    public void getWinner() {
        if (player.getScore() > 21) {
            System.out.println("dealer wins");
        } else if (dealer.getScore() > 21) {
            System.out.println("player wins");
        } else if (player.getScore() == dealer.getScore()) {
            System.out.println("tie");
        } else if (player.getScore() > dealer.getScore()) {
            System.out.println("player wins");
        } else System.out.println("dealer wins");
    }
}

