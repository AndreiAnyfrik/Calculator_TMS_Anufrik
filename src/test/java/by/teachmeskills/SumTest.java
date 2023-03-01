package by.teachmeskills;

import by.teachmeskills.app.Calculator;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {
    @Test(dataProvider = "validValue")
    public void positiveSum(int a, int b, int expValue) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(a, b);
        Assertions.assertThat(result).as("Invalid result of PositiveSum test").isEqualTo(expValue);
    }
    @DataProvider
    public Object[][] validValue() {
        return new Object[][] {
                {1,2,3},
                {-3,2,-1},
                {2,0,2}
        };
    }
}
