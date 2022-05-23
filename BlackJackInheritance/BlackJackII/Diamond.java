package BlackJackInheritance.BlackJackII;

public class Diamond extends Card {

    public Diamond(Face face, int value) {
        super(face, value);
    }

    @Override
    public String toString() {
        return "Diamond{" +
                super.toString() +
                '}';
    }
}
