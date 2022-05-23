package com.jetbrains.ch8;

class Exercises {
    public static void main(String[] args) {
//        Exercise0801();
//        Exercise0802();
//          Exercise0807();
        Exercise0808();
        Exercise0808Enum();
    }

    private static void Exercise0808() {
        Fan fan = new Fan();
        Fan fan2 = new Fan();
        fan.setSpeed(Fan.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);
        System.out.println(fan.toString());

        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }

    private static void Exercise0808Enum() {
        FanEnum fanEnum = new FanEnum();
        FanEnum fanEnum2 = new FanEnum();
        fanEnum.setSpeed(FanSpeed.FAST);
        fanEnum.setRadius(10);
        fanEnum.setColor("yellow");
        fanEnum.setOn();
        System.out.println(fanEnum.toString());

        fanEnum2.setSpeed(FanSpeed.MEDIUM);
        fanEnum2.setRadius(5);
        fanEnum2.setColor("blue");
        fanEnum2.setOff();
        System.out.println(fanEnum2.toString());
    }

//    public static void Exercise0801() {
//        Rectangle rectangle = new Rectangle(3.5, 35.9);
//        System.out.println("This is rectangle 1");
//        System.out.println("This is the area " + rectangle.getArea());
//        System.out.println("Perimeter " + rectangle.getPerimeter());
//
//        System.out.println("This is rectangle 2");
//        Rectangle rectangle2 = new Rectangle(4, 40);
//        System.out.println("This is the area " + rectangle2.getArea());
//        System.out.println("Perimeter " + rectangle2.getPerimeter());
//    }

    public static void Exercise0802() {
        Stock oracleStock = new Stock("ORCL", "Oracle Corportation");
        oracleStock.previousClosingPrice = 4.5;
        oracleStock.currentPrice = 4.35;
        System.out.println(oracleStock.getChangePercent());

        oracleStock.previousClosingPrice = 5;
        oracleStock.currentPrice = 4.5;
        System.out.println(oracleStock.getChangePercent());

        Stock appleStock = new Stock("apple", "apple corp");
        appleStock.previousClosingPrice = 4.5;
        appleStock.currentPrice = 3.5;
        System.out.println(appleStock.getChangePercent());

    }

    private static void Exercise0807() {
        Account account = new Account(1122, 20000);

        Account account1 = new Account(1234, 10000);
        System.out.println("Bal $" + account.getBalance());
        account.withdrawal(2500);
        System.out.println(" $" + account.getBalance() + " balance after withdrawal.");
        account.deposit(3000);
        System.out.println(" $" + account.getBalance() + " balance after deposit.");
        System.out.println(account.getMonthlyInterestRate(4.5) + " % monthly interest rate. ");
        System.out.println("Date created " + account.getDateCreated());
        System.out.println("bal of acc1 " + account1.getBalance());
        System.out.println("date of acc1 " + account1.getDateCreated());

    }
}

