package challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainVowels {

    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String reply;

        do {
            System.out.println("Enter a string");
            String input = scanner.nextLine();
            int vowelCount = 0;

            for (char charInString : input.toCharArray()) {
                for (char vowel : "AEIOUaeiou".toCharArray()) {
                    if (charInString == vowel) {
                        vowelCount++;
                        break;
                    }
                }
            }

            if (vowelCount < 2) {
                myArray.add(input);
            }

            System.out.println(myArray);
            System.out.println("Do you want to continue? Y or N");
            reply = scanner.nextLine();
        } while (reply.equals("Y"));
    }

}
//System.out.println(myArray);