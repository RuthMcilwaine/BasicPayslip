import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

    @Test
    public void getNextReturns1AfterOneCall() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("1", fizzBuzz.getNext());
    }

    @Test
    public void getNextReturns2AfterTwoCalls() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.getNext();
        Assertions.assertEquals("2", fizzBuzz.getNext());
    }

    @Test
    public void getNextReturnsFizzAfterThreeCalls() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.getNext(); fizzBuzz.getNext();
        Assertions.assertEquals("Fizz", fizzBuzz.getNext());
    }

    @Test
    public void getNextReturnsBuzzAfterFiveCalls() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 4; i++) {
            fizzBuzz.getNext();
        }
        Assertions.assertEquals("Buzz", fizzBuzz.getNext());
    }

    @Test
    public void getNextReturnsFizzBuzzAfterFifteenCalls() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 14; i++) {
            fizzBuzz.getNext();
        }
        Assertions.assertEquals("FizzBuzz", fizzBuzz.getNext());
    }


    @Test
    public void acceptanceTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("1", fizzBuzz.getNext());
        Assertions.assertEquals("2", fizzBuzz.getNext());
        Assertions.assertEquals("Fizz", fizzBuzz.getNext());
        Assertions.assertEquals("4", fizzBuzz.getNext());
        Assertions.assertEquals("Buzz", fizzBuzz.getNext());
        Assertions.assertEquals("Fizz", fizzBuzz.getNext());
        Assertions.assertEquals("7", fizzBuzz.getNext());
        Assertions.assertEquals("8", fizzBuzz.getNext());
        Assertions.assertEquals("Fizz", fizzBuzz.getNext());
        Assertions.assertEquals("Buzz", fizzBuzz.getNext());
        Assertions.assertEquals("11", fizzBuzz.getNext());
        Assertions.assertEquals("Fizz", fizzBuzz.getNext());
        Assertions.assertEquals("13", fizzBuzz.getNext());
        Assertions.assertEquals("14", fizzBuzz.getNext());
        Assertions.assertEquals("FizzBuzz", fizzBuzz.getNext());

    }
}
