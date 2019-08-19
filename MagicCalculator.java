package challenges;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.System.in;

public class MagicCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the magic year calculator!");

        Scanner scanner = new Scanner(in);

        System.out.println("Please input your name:");
        String name = scanner.nextLine();

        System.out.println("Please input your surname:");
        String surname = scanner.nextLine();

        System.out.println("Please enter your annual salary:");
        BigDecimal salary = new BigDecimal (scanner.nextInt()/12);

        System.out.println("Please enter your work start year :");
        int MagicYear = (scanner.nextInt()+ 65) ;

        System.out.println("Your magic age details are:");
        System.out.println("Name:"+name+" "+surname);
        System.out.println("Monthly Salary:"+salary);
        System.out.println("Magic Year:"+MagicYear);

    }
}
