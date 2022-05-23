package BlackJackInheritance.BlackJackII;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Deck deck = new Deck();
        Heart heart = new Heart(Face.JACK, 10);
        Spade spade = new Spade(Face.JACK, 10);
//        Diamond diamond = new Diamond();

//        game.run();
//        game.getWinner();
        System.out.println(deck);
    }


}
