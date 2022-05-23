package BlackJackII;

public class Card {
    private Face face;
    private int value;
    private Suit suit;

    public Card(Face face, int value, Suit suit) {
        this.face = face;
        this.value = value;
        this.suit = suit;
    }

    public Card() {

    }

    @Override
    public String toString() {
        return "Card[" +
                this.face + ", " + this.value + ", " + this.suit + "" +
                ']';
    }

    //use face value + 1 and remove value as a instance?
    public int getValue() {
        return value;
    }

}