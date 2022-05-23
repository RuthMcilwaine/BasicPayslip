import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringReturnsZero() {
        StringCalculator s = new StringCalculator();
        int result = s.add("");
        assertEquals(0, result);
    }

    @Test
    public void singleNumStringReturnsThatNum() {
        StringCalculator s = new StringCalculator();

        int result = s.add("1");
        assertEquals(1, result);

        int result2 = s.add("3");
        assertEquals(3, result2);
    }

    @Test
    public void twoNumsStringReturnsTheSumOfNums() {
        StringCalculator s = new StringCalculator();

        int result = s.add("1,2");
        assertEquals(3, result);
        int result2 = s.add("3,5");
        assertEquals(8, result2);
    }

    @Test
    public void anyNumOfStringReturnsTheSumOfNums() {
        StringCalculator s = new StringCalculator();

        int result3 = s.add("1,2,3");
        assertEquals(6, result3);
        int result4 = s.add("3,5,3,9");
        assertEquals(20, result4);
    }

    @Test
    public void newLineBreaksAndCommasShouldInterchange() {
        StringCalculator s = new StringCalculator();

        int result5 = s.add("1,2\n3");
        assertEquals(6, result5);
        int result4 = s.add("3\n5\n3,9");
        assertEquals(20, result4);
    }
}
