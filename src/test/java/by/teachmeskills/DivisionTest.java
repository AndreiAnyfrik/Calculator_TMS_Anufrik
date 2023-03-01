package by.teachmeskills;

import by.teachmeskills.app.Calculator;
import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {
    @Test(dataProvider = "division")
    public void positiveDivision(int a, int b, int expValue) {
        Calculator calculator = new Calculator();
        int result = calculator.division(a, b);
        Assertions.assertThat(result).as("Invalid result of PositiveSum test").isEqualTo(expValue);
    }

    @DataProvider
    public Object[][] division() {
        return new Object[][]{
                {0, 3, 0},
                {10, 2, 5},
                {-8,2,-4}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divisionException() {
        Calculator calculator = new Calculator();
        calculator.division(1, 0);
    }
}
