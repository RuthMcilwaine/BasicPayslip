package BlackJackInheritance.BlackJackII;

import java.util.List;

public class Heart extends Card {

    public Heart(Face face, int value) {
        super(face, value);
    }

    @Override
    public String toString() {
        return "Heart{" +
                super.toString() +
                '}';
    }
}
