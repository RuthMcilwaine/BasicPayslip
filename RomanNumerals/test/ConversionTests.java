import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ConversionTests {
    Conversion conversion = new Conversion();

    @Test
    void convertInteger1ToRomanNumeral() {
        String actual = conversion.convertNumber(1);
        Assertions.assertEquals("I", actual);
    }

    @Test
    void convertInteger2ToRomanNumeral() {
        String actual = conversion.convertNumber(2);
        Assertions.assertEquals("II", actual);
    }

    @Test
    void convertInteger3ToRomanNumeral() {
        String actual = conversion.convertNumber(3);
        Assertions.assertEquals("III", actual);
    }

    @Test
    void convertInteger4ToRomanNumeral() {
        String actual = conversion.convertNumber(4);
        Assertions.assertEquals("IV", actual);
    }

    @Test
    void convertIntegers34ToRomanNumerals() {
        String actual = conversion.convertNumber(34);
        Assertions.assertEquals("XXXIV", actual);
    }

    @Test
    void convertIntegers86ToRomanNumerals() {
        String actual = conversion.convertNumber(86);
        Assertions.assertEquals("LXXXVI", actual);
    }

    @Test
    void convertIntegers50ToRomanNumerals() {
        String actual = conversion.convertNumber(50);
        Assertions.assertEquals("L", actual);
    }


}
