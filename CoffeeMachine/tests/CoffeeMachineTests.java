import com.jetbrains.CoffeeMachine;
import com.jetbrains.Drink;
import com.jetbrains.Order;
import com.jetbrains.Report;
import org.junit.Assert;
import org.junit.Test;

public class CoffeeMachineTests {

    @Test
    public void canCreateACoffeeMachine() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        String actual = coffeeMachine.toString();
        //Assert
        Assert.assertEquals("I am a Coffee Machine", actual);
    }

    @Test
    public void canChooseTea() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setDrink("1");
        coffeeMachine.setCashAmount(1f);
        String actual = coffeeMachine.getDrinkOrder().displayOrder();
        //Assert
        Assert.assertEquals("T::", actual);
    }

    @Test
    public void canChooseCoffee() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setDrink("2");
        coffeeMachine.setCashAmount(1f);
        String actual = coffeeMachine.getDrinkOrder().displayOrder();
        //Assert
        Assert.assertEquals("C::", actual);
    }

    @Test
    public void canChooseHotChoc() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setDrink("3");
        coffeeMachine.setCashAmount(1f);
        String actual = coffeeMachine.getDrinkOrder().displayOrder();
        //Assert
        Assert.assertEquals("H::", actual);
    }

    @Test
    public void teaIsHotDrink() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setDrink("1");
        //Assert
        Assert.assertTrue(coffeeMachine.isHotDrink());
    }

    @Test
    public void canChooseOjuice() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setDrink("4");
        coffeeMachine.setCashAmount(1f);
        String actual = coffeeMachine.getDrinkOrder().displayOrder();
        //Assert
        Assert.assertEquals("O::", actual);
    }

    @Test
    public void oJuiceIsNotHotDrink() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setDrink("4");
        //Assert
        Assert.assertFalse(coffeeMachine.isHotDrink());
    }


    @Test
    public void canChooseSugar() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setSugar("3");
        String actual = coffeeMachine.getDrinkOrder().displayOrder();
        //Assert
        Assert.assertEquals(":3:0", actual);
    }

    @Test
    public void whenNoSugarThenContainsNoTouillette() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setSugar("0");
        String actual = coffeeMachine.getDrinkOrder().displayOrder();
        //Assert
        Assert.assertEquals("::", actual);
    }

    @Test
    public void whenSugarIsIncludedThenContainsTouillette() {
        //Arrange
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Act
        coffeeMachine.setSugar("3");
        String actual = coffeeMachine.getDrinkOrder().displayOrder();
        //Assert
        Assert.assertEquals(":3:0", actual);
    }

    @Test
    public void canGetDrinkOrderWithCorrectCashAmount() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setDrink("2");
        coffeeMachine.setCashAmount(1.0f);
        String actual = coffeeMachine.getDrinkOrder().displayOrder();

        Assert.assertEquals("C::", actual);
    }

    @Test
    public void displaysErrorWithIncorrectCashAmount() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setDrink("2");
        coffeeMachine.setCashAmount(.2f);
        String actual = coffeeMachine.getDrinkOrder().displayOrder();

        Assert.assertEquals("M:missing amount is 0.40000004", actual);
    }

    @Test
    public void canGetDrinkCost() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setDrink("2");

        float actual = coffeeMachine.getDrinkOrder().getCost();

        Assert.assertEquals(.6f, actual, 0);
    }

    @Test
    public void canChooseExtraHotDrink() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setDrink("2");
        coffeeMachine.setHot("Y");
        coffeeMachine.setCashAmount(1f);

        String actual = coffeeMachine.getDrinkOrder().displayOrder();

        Assert.assertEquals("Ch::", actual);
    }

    @Test
    public void canChooseNotExtraHotDrink() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setDrink("2");
        coffeeMachine.setHot("N");
        coffeeMachine.setCashAmount(1f);

        String actual = coffeeMachine.getDrinkOrder().displayOrder();

        Assert.assertEquals("C::", actual);
    }

    @Test
    public void produceCorrectReportForOneTea() {
        Report report = new Report();
        Order order = new Order();

        order.setDrink(Drink.Tea);
        order.setCost(1f);

        report.addOrder(order);
        String actual = report.displayReport();

        Assert.assertEquals("Total drinks ordered: 1 tea, 0 coffee, 0 hot chocolate, 0 orange juice, \n" +
                "Total money earned: $ 1.0\n", actual);
    }
    @Test
    public void produceCorrectReportForOneCoffee() {
        Report report = new Report();
        Order order = new Order();

        order.setDrink(Drink.Coffee);
        order.setCost(1f);

        report.addOrder(order);
        String actual = report.displayReport();

        Assert.assertEquals("Total drinks ordered: 0 tea, 1 coffee, 0 hot chocolate, 0 orange juice, \n" +
                "Total money earned: $ 1.0\n", actual);
    }
    @Test
    public void produceCorrectReportForOneHotChoc() {
        Report report = new Report();
        Order order = new Order();

        order.setDrink(Drink.HotChoc);
        order.setCost(1f);

        report.addOrder(order);
        String actual = report.displayReport();

        Assert.assertEquals("Total drinks ordered: 0 tea, 0 coffee, 1 hot chocolate, 0 orange juice, \n" +
                "Total money earned: $ 1.0\n", actual);
    }
    @Test
    public void produceCorrectReportForOneOJuice() {
        Report report = new Report();
        Order order = new Order();

        order.setDrink(Drink.OJuice);
        order.setCost(1f);

        report.addOrder(order);
        String actual = report.displayReport();

        Assert.assertEquals("Total drinks ordered: 0 tea, 0 coffee, 0 hot chocolate, 1 orange juice, \n" +
                "Total money earned: $ 1.0\n", actual);
    }

    @Test
    public void toStringOnDrink() {

        String actual = Drink.Coffee.toString();
        Assert.assertEquals("Coffee",actual);
    }
}


