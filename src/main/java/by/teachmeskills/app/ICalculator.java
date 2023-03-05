package by.teachmeskills.app;

public interface ICalculator {

    int sum(int a, int b);

    int subtraction(int a, int b);

    int multiplication(int a, int b);

    int division(int a, int b) throws IllegalArgumentException;

    double squareRoot(int a);
}