package challenges;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class BasicPayslip {

    public static void main(String[] args) {
        System.out.println("Welcome to the payslip generator!\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your name:");
        String name = scanner.nextLine();

        System.out.println("Please input your surname:");
        String surname = scanner.nextLine();

        System.out.println("Please enter your annual salary:");
        int salary = Integer.parseInt(scanner.nextLine());
        BigDecimal grossIncome = new BigDecimal (salary/12);

        System.out.println("Please enter your super rate:");
        double superRate = Integer.parseInt(scanner.nextLine());
        float Percentage = (float) ( superRate / 100 );

        System.out.println("Please enter your payment start date:");
        String startDate = scanner.nextLine();

        System.out.println("Please enter your payment end date:");
        String endDate = scanner.nextLine();

        System.out.println("\n" + "Your payslip has been generated: " + "\n" +
                "Name: "+name+" "+surname+"\n"+
                "Pay Period: "+startDate+ " - "+endDate+"\n"+
                "Gross Income: "+grossIncome);

        BigDecimal incomeTax;

        if (salary <18200) {
            incomeTax = incomeTax = new BigDecimal(0);
        }
        else if (salary > 18201 && salary < 37000) {
            incomeTax = new BigDecimal(((salary - 18200) * .19) / 12);
        }
        else if (salary > 37001 && salary < 87000) {
            incomeTax = new BigDecimal((3572 + (salary - 37000)* 0.325) /12);
        }
        else if (salary > 87001 && salary < 180000) {
            incomeTax = new BigDecimal(( 19822 + (salary - 87000)* 0.37) /12);
        }
        else {
            incomeTax = new BigDecimal((54232 + (salary - 180000)* .45) /12);
        }
        System.out.println("Income Tax: "+ incomeTax.round(new MathContext(3, RoundingMode.UP)));

        BigDecimal netIncome = grossIncome.subtract(incomeTax);
        System.out.println("Net Income: "+netIncome.round(new MathContext(4, RoundingMode.DOWN)));

        BigDecimal superAnn = grossIncome.multiply(BigDecimal.valueOf(Percentage));
        System.out.println("Super: "+superAnn.round(new MathContext(3, RoundingMode.DOWN))+"\n" +
                        "Thank you for using MYOB!"
                );

    }
}
