package BlackJackInheritance.BlackJackII;

public class Club extends Card {

    public Club(Face face, int value) {
        super(face, value);

    }

    @Override
    public String toString() {
        return "Club{" +
                super.toString() +
                '}';
    }
}
