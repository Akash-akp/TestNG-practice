import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeSuite(description = "setting up calculator")
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(description = "verifying addition of 2 numbers")
    public void verifyAdditionOfTwoNumbers(){
        int actual = calculator.addTwoNumbers(2,6);
        Assert.assertEquals(actual,8,"verify 2 numbers");
    }

    @AfterSuite(description = "cleaning up")
    public void clearUp(){

    }
}
