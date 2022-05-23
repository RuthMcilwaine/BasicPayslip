import java.util.HashMap;
import java.util.Map;

public class Conversion {


    public static Map<String, String> numberValues;

    static {
        numberValues = new HashMap<>();
        numberValues.put("1", "I");
        numberValues.put("2", "II");
        numberValues.put("3", "III");
        numberValues.put("4", "IV");
        numberValues.put("5", "V");
        numberValues.put("6", "VI");
        numberValues.put("7", "VII");
        numberValues.put("8", "VIII");
        numberValues.put("9", "IX");
        numberValues.put("10", "X");
        numberValues.put("20", "XX");
        numberValues.put("30", "XXX");
        numberValues.put("40", "XL");
        numberValues.put("50", "L");
        numberValues.put("60", "LX");
        numberValues.put("70", "LXX");
        numberValues.put("80", "LXXX");
        numberValues.put("90", "XC");
        numberValues.put("100", "C");

    }


    public String convertNumber(int num) {

        if (isTwoDigits(num)) {

            String firstDigit = getFirstDigit(num);
            String firstDigitValue = numberValues.get(firstDigit);
            String secondDigit = getSecondDigit(num);
            String secondDigitValue = "";

            if (!secondDigit.equals("0"))
                secondDigitValue = numberValues.get(secondDigit);

            return firstDigitValue + secondDigitValue;
        }
        return numberValues.get(String.valueOf(num));
    }


    private boolean isTwoDigits(int num) {
        int length = String.valueOf(num).length();
        return length == 2;
    }

    String getFirstDigit(int num) {

        String firstDigit = String.valueOf(num).substring(0, 1);
        return firstDigit.concat("0");
    }

    String getSecondDigit(int num) {

        return String.valueOf(num).substring(1);

    }
}
