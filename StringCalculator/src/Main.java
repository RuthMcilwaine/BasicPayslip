import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        StringCalculator s  = new StringCalculator();
        var result = s.add(input);

        System.out.println(result);
    }
}
