package BlackJackInheritance.BlackJackII;

public abstract class Card {
    Face face;
    static int value;

    public Card(Face face, int value) {
        this.face = face;
        this.value = value;
    }

    public Card() {

    }

    @Override
    public String toString() {
        return this.face + ", " + this.value;
    }

    //use face value + 1 and remove value as a instance?
    public static int getValue() {
        return value;
    }

}