package by.teachmeskills;

import by.teachmeskills.app.Calculator;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class BaseTest {
    Calculator calculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("-------------------------- This is before suite method ----------------------------------");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("-------------------------- This is before test(tests) method ---------------------------");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("-------------------------- This is before class method ---------------------------");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("-------------------------- This is before groups method ---------------------------");
    }
    @BeforeMethod
    public void setUp(ITestContext testContext) {
        System.out.println("-------------------------- This is before test method -----------------------------------");
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("-------------------------- This is after test method -----------------------------------");
        calculator = null;
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("-------------------------- This is after suite method -----------------------------------");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("-------------------------- This is after test(tests) method ---------------------------");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("-------------------------- This is after class method ---------------------------");
    }
    @AfterGroups
    public void afterGroups() {
        System.out.println("-------------------------- This is after groups method ---------------------------");
    }
}
