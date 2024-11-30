package org.example;

import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Date;

public class CalculatorTest extends BaseCalculatorConfig {
    private void checkTime(){
        System.out.println("Current Time : "+new Date(System.currentTimeMillis()));
    }

    @Test(description = "verifying addition of 2 numbers",dataProvider = "dataProviderForAdditionOfTwoNumbers")
    public void verifyAdditionOfTwoNumbers(int numberOne,int numberTwo,int expected){
        checkTime();
        int actual = calculator.addTwoNumbers(numberOne,numberTwo);
        Assert.assertEquals(actual,expected,"verify 2 numbers");
    }

    @Parameters({"desiredNumber"})
    @Test
    public void demo(@Optional("1") int desiredNumber) {
        checkTime();

        try {
            Thread.sleep( 1000); // 60 seconds = 60,000 milliseconds
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted.");
//            e.printStackTrace();
        }

        System.out.println("Desired Number: " + desiredNumber);
    }

    @DataProvider(name = "dataProviderForAdditionOfTwoNumbers")
    public Object[][] dataProviderForTwoNumber(){
        return new Object[][]{
                {2,6,8},
                {1,4,5},
                {8,-3,5},
                {9,1,10}
        };
    }

}
