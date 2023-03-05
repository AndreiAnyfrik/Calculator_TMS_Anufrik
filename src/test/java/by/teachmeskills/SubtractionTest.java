package by.teachmeskills;

import by.teachmeskills.app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseTest {

    @Parameters({"a", "b"})
    @Test(groups = "smoke", priority = 0)
    public void positiveValueSubtractionTest(int a, int b) {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(a, b);
        Assert.assertEquals(result, 1, "Invalid result");
    }

    @Test(groups = "smoke", description = "This test describes Sub straction", priority = 1)
    public void negativeValueSubtractionTest() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(3, -1);
        Assert.assertEquals(result, 4, "Invalid result");
    }

    @Test(groups = "smoke", description = "This test describes Substraction", priority = 2)
    public void nullValueSubtractionTest() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(3, 0);
        Assert.assertEquals(result, 3, "Invalid result");
    }
}
