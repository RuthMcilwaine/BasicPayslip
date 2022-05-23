package BlackJackInheritance.BlackJackII;

public class Spade extends Card {


    public Spade(Face face, int value) {
        super(face, value);
    }

    @Override
    public String toString() {
        return "Spade{" +
                super.toString() +
                '}';
    }
}
