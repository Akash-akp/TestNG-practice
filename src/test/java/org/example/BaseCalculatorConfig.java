package org.example;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseCalculatorConfig {
    static Calculator calculator;

    @BeforeSuite(description = "setting up calculator")
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterSuite(description = "cleaning up")
    public void tearDown(){
        calculator = null;
    }
}
