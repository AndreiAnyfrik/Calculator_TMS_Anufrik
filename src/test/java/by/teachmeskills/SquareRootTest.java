package by.teachmeskills;

import by.teachmeskills.app.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareRootTest extends BaseTest {
    @Test(dataProvider = "invalidValue")
    public void positiveSquareRootTest(int a, int expValue) {
        Calculator calculator = new Calculator();
        int result = (int) calculator.squareRoot(a);
        Assert.assertEquals(result, expValue, "Invalid result");
    }

    @DataProvider
    public Object[][] invalidValue() {
        return new Object[][]{
                {4, 2},
                {0,0}
        };
    }

}
