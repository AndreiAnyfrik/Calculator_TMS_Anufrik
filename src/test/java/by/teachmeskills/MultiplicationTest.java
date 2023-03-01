package by.teachmeskills;

import by.teachmeskills.app.Calculator;
import by.teachmeskills.utils.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest{
    @Test(dataProvider = "validValue",retryAnalyzer = RetryAnalyzer.class)
    public void positiveMultiplication(int a, int b, int expValue) {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(a,b);
        Assert.assertEquals(result,expValue,"Invalid result");
    }
    @DataProvider
    public Object[][] validValue() {
        return new Object[][] {
                {1,3,3},
                {-5,2,-10},
                {2,0,0}
        };
    }
}
